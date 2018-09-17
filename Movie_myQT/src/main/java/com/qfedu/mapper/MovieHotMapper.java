package com.qfedu.mapper;

import com.qfedu.domain.MovieHot;

public interface MovieHotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieHot record);

    int insertSelective(MovieHot record);

    MovieHot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieHot record);

    int updateByPrimaryKey(MovieHot record);
}