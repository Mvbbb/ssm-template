package com.imooc.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.reader.entity.Test;

public interface TestMapper extends BaseMapper<Test> {
    /**
     * 该方法与mappers/test.xml下的insertSample的sql绑定
     */
    public void insertSample();
}
