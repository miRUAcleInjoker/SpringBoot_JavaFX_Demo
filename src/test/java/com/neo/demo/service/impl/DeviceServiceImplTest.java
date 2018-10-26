package com.neo.demo.service.impl;

import com.neo.demo.mapper.DeviceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeviceServiceImplTest {

    @Autowired
    private DeviceMapper deviceMapper;

    @Test
    public void selectById() {
        System.out.println(deviceMapper.selectById(""));
    }
}