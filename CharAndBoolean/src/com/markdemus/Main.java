package com.markdemus;

import com.sun.source.tree.ArrayAccessTree;

import java.security.KeyStore;

public class Main {

    public static void main(String[] args) {
	// width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myboolean = false;
        boolean isMale = true;

        //challenge, find code for registered character.

        char myChar2 = '\u00AE';
        System.out.println("Unicode output was: " + myChar2);

    }
}
