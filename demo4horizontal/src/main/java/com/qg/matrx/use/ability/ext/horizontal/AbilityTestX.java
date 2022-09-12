package com.qg.matrx.use.ability.ext.horizontal;

import com.qg.matrix.core.annotations.Extension;
import com.qg.matrx.use.ability.ext.AbilityTestExt;
import com.qg.matrx.use.ability.ext.model.TestRequest;
import com.qg.matrx.use.ability.ext.model.TestResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Extension(identity = "test",code = "test.qg",type = "X")
@Slf4j
public class AbilityTestX implements AbilityTestExt {

    @Override
    public TestResponse doTest(TestRequest request) {
        String identity = request.getIdentity();
       log.info("水平入参：{}", request);
        TestResponse testResponse = new TestResponse();
        testResponse.setResult("水平处理" + request.getName());
        HashMap<String, Object> result = new HashMap<>();
        result.put("result", testResponse);
        request.setExtMap(result);
        return testResponse;
    }
}
