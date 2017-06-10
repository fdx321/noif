package com.fdx.demo.service;

import com.fdx.demo.dto.FdxDto;

public interface FdxProcessor {
    void process(FdxDto<?> fdxDto);
}
