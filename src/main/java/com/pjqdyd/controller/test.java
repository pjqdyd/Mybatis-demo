package com.pjqdyd.controller;

import com.pjqdyd.dao.BgmMapper;
import com.pjqdyd.pojo.Bgm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller层
 */
@RestController
public class test {
    //@Resources
    @Autowired
    private BgmMapper bgmMapper;

    /**
     * 测试是否可以访问数据库
     * @return
     */
    @RequestMapping("/test")
    public String test(){
       Bgm bgm = bgmMapper.selectByPrimaryKey("18052674D26HH32P");
        System.out.println(bgm.getId());
        return "hello";
    }
}
