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
public class controller {

    private Dispatcher dispatcher;

    public controller() {
        dispatcher = new Dispatcher();
    }

    private boolean verifyUser() {
        System.out.println("Verified");
        return true;
    }

    private void traceRequest(String request) {
        System.out.println("You requested:" + request);
    }

    public void dispatcherRequest(String request) {
        traceRequest(request);

        if (verifyUser()) {
            dispatcher.dispatch(request);
        }

    }

}
