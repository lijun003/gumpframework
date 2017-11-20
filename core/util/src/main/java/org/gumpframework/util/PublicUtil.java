package org.gumpframework.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * 全局工具类 create by GumpDai
 */
public class PublicUtil {


    public static boolean isEmpty(Object obj){
        if (obj == null){
            return true;
        }
        if (obj instanceof  String){
            return obj.equals("");
        }else if (obj instanceof Collection<?>){
            Collection collection = (Collection) obj;
            return collection.size() == 0;
        }else if (obj instanceof Map){
            Map map = (Map) obj;
            return map.size() == 0;
        }else if (obj.getClass().isArray()){
            return Array.getLength(obj) == 0;
        }else {
            return false;
        }
    }

    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }
}
