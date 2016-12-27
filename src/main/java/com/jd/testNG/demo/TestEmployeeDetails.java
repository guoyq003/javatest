package com.jd.testNG.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
    EmployeeDetails employeeDetails=new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic=new EmpBusinessLogic();

    @Test
    public void testCalculateAppriasal(){
        employeeDetails.setName("tom");
        employeeDetails.setAge(26);
        employeeDetails.setMonthlySalary(9000.0);
        double appraisal=empBusinessLogic.calculateAppraisal(employeeDetails);
        Assert.assertEquals(500,appraisal,0.0,"500");
    }
    @Test
    public void testCalculateYearlySalary(){
        employeeDetails.setName("Rajeev");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000.0);
        double yearlySalary=empBusinessLogic.calculateYearlySalary(employeeDetails);
        Assert.assertEquals(96000.0,yearlySalary);
    }
}
