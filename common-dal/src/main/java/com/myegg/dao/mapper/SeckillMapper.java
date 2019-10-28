package com.myegg.dao.mapper;

import com.myegg.pojo.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seckill record);

    int insertSelective(Seckill record);

    Seckill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seckill record);

    int updateByPrimaryKey(Seckill record);

    /**
     * 减库存
     * @param id
     * @param killTime
     * @return
     */
    int reduceNumber(long id, Date killTime);

    /**
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offset,int limit);

}