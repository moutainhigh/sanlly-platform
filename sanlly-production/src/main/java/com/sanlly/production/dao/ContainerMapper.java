package com.sanlly.production.dao;

import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerMapper {
    long countByExample(ContainerExample example);

    int deleteByExample(ContainerExample example);

    int deleteByPrimaryKey(String prodContainerId);

    int insert(Container record);

    int insertSelective(Container record);

    List<Container> selectByExample(ContainerExample example);

    Container selectByPrimaryKey(String prodContainerId);

    int updateByExampleSelective(@Param("record") Container record, @Param("example") ContainerExample example);

    int updateByExample(@Param("record") Container record, @Param("example") ContainerExample example);

    int updateByPrimaryKeySelective(Container record);

    int updateByPrimaryKey(Container record);
}