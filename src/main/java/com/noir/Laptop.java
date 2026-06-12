package com.noir;

import org.springframework.stereotype.Component;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object created.");
    }

    public void compile(){
        System.out.println("Compiling using Laptop..");
    }
}
