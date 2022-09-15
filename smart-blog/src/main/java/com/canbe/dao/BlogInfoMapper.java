package com.canbe.dao;

import com.canbe.entity.BlogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-09-06 07:14
 */
@Mapper
@Repository
public interface BlogInfoMapper {

    List<BlogInfo> getList();
}
