package com.qg.matrx.use.ability.ext;

import com.qg.matrx.use.ability.ext.model.TestRequest;
import com.qg.matrx.use.ability.ext.model.TestResponse;

public interface AbilityTestExt {

    TestResponse doTest(TestRequest request);
}
