package com.lei.boot.service;

import com.lei.boot.dao.Person;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-11 8:36
 */
public interface PersonService {
    // 增加一个Person
    int insertPerson(Person person);
}
