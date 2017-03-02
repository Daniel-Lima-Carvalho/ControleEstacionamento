package model;

import view.LoginView;

/**
 *
 * @author daniel
 */
public class LoginModel {
    
    public int verificar(LoginView view){
    
        if(view.getEmailUsu().equals("daniellima2297@gmail.com") && view.getSenhaUsu().equals("123")){
            return 1;
        }
        return 0;
    }
}
