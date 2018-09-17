package com.qfedu.mapper;

import com.qfedu.domain.MovieAndType;

public interface MovieAndTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieAndType record);

    int insertSelective(MovieAndType record);

    MovieAndType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieAndType record);

    int updateByPrimaryKey(MovieAndType record);
}