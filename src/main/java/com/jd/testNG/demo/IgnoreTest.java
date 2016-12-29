package com.jd.testNG.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
    String message="json";
    MessageUtil messageUtil=new MessageUtil(message);
    @Test(enabled = false)//忽略该用例
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "json";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "json";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
