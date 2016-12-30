package com.jd.testNG.demo;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class CustomReporter implements IReporter {
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        for (ISuite suite : suites) {
            String suiteName = suite.getName();
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult iSuiteResult : suiteResults.values()) {
                ITestContext iTestContext = iSuiteResult.getTestContext();
                System.out.println("Passed tests for suite '" + suiteName +
                        "' is:" + iTestContext.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName +
                        "' is:" +
                        iTestContext.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName +
                        "' is:" +
                        iTestContext.getSkippedTests().getAllResults().size());
            }
        }
    }
}
