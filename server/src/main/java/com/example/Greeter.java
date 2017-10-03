package com.example;

public class Greeter {

final  public Greeter() {

  }

  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
