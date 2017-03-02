package model;

import view.LoginView;

/**
 *
 * @author daniel
 */
public class LoginModel {
    
    public int verificar(LoginView view){
    
        if(view.getEmailUsu().equals("d") && view.getSenhaUsu().equals("d")){
            return 1;
        }
        return 0;
    }
}
