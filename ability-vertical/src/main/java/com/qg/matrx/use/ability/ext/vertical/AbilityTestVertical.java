package com.qg.matrx.use.ability.ext.vertical;

import com.alibaba.fastjson2.JSON;

import com.qg.matrix.core.annotations.Extension;
import com.qg.matrx.use.ability.ext.AbilityTestExt;
import com.qg.matrx.use.ability.ext.model.TestRequest;
import com.qg.matrx.use.ability.ext.model.TestResponse;
import lombok.extern.slf4j.Slf4j;

@Extension(identity = "test",code = "test.qg",type = "Y")
@Slf4j
public class AbilityTestVertical implements AbilityTestExt {
    @Override
    public TestResponse doTest(TestRequest request) {
        log.info("垂直入参：{}", JSON.toJSONString(request));
        TestResponse extResp = (TestResponse)request.getExtMap().get("result");
        TestResponse result = new TestResponse();
        result.setResult(extResp.getResult() + ",垂直入参处理");
        return result;
    }
}
