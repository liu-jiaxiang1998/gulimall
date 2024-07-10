package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-10 10:52:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
