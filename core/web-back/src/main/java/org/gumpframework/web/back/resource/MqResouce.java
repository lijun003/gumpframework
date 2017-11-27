package org.gumpframework.web.back.resource;

import org.gumpframework.util.LogUtil;
import org.gumpframework.web.base.BaseResource;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class MqResouce extends BaseResource{

    private final Logger logger = LogUtil.getLogger(MqResouce.class);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        
        return "hello test";
    }
}
