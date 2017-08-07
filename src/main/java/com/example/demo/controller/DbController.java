package com.example.demo.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据库连接测试
 *
 * @author 庞建华 pangjianhua@winchannel.net created on 2017-08-04 16:04
 **/
@RestController
public class DbController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/insert")
    public String insert() {
        return "";
    }


    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType() {
        String sql = "select * from ORG_USER";

        return jdbcTemplate.queryForList(sql);
    }

    @RequestMapping("/user/{id}")
    public Map<String, Object> getUser(@PathVariable String id) {
        Map<String, Object> map = null;

        List<Map<String, Object>> list = getDbType();

        for (Map<String, Object> dbmap : list) {

            Set<String> set = dbmap.keySet();

            for (String key : set) {
                if (key.equals("id")) {
                    if (dbmap.get(key).equals(id)) {
                        map = dbmap;
                    }
                }
            }
        }

        if (map == null)
            map = list.get(0);
        return map;
    }

}
