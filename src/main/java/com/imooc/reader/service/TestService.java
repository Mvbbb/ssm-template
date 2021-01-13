package com.imooc.reader.service;
 
import com.imooc.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    /**
     * 注解开启声明式事务
     */
    @Transactional
    public void batchImport(){
        for(int i=0;i<5;i++){
//            if(i==1) {
//                throw new RuntimeException("预期外异常");
//            }
            testMapper.insertSample();
        }
    }
}
