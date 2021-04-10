package com.yc.springframework.context;

import java.lang.annotation.*;

public interface MyApplicationContext {
    public Object getBean(String id);
}
