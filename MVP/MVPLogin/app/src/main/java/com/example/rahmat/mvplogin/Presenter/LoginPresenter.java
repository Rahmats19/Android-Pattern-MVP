package com.example.rahmat.mvplogin.Presenter;

import com.example.rahmat.mvplogin.Model.User;
import com.example.rahmat.mvplogin.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }



    @Override
    public void onLogin(String email, String password) {
        User user = new User(email,password);
        //boolean isLoginSuccess = user.isValidData();
        int loginCode = user.isValidData();

        if(loginCode == 0)
            loginView.onLoginError("You must enter your Email");
        else if (loginCode == 1)
            loginView.onLoginError("You must enter valid Email");
        else if (loginCode == 2)
            loginView.onLoginError("Password length must be greater than");
        else
            loginView.onLoginSuccess("Login Success");
    }
}
