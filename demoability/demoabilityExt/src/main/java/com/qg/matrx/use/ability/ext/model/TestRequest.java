package com.qg.matrx.use.ability.ext.model;

import com.qg.matrix.core.model.BaseParamModel;
import lombok.Data;

@Data
public class TestRequest extends BaseParamModel {
    private Integer num;
    private String name;
}
