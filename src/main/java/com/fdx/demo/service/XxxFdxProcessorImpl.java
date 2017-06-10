package com.fdx.demo.service;

import com.fdx.demo.dto.FdxDto;
import com.fdx.demo.registry.FdxProcessorRegistry;
import org.springframework.stereotype.Service;

@Service
public class XxxFdxProcessorImpl extends AbstractFdxProcessor{
    @Override
    public void process(FdxDto<?> fdxDto) {
        //do business
    }

    @Override
    protected FdxProcessorRegistry.FdxKeyPair getKeyPair() {
        return new FdxProcessorRegistry.FdxKeyPair("XXX","XXX");
    }
}
