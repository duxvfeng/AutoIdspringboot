package com.tmax;


import com.tmax.domain.ResOrder;
import com.tmax.mapper.ResOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Testdd {

    @Autowired
    private ResOrderMapper resOrderMapper;

    @Test
    public void contextLoads() {

        resOrderMapper.insert(new ResOrder());
    }
}
