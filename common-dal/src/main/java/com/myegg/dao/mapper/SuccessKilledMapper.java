package com.myegg.dao.mapper;

import com.myegg.pojo.SuccessKilled;
import org.apache.ibatis.annotations.Param;

public interface SuccessKilledMapper {
    int deleteByPrimaryKey(@Param("seckillId") Long seckillId, @Param("userPhone") Long userPhone);

    int insert(SuccessKilled record);

    int insertSelective(SuccessKilled record);

    SuccessKilled selectByPrimaryKey(@Param("seckillId") Long seckillId, @Param("userPhone") Long userPhone);

    int updateByPrimaryKeySelective(SuccessKilled record);

    int updateByPrimaryKey(SuccessKilled record);

    /**
     *
     * @param scekillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long scekillId);
}