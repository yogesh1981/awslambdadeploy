package com.mycompany.app;

public class ClassNotFoundException {
    private static final String CLASSTest = "example.Hello";

    public static void main(String[]  args) throws Exception{
        System.out.println("Exception resolution");
        Class.forName(CLASSTest);
    }
}
