package com.noir;

import org.springframework.stereotype.Component;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop Object created.");
    }

    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
