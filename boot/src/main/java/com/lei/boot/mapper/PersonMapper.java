package com.lei.boot.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lei.boot.dao.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-11 8:34
 */
@Repository
public interface PersonMapper extends BaseMapper<Person> {
    void selectList(QueryWrapper<Object> name);
}
