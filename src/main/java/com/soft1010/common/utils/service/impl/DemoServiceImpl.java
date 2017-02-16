package com.soft1010.common.utils.service.impl;

import com.soft1010.common.utils.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/16 11:21
 * @Description:
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Value("${first_name}")
    private String firstName;
    @Value("${last_name}")
    private String lastName;

    @Override
    public String handleName() {
        if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName)) {
            return firstName + lastName;
        }
        return "";
    }
}
