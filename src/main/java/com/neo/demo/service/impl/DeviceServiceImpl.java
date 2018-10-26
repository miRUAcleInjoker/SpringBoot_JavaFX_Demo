package com.neo.demo.service.impl;

import com.neo.demo.mapper.DeviceMapper;
import com.neo.demo.pojo.Device;
import com.neo.demo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public Device selectById(String id) {
        return deviceMapper.selectById(id);
    }
}
