package com.balajiprabhu;

class User {

    private String name;

    User(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hi everyone, this is " + name);
    }
}
