package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/consumerUser")
public class ConsumerUserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getUserInfo.json",method = RequestMethod.GET)
    public Map getUserInfo(int id){
        Map<String,Object> result = new HashMap<String,Object>();

        result.put("data",this.restTemplate.getForObject("http://localhost:8003/user/getUserInfo.json?id="+id,Object.class));
        return result;
    }


}
