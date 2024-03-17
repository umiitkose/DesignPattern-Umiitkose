package com.umiitkose.behavioral.templatemethod.report;

public class JsonReport extends ReportTemplate {
    @Override
    String createPathForFile() {
        return "test.json";
    }

    @Override
    void loadData() {
        System.out.println("Json data yüklendi");
    }
}
