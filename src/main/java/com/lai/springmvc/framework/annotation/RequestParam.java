package com.lai.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: laiweigeng
 * @Date: 2018/10/8 15:26
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";

    boolean required() default true;
}
