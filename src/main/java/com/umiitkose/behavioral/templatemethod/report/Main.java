package com.umiitkose.behavioral.templatemethod.report;

public class Main {
    public static void main(String[] args) {
        ReportTemplate jsonReport=new JsonReport();
        jsonReport.createReport();

        ReportTemplate xmlReport = new XmlReport();
        xmlReport.createReport();
    }
}
