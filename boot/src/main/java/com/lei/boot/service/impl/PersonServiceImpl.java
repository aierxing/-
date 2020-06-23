package com.lei.boot.service.impl;

import com.lei.boot.dao.Person;
import com.lei.boot.mapper.PersonMapper;
import com.lei.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-11 8:37
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insertPerson(Person person) {
        return personMapper.insert(person);
    }
}
