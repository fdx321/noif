package com.fdx.demo.resource;

import com.fdx.demo.dto.FdxDto;
import com.fdx.demo.registry.FdxProcessorRegistry;
import com.fdx.demo.registry.FdxProcessorRegistry.FdxKeyPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FdxResource {
    @Autowired
    private FdxProcessorRegistry fdxProcessorRegistry;

    @ResponseBody
    @RequestMapping(value = "/fdx", method = RequestMethod.POST)
    public void doFdx(FdxDto fdxDto) {
        fdxProcessorRegistry.get(new FdxKeyPair(fdxDto.getProductCategory(), fdxDto.getProductSubCategory())).process(fdxDto);
    }
}
