/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ihg;

/**
 *
 * @author KerrDa
 */
public class ConnectionManager implements ConnectionManagerInterface{
    public Connection getConnection(){
        return new Connection();
    }
}
