package com.canbe.service.impl;

import com.canbe.dao.BlogInfoMapper;
import com.canbe.entity.BlogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.canbe.service.BlogInfoService;

import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-09-06 07:22
 */
@Service
public class BlogInfoServiceImpl implements BlogInfoService {

    @Autowired
    BlogInfoMapper blogInfoMapper;

    @Override
    public List<BlogInfo> getList() {
        return blogInfoMapper.getList();
    }
}
