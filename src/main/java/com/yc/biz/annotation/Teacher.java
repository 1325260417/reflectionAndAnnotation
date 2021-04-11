package com.yc.biz.annotation;

@MyHelloWorld(name="a", age=30, ins="打球")
public class Teacher {

    @MyHelloWorld(name="a", ins="打球")
    private String name;

    @MyHelloWorld(name="a", ins="打球")
    public String show(@MyHelloWorld(name="a", ins="打球") String s){
        return null;
    }
}
