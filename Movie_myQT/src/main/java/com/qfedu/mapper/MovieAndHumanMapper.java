package com.qfedu.mapper;

import com.qfedu.domain.MovieAndHuman;

public interface MovieAndHumanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieAndHuman record);

    int insertSelective(MovieAndHuman record);

    MovieAndHuman selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieAndHuman record);

    int updateByPrimaryKey(MovieAndHuman record);
}