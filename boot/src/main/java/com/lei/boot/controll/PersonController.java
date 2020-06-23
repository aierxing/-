package com.lei.boot.controll;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.lei.boot.dao.Person;
import com.lei.boot.mapper.PersonMapper;
import com.lei.boot.service.PersonService;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.net.ftp.FtpDirEntry;

import java.util.Date;
import java.util.List;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-11 8:41
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping(path = "/add")
    public String add(){
        Date date = new Date();
        Person person = new Person("雷文");
        int i = personService.insertPerson(person);
        if (i==1){
            return "成功";
        }
        return "失败";
    }
}
