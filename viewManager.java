
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;

/**
 *
 * @author hp
 */
public class viewManager {

    public static Login login;
    public static exchange ex;
    
    

    private viewManager() {
    }

    public static void openLoginPage() throws IOException {
        if (login == null) {
            login = new Login();
            login.show();
        } else {
            login.show();
        }

    }

    public static void CloseLoginPage() {
        if (login != null) {
            login.close();
        }

    }
    
    public static void openExchangePage() throws IOException{
        if(ex == null){
        ex = new exchange();
        ex.show();
        
        }else{
        ex.show();
        }
    
    
    }
    
    public static void CloseExchangePage(){
    if(ex != null)
        ex.close();
    
    }
    
}
