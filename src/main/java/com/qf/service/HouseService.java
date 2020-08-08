package com.qf.service;

import com.qf.pojo.House;

import java.util.List;

public interface HouseService {
    List<House> findAll(String type2, String info);

}
