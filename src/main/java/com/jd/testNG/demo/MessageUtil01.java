package com.jd.testNG.demo;

public class MessageUtil01 {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil01(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        int a =0;
        int b = 1/a;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
