package com.qfedu.mapper;

import com.qfedu.domain.MovieYear;

public interface MovieYearMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieYear record);

    int insertSelective(MovieYear record);

    MovieYear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieYear record);

    int updateByPrimaryKey(MovieYear record);
}