package com.umiitkose.creational.factory.employee.fm5;

import com.umiitkose.creational.factory.employee.fm1.Employee;
import com.umiitkose.creational.factory.employee.fm1.PayrollOffice;

import java.util.List;


public class Test {

    public static void main(String[] args) {
        HR hr = new HR();
        PayrollOffice po = new PayrollOffice();

        // Add more employees
        hr.addNewEmployee(EmployeeFactory.createEmployee("Ali"));
        hr.addNewEmployee(EmployeeFactory.createEmployee("Zeynep"));
        hr.addNewEmployee(EmployeeFactory.createEmployee("Turgut"));
        hr.addNewEmployee(EmployeeFactory.createManager("Selim", "Sales"));
        hr.addNewEmployee(EmployeeFactory.createManager("Handan", "Production"));
        hr.addNewEmployee(EmployeeFactory.createDirector("Ahmet", "Management", 10_000));

        hr.listEmployees();

        System.out.println();

        // Now pay time!
        List<Employee> employees = hr.getEmployees();

        for (Employee employee : employees)
            po.paySalary(employee);
    }
}
