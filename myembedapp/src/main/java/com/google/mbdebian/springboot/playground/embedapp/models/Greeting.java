package com.google.mbdebian.springboot.playground.embedapp.models;

/**
 * Project: myembedapp
 * Package: com.google.mbdebian.springboot.playground.embedapp.models
 * Timestamp: 2017-03-14 23:09
 * ---
 * © 2017 Manuel Bernal Llinares <mbdebian@gmail.com>
 * All rights reserved.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
