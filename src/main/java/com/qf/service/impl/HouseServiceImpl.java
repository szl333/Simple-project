package com.qf.service.impl;

import com.qf.dao.HouseMapper;
import com.qf.pojo.House;
import com.qf.pojo.HouseExample;
import com.qf.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    @Override
    public List<House> findAll(String type2, String info) {
        House house = new House();
        if (info == null || info.equals("undefined") ){
            info = "";
        }
        if (type2.equals("hOwner")) {
            house.sethOwner(info);
        }else if (type2.equals("idcard")){
            house.setIdcard(info);
        }else {
            return houseMapper.selectByExample(null);
        }
        List<House> houses = houseMapper.selectAllByFuzzy(house);
        return houses;
    }

}
