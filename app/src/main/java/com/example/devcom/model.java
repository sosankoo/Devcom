package com.example.devcom;

public class model
{
    String full_name, branch;
model()
       {

        }

        public model(String full_name, String branch) {
        this.full_name = full_name;
        this.branch = branch;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}


