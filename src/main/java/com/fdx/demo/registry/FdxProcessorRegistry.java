package com.fdx.demo.registry;


import com.fdx.demo.common.SpringContextHolder;
import com.fdx.demo.service.FdxProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FdxProcessorRegistry {

    private Map<FdxKeyPair, String> config = new HashMap<FdxKeyPair, String>();

    public void put(FdxKeyPair key, String beanName) {
        config.put(key, beanName);
    }

    public FdxProcessor get(FdxKeyPair key) {
        return SpringContextHolder.getBean(config.get(key));
    }

    public static class FdxKeyPair {
        private String productCategory;
        private String productSubCategory;

        public FdxKeyPair(String productCategory, String productSubCategory) {
            this.productCategory = productCategory;
            this.productSubCategory = productSubCategory;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public String getProductSubCategory() {
            return productSubCategory;
        }

        public void setProductSubCategory(String productSubCategory) {
            this.productSubCategory = productSubCategory;
        }

        @Override
        public int hashCode() {
            //TODO
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            //TODO
            return true;
        }
    }
}
