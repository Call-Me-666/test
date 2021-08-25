package com.example.postgresql_test.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface ITestMapper {
    @Select("select count(*) from user111")
    int getCount();
}
