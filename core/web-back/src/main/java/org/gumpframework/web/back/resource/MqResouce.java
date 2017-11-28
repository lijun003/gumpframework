package org.gumpframework.web.back.resource;


import org.gumpframework.web.base.BaseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.gumpframework.service.BackUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class MqResouce extends BaseResource {

    @Autowired
    private BackUserService backUserService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "hello test";
    }
}
