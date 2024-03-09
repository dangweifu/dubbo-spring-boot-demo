package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoInterface;

@DubboService
public class DemoInterfaceImpl implements DemoInterface {

    @Override
    public String say(String words) {
        return words;
    }
}
