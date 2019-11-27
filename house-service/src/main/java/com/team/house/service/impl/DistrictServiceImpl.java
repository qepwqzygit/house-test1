package com.team.house.service.impl;

import com.team.house.entity.District;
import com.team.house.entity.DistrictExample;
import com.team.house.mapper.DistrictMapper;
import com.team.house.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:ZY
 * @date:2019/10/29
 * @Time:20:38
 */
@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    public List<District> selDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
