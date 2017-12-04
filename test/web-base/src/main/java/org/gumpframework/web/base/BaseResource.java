package org.gumpframework.web.base;


import org.gumpframework.util.LogUtil;
import org.gumpframework.util.PublicUtil;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseResource {

   public Logger logger = LogUtil.getLogger(this.getClass());

    @ExceptionHandler
    public String bindException(Exception e, HttpServletRequest request, HttpServletResponse response){
        logger.error("请求连接:{} 操作异常:{}",request.getRequestURI(),e.getMessage());


        String requestType = request.getHeader("X-Requested-With");

        writeJsonHttpResponse(e.getMessage().toString(),response);
        return null ;
    }


    protected void addAjaxMsg(String status,String message,HttpServletResponse response){

    }


    protected void writeJsonHttpResponse(Object object,HttpServletResponse response){
        if (PublicUtil.isEmpty(object)){
            throw new RuntimeException("WRITE_JSON_RESPONSE_NULL");
        }
        try {
            response.reset();
            response.setContentType("text/json;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            String str = object instanceof String ? (String) object : (String) object;
            logger.info("write:{}",str);
            response.getWriter().write(str);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
