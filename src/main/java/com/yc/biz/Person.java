package com.yc.biz;


import com.Showable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//java bean 规范
public class Person implements Showable {
    private String name;
    private int age;

    public Person(){
        System.out.println("无参的构造方法");
    }

    public Person(String name){
        int x;
        this.name = name;
        System.out.println("有参构造方法");

        Date d = new Date();
        d.getYear();

        Map map = new HashMap();
        map.put("a", "b");
        Object o = map.get("a");
    }


    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
