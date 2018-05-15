package com.higgsup.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@CustomService
@Retention(RetentionPolicy.RUNTIME)
public @interface Custom {
}
