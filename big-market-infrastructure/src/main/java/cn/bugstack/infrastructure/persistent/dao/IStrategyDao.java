package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date: 2024/10/16 8:54
 * @Description 抽奖策略 DAO
 */

@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

}
