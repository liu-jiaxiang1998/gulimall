package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-08 10:01:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
