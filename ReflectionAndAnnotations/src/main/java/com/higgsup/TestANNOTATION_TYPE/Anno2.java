package com.higgsup.TestANNOTATION_TYPE;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Anno1({"VN", "EN"})
public @interface Anno2 {
    public static final String VN = "Xin chào";
    public static final String EN = "hello";

    String value();
}
