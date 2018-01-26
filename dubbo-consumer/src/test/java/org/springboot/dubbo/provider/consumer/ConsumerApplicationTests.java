package org.springboot.dubbo.provider.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.starcor.content.facade.ComboProductStaticDataCountFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {
    @Reference(interfaceClass = ComboProductStaticDataCountFacade.class)
    ComboProductStaticDataCountFacade facade;

    @Test
    public void test() {
        System.out.println(facade.test());
    }

}
