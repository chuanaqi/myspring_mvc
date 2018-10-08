package com.lai.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: laiweigeng
 * @Date: 2018/10/8 15:25
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
