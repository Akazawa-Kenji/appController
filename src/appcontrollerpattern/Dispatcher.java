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
public class Dispatcher {

    private FrontPageView frontPageView;
    private PersonalPageView personalPageView;

    public Dispatcher() {
        frontPageView = new FrontPageView();
        personalPageView = new PersonalPageView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("PERSONAL")) {
            personalPageView.show();
        } else {
            frontPageView.show();
        }
    }
}
    

