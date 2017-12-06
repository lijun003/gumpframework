package org.gumpframework.web.base;


import lombok.extern.slf4j.Slf4j;
import org.gumpframework.util.PublicUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Slf4j
public class BaseResource {

    @ExceptionHandler
    public String bindException(Exception e, HttpServletRequest request, HttpServletResponse response){
        log.error("请求连接:{} 操作异常:{}",request.getRequestURI(),e.getMessage());


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
            log.info("write:{}",str);
            response.getWriter().write(str);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
