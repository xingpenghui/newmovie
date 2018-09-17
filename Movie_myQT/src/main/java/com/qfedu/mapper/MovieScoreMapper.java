package com.qfedu.mapper;

import com.qfedu.domain.MovieScore;

public interface MovieScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieScore record);

    int insertSelective(MovieScore record);

    MovieScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieScore record);

    int updateByPrimaryKeyWithBLOBs(MovieScore record);

    int updateByPrimaryKey(MovieScore record);
}