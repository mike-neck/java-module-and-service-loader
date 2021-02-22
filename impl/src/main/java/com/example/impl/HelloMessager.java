package com.example.impl;

import com.example.api.Messager;

public class HelloMessager implements Messager {

    @Override
    public String message() {
        return "hello";
    }
}
