package com.canbe.controller;

import com.canbe.entity.BlogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.canbe.service.BlogInfoService;

import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-09-06 07:24
 */
@RestController
public class BlogInfoController {

    @Autowired
    BlogInfoService blogInfoService;

    @GetMapping("/list")
    public List<BlogInfo> getList(){
        return blogInfoService.getList();
    }
}
