package com.higgsup.reflection.listinterface;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExampleAnnotation {
    public int id();
}
