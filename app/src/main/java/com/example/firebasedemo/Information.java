package com.example.firebasedemo;

public class Information {
    private String branch;
    private String name;


    public Information() {

    }

    public Information(String branch, String name) {
        this.branch = branch;
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

