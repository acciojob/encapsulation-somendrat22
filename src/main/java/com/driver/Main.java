package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "Somendra";
//        System.out.println(rwOnly.name);
        rwOnly.setName("Somendra");
        System.out.println(rwOnly.getName());
    }
}