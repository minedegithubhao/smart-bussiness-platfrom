package com.canbe.controller;

import com.canbe.entity.BlogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-09-06 21:24
 */
@RestController
public class SmartBlogConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @GetMapping("/blog/{id}")
    public List<BlogInfo> getList(@PathVariable String id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/list", List.class);
    }
}
