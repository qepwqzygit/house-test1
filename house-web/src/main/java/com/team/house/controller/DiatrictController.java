package com.team.house.controller;

import com.team.house.entity.District;
import com.team.house.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author:ZY
 * @date:2019/10/29
 * @Time:21:30
 */
@Controller
@RequestMapping("")
public class DiatrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("selDistrict")
    public String selDistrict1(Model model){
        List<District> list =districtService.selDistrict();
        System.out.println(list.get(0));
        model.addAttribute("list",list);
        return "index";
    }
}
