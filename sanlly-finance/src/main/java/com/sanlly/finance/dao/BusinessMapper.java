package com.sanlly.finance.dao;

import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    long countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}