package com.higgsup.service;

import com.higgsup.annotations.Custom;

@Custom
public class StudentService {
    private String name;

    public String getName() {
        return "thành";
    }

    public void setName(String name) {
        this.name = name;
    }
}
