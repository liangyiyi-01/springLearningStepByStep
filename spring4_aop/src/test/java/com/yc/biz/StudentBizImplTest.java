package com.yc.biz;

import com.yc.MyAppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes= MyAppConfig.class)
public class StudentBizImplTest {
    @Autowired //按类型注入，多个，加入@Qualifer
    @Resource//先按名字注入，再按类型注入，此时，也不能出现多个同类型bean
    private StudentBiz sbi;

    @Test
    public void testAdd() {
        sbi.add("张三");
    }
    @Test
    public void testUpdate() {
        sbi.update("张三");
    }
    @Test
    public void testFind() {
        sbi.find("张三");
    }
}