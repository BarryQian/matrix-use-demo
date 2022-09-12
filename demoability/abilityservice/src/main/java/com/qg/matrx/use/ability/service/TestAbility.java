package com.qg.matrx.use.ability.service;

import com.qg.matrix.core.interfaces.AbstractExt;
import com.qg.matrx.use.ability.ext.model.TestRequest;
import com.qg.matrx.use.ability.ext.model.TestResponse;
import com.qg.matrx.use.ability.ext.AbilityTestExt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TestAbility extends AbstractExt {

    public String doTest(String name, Integer num, String identity) {
        TestRequest request = new TestRequest();
        request.setName(name);
        request.setNum(num);
        request.setIdentity(identity);
        List<AbilityTestExt> extension = (List<AbilityTestExt>) this.getExtension(AbilityTestExt.class, request, new TestResponse());
        if (CollectionUtils.isEmpty(extension)) {
            log.error("TestAbility is empty");
            return "no TestAbility";
        }

        TestResponse result = (TestResponse)this.invoke("doTest", extension);


//        extension.forEach(e -> {
//            TestResponse testResponse = e.doTest(request);
//            log.info("doTest result:{}", testResponse);
//            this.setResult(testResponse);
//            HashMap<String, Object> result = new HashMap<>();
//            result.put("result", testResponse);
//            this.getParam().setExtMap(result);
//        });

        return result.toString();

    }

}
