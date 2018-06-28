/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollerpattern;

/**
 *
 * @author Crazian
 */
public class AppControllerPattern {
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        controller control = new controller();
        control.dispatcherRequest("FrontPage");
        control.dispatcherRequest("PersonalPage");
        
    }
    
}
