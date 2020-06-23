package com.lei.boot.dao;

import lombok.Data;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-11 8:33
 */
@Data
public class Person {
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
