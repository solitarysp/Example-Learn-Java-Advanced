package com.higgsup.Annotation.listAnnotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Inherited
public @interface Test2 {
    int value() default 1;
}
