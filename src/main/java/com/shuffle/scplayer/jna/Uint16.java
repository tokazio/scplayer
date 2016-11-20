package com.shuffle.scplayer.jna;

import com.sun.jna.IntegerType;

/**
 *
 * @author Tokazio
 */
public class Uint16 extends IntegerType {
    
    public Uint16(){
	super(4, true);
    }
    
    public Uint16(int v) {
    	this();
	this.setValue(v);
    }
}
