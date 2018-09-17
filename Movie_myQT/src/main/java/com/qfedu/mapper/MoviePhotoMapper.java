package com.qfedu.mapper;

import com.qfedu.domain.MoviePhoto;

public interface MoviePhotoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoviePhoto record);

    int insertSelective(MoviePhoto record);

    MoviePhoto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoviePhoto record);

    int updateByPrimaryKey(MoviePhoto record);
}