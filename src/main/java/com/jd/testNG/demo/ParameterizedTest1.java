package com.jd.testNG.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

    @Parameters({"username"})
    @Test(groups = "login")
    public void inputUsername(String username) {
        System.out.println("Input Username: " + username);
    }

    @Parameters({"password"})
    @Test
    public void inputPassword(String password) {
        System.out.println("Input Password: " + password);
    }
}
