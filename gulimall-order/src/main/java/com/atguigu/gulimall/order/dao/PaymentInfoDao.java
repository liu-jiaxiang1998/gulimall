package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-10 10:52:19
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
