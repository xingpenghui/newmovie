package com.qfedu.mapper;

import com.qfedu.domain.MovieArea;

public interface MovieAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieArea record);

    int insertSelective(MovieArea record);

    MovieArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieArea record);

    int updateByPrimaryKey(MovieArea record);
}