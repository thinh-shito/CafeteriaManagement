/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.raven.main;

import com.raven.model.User;

public class App {
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        new Login().setVisible(true);
        
//            new Main(new User(1, "user", "1", "admin")).setVisible(true);

//new Signup().setVisible(true);
    }
}
