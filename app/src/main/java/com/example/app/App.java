package com.example.app;

import com.example.api.Messager;
import java.util.ServiceLoader;

public class App {
  public static void main(String[] args) {
    System.out.println("\u001B[33mapp start\u001B[0m");
    for (Messager messager :
          ServiceLoader.load(Messager.class)) {
      System.out.println(messager.message());
    }
  }
}
