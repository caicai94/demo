package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cai
 * @date 2018/12/15 0015 - 0:01
 */
@RestController
public class HelloController {

    @RequestMapping("/getName")
    public Map<String, Object> getName(){
        return new HashMap<String, Object>(){{
            put("name", "apple");
        }};
    }
}
