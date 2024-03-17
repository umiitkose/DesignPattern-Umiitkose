package com.umiitkose.behavioral.templatemethod.report;

public abstract class ReportTemplate {

    public void createReport(){
        String path = createPathForFile();
        createFile(path);
        openFile(path);
        loadData();
        closeFile(path);
    }

    abstract String createPathForFile();

    public void createFile(String path){
        System.out.println(path + " isimli dosya oluşturuldu");
    }

    public void openFile(String path){
        System.out.println(path + " isimli dosya açıldı");
    }

    abstract void loadData();

    public void closeFile(String path){
        System.out.println(path + " isimli dosya kapatıldı.");
    }

}
