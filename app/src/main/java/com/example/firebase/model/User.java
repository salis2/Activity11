package com.example.firebase.model;

public class User {
    private String id, name, email;
    public User(){
        this.name = name;
        this.email = email;

    }

    public User(String name, String email) {
    }


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }
}
