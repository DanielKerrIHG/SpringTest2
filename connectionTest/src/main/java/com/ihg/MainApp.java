/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ihg;

import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author KerrDa
 */
public class MainApp {

    
    public static void main(String[] args) {
        ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");
        
        ConnectionManager cManager = (ConnectionManager) context.getBean("connectBean");
        Connection connection = cManager.getConnection();
        try{
            connection.send("Test Message");
        }catch(IOException e){
         System.out.println("SENDING IO EXCEPTION!");
        }
        
        try{
            String message = connection.receive();
            System.out.println(message);
        }catch(IOException i){
            System.out.println("RECEIVING IO EXCEPTION!");
        }
        
    }
    
}
