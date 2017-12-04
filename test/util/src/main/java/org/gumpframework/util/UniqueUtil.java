package org.gumpframework.util;

import java.util.UUID;

/**
 * 唯一性生成工具类 create by GumpDai
 */
public class UniqueUtil {

    /**
     * 生成UUID  JDK自带
     * @return
     */
    public static String  uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


}
