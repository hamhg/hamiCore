package com.hami.sys.support;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * <li>Program Name : BizService
 * <li>Description  :
 * <li>History      : 2018. 1. 15.
 * </pre>
 *
 * @author HHG
 */
@Component
public class BizService {
    public final Logger log = LoggerFactory.getLogger(this.getClass());
    
    @SuppressWarnings("unchecked")
    public Map<String, Object> getSchParam(Map<String, Object> paramMap) {
        
        Map<String, Object> searchMap = new HashMap<String, Object>();
        if(!searchMap.isEmpty() && searchMap.containsKey("ds_search")){
            searchMap = (Map<String, Object>)paramMap.get("ds_search");
        } else {
            searchMap = paramMap;
        }
        return searchMap;
    }
}
