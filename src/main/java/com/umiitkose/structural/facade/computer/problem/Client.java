package com.umiitkose.structural.facade.computer.problem;


import com.umiitkose.structural.facade.computer.*;

public class Client {

    private CPU cpu;
    private RAM ram;
    private HardDrive hd;
    private Display display;

    public Client() {
        cpu = new CPU();
        ram = new RAM();
        hd = new HardDrive();
        display = new Display();
    }

    public void start() {
        cpu.start();
        hd.start();
        boolean kernelLoaded = ram.loadOSKernelImage();
        while (!kernelLoaded) {
            ram.fixIt();
            kernelLoaded = ram.loadOSKernelImage();
        }

        boolean osLoaded = ram.loadOS();
        while (!osLoaded) {
            ram.fixIt();
            osLoaded = ram.loadOS();
        }

        ram.loadDrivers();
        ram.startServices();
        display.start();
        System.out.println("Computer has started.");
    }

    public static void main(String[] args) {
        new Client().start();

    }
}
