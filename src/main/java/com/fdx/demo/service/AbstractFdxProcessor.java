package com.fdx.demo.service;

import com.fdx.demo.registry.FdxProcessorRegistry;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractFdxProcessor implements FdxProcessor, InitializingBean, BeanNameAware {
    @Autowired
    private FdxProcessorRegistry fdxProcessorRegistry;

    protected String beanName;

    public void setBeanName(String name) {
        beanName = name;
    }

    protected abstract FdxProcessorRegistry.FdxKeyPair getKeyPair();

    @Override
    public void afterPropertiesSet() throws Exception {
        fdxProcessorRegistry.put(getKeyPair(), beanName);
    }
}
