package com.jd.testNG.demo;

import org.springframework.test.util.AssertionErrors;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomListener.class})
public class MyLisenerDemo {
    @Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo(){
            Assert.assertTrue(false);
    }

    @Test(dependsOnMethods={"testMethodTwo"})
    public void testMethodThree(){
        Assert.assertTrue(true);
    }
}
