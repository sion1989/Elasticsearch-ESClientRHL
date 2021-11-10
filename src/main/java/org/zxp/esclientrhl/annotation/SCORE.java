package org.zxp.esclientrhl.annotation;

import java.lang.annotation.*;

/**
 * 获取es的返回值分数赋值到对象
 *  * author: gl
 *  * create: 2021-3-30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface SCORE {
}
