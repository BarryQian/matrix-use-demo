package com.qg.matrx.use.service;


import com.qg.matrx.use.ability.service.TestAbility;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private TestAbility testAbility;

    public String doTest(Integer num, String name, String identity) {
        return testAbility.doTest(name, num, identity);
    }
}
