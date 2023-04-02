package org.example.OOP.seminar5.hw;


import org.example.OOP.seminar5.hw.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.start();
    }
}