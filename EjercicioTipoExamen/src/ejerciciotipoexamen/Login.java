/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotipoexamen;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author T-107
 */
public class Login extends Exception{
    String user;
    String password;
    
    public Login(String user, String password) throws Exception{
        this.user=user;
        this.password=password;
        
    }

   

public boolean verificar() throws Exception{
boolean resultado=false;
if(user.equals("examen")&&password.equals("aprobado")){
    resultado=true;
    
}else{
    throw new Exception("Reprobado");
}
return resultado;
}

   

    
}