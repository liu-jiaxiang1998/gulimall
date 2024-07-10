package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1l);
//        brandEntity.setName("苹果");
//        brandEntity.setDescript("苹果更牛皮！");
//        brandService.updateById(brandEntity);
        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 2l)).forEach(System.out::println);

    }
 
}
