package com.jd.testNG.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    @DataProvider(name="userLogin")
    public Object[][] createData(){
        return new String[][]{
                { "admin", "123"},
                { "tson","456"},

        };
    }
    @Test
    public void testAdd(){
        String str="TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
    @Test(dataProvider="userLogin")
    public void pringStr(String username,String passwd){
        System.out.println(username+":"+passwd);
    }

}
