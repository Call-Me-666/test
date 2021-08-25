package com.example.postgresql_test.service;

import com.example.postgresql_test.mapper.ITestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    TestService(ITestMapper testMapper){
        int count = testMapper.getCount();
        System.out.println(count);
    }
}
