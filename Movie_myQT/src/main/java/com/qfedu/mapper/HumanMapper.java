package com.qfedu.mapper;

import com.qfedu.domain.Human;

public interface HumanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Human record);

    int insertSelective(Human record);

    Human selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKeyWithBLOBs(Human record);

    int updateByPrimaryKey(Human record);
}