package org.example;

import com.soundicly.jnanoidenhanced.jnanoid.NanoIdUtils;

public class Main {

    public static void main(String[] args) {
        String id = NanoIdUtils.randomNanoId();
        System.out.println(id);
    }

}