package com.balajiprabhu.inheritance;

abstract public class UIControl {

    public void enable() {
        System.out.println("Enabled");
    }

    // Polymorphism
    abstract public void draw();
}
