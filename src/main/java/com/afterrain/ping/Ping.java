/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afterrain.ping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conny
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Ping {
    
    private int id;
    private String from;
    private String message;
   

    public Ping() {
    }

    public Ping(int id, String from, String message) {
        this.id = id;
        this.from = from;
        this.message = message;
    }
        
}
