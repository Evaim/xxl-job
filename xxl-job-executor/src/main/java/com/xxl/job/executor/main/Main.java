package com.xxl.job.executor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by Doaim on 16/6/7.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericApplicationContext();
        context.getParentBeanFactory();
    }
}
