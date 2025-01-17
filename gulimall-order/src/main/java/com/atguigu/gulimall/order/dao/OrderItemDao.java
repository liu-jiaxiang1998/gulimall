package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-10 10:52:20
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
