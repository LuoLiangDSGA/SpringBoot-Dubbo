package org.springboot.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springboot.dubbo.consumer.service.ConsumerService;
import org.springboot.dubbo.provider.service.DubboService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2018/1/8
 **/
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Reference(interfaceClass = DubboService.class)
    DubboService dubboService;

    @Override
    public String register(String id) {
        return dubboService.register(id);
    }

}
