package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author ljx
 * @email ${email}
 * @date 2024-07-10 10:12:27
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

}
