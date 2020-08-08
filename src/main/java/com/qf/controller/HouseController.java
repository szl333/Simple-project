package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.House;
import com.qf.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("house")
@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;
    @RequestMapping("findAll")
    public Map findAll(String type2, String info, Integer page, Integer limit){
//        System.out.println(type2+":"+ info);
        PageHelper.startPage(page,limit);
        List<House> houses = houseService.findAll(type2, info);
        PageInfo<House> pageInfo = new PageInfo<>(houses);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());//分页数据
        return map;
    }
}
