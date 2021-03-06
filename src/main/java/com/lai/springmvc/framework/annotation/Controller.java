package com.lai.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: laiweigeng
 * @Date: 2018/10/8 15:25
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}
