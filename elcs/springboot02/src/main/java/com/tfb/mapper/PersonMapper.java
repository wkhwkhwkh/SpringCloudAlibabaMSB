package com.tfb.mapper;

import com.tfb.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Mapper//这个注解表示这是一个mybatis的mapper类
@Repository
public interface PersonMapper {
    List<Person> query();

    int count();
}
