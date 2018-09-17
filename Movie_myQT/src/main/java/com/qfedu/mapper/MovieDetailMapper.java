package com.qfedu.mapper;

import com.qfedu.domain.MovieDetail;

public interface MovieDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieDetail record);

    int insertSelective(MovieDetail record);

    MovieDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieDetail record);

    int updateByPrimaryKeyWithBLOBs(MovieDetail record);

    int updateByPrimaryKey(MovieDetail record);
}