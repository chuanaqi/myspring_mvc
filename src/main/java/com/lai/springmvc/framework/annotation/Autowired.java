package com.lai.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: laiweigeng
 * @Date: 2018/10/8 15:24
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {
    String value() default "";
}
