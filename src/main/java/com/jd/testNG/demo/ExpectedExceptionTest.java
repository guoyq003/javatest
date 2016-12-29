package com.jd.testNG.demo;

import com.jd.aop.demo.AirthmeticCalculator;
import org.apache.commons.exec.ExecuteException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    String message = "Manisha";
    MessageUtil01 messageUtil01 = new MessageUtil01(message);
    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil01.printMessage();
    }
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil01.salutationMessage());
    }
}
