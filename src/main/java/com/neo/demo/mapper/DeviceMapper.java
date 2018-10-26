package com.neo.demo.mapper;

import com.neo.demo.pojo.Device;

public interface DeviceMapper {
    int insert(Device record);

    int insertSelective(Device record);

    Device selectById(String id);
}