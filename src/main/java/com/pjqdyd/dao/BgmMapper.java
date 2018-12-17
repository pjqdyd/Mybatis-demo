package com.pjqdyd.dao;

import com.pjqdyd.pojo.Bgm;

/**
 * mapper接口(Dao),如果启动类上没有加@MappingScan("本包名")
 * 就要加@Mapping
 */
//@Mapper
public interface BgmMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bgm record);

    int insertSelective(Bgm record);

    Bgm selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bgm record);

    int updateByPrimaryKey(Bgm record);
}