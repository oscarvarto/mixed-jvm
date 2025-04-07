package com.example;

public class JavaVersionPrinter {
  public static void main(String[] args) {
    System.out.println("Java version: " + System.getProperty("java.version"));
    System.out.println("Java home: " + System.getProperty("java.home"));
    System.out.println("Java vendor: " + System.getProperty("java.vendor"));
    System.out.println("Java VM version: " + System.getProperty("java.vm.version"));
  }
}
