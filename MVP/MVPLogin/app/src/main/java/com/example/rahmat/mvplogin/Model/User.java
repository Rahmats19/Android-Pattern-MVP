package com.example.rahmat.mvplogin.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int isValidData() {
        //1. Check email is empty
        //2. Check email is matches pattern
        //3. Check password length > 6

/*
        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() > 6;
*/


        //0. Check email is empty
        //1. Check email is matches pattern
        //2. Check password length > 6

        if(TextUtils.isEmpty(getEmail()))
            return 0;
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 1;
        else if (getPassword().length() <= 6)
            return 2;
        else
            return -1;


    }
}
