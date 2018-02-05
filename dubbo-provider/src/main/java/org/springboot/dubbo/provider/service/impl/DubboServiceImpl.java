package org.springboot.dubbo.provider.service.impl;

import org.springboot.dubbo.provider.service.DubboService;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2018/1/8
 **/
public class DubboServiceImpl implements DubboService {

    @Override
    public String register(String id) {
        return "注册用户成功";
    }
}
