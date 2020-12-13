package Controller;

import Model.loginModel;

public class loginController {
        public static boolean isValidLogin(String username, String password){
            loginModel loginmodel = new loginModel(username, password);
            return loginmodel.isValidUser();
        }
    }

