package com.umiitkose.behavioral.templatemethod.report;

public class XmlReport extends ReportTemplate {
    @Override
    String createPathForFile() {
        return "test.xml";
    }

    @Override
    void loadData() {
        System.out.println("xml data yüklendi");
    }
}
