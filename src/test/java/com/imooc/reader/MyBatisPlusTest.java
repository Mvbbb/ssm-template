package com.imooc.reader;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.entity.Test;
import com.imooc.reader.mapper.TestMapper;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyBatisPlusTest {
    @Resource
    private TestMapper testMapper;
    @org.junit.Test
    public void testInsert(){
        Test test = new Test();
        test.setContent("My test");
        testMapper.insert(test);
    }
    
    @org.junit.Test
    public void testUpdate(){
        Test test = testMapper.selectById(31);
        test.setContent("cshi");
        testMapper.updateById(test);
    }
    
    @org.junit.Test
    public void testDelete(){
        testMapper.deleteById(31);
    }

    /**
     * 条件查询列表
     */
    @org.junit.Test
    public void testSelect(){
        QueryWrapper<Test> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",32);
        List<Test> tests = testMapper.selectList(queryWrapper);
        tests.forEach(System.out::println);
    }
}
