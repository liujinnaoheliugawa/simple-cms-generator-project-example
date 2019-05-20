package com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorProjectExample.dao;

import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorProjectExample.pojo.TestCorInfoComInfoBasicInfoExample;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.template.dao.CmsTemplateMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 除继承关系外皆为 Mybatis 自动生成
 * @Author: LiugawaHeLiujinnao
 * @Date: 2019-05-20
 */
public interface TestCorInfoComInfoBasicInfoMapper<TestCorInfoComInfoBasicInfo, TestCorInfoComInfoBasicInfoExample> extends CmsTemplateMapper<TestCorInfoComInfoBasicInfoMapper, TestCorInfoComInfoBasicInfoExample> {
    long countByExample(TestCorInfoComInfoBasicInfoExample example);

    int deleteByExample(TestCorInfoComInfoBasicInfoExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(TestCorInfoComInfoBasicInfoMapper record);

    int insertSelective(TestCorInfoComInfoBasicInfoMapper record);

    List<TestCorInfoComInfoBasicInfoMapper> selectByExampleWithBLOBs(TestCorInfoComInfoBasicInfoExample example);

    List<TestCorInfoComInfoBasicInfoMapper> selectByExample(TestCorInfoComInfoBasicInfoExample example);

    TestCorInfoComInfoBasicInfoMapper selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") TestCorInfoComInfoBasicInfoMapper record, @Param("example") TestCorInfoComInfoBasicInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TestCorInfoComInfoBasicInfoMapper record, @Param("example") TestCorInfoComInfoBasicInfoExample example);

    int updateByExample(@Param("record") TestCorInfoComInfoBasicInfoMapper record, @Param("example") TestCorInfoComInfoBasicInfoExample example);

    int updateByPrimaryKeySelective(TestCorInfoComInfoBasicInfoMapper record);

    int updateByPrimaryKeyWithBLOBs(TestCorInfoComInfoBasicInfoMapper record);

    int updateByPrimaryKey(TestCorInfoComInfoBasicInfoMapper record);
}
