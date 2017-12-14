package com.company;

import java.lang.String;

public class User {

    private String email;
    private String password;

    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public String GetEmail()
    {
        return email;
    }

    public String GetPassword()
    {
        return password;
    }

}
