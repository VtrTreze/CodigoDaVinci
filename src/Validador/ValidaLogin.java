/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

/**
 *
 * @author Samsung
 */
public class ValidaLogin {
    
    private final String user;
    private final String password;
    
    public ValidaLogin (String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public boolean fazerLogin () {
        
        boolean retorno = "admin".equals(this.user) && "123".equals(this.password);
        
        return retorno;
    }
    
}
