package utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @className: WebUtils
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/1 17:32
 * @version: 1.0
 **/
public class WebUtils {
    /** 
     * @description: 使用BeanUtils对User对象进行注入，使用Map可以让该方法在Dao,Service层依然可用
     * @param: [java.util.Map, java.lang.Object] 
     * @return: void 
     * @author 23624
     * @date: 2021/5/1 17:49
     */ 
    public static <T> T copyParameterBean(Map value, T bean){
        try {
            BeanUtils.populate(bean,value);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
