package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-08 10:01:59
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}