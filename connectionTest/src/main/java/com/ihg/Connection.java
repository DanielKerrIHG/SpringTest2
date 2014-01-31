/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ihg;

import java.io.IOException;

/**
 *
 * @author KerrDa
 */
public class Connection implements ConnectionInterface{
    public void send(String message) throws IOException{
        System.out.println("HELLO");
    }
    
    public String receive() throws IOException{
        System.out.println("HELLO");
        return "HELLO";
    }
}
