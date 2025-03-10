package cn.bugstack.domain.strategy.service;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @Date: 2024/10/29 8:48
 * @Description 策略奖品接口
 */
public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

    List<StrategyAwardEntity> queryRaffleStrategyAwardListByActivityId(Long activityId);
}
