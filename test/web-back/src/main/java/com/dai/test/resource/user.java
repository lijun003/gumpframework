package com.dai.test.resource;

import org.gumpframework.web.base.BaseResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class user extends BaseResource{
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return  "test module";
    }
}
