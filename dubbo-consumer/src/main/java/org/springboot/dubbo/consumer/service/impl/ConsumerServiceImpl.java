package org.springboot.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.starcor.content.facade.ComboProductStaticDataCountFacade;
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
    @Reference
    ComboProductStaticDataCountFacade facade;

    @Override
    public String register(String id) {
        return dubboService.register(id);
    }

    @Override
    public String test() {
        return facade.test();
    }


}
