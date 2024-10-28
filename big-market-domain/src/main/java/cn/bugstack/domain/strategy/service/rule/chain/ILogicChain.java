package cn.bugstack.domain.strategy.service.rule.chain;

import cn.bugstack.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @Date: 2024/10/22 15:47
 * @Description 抽奖策略规则责任链接口
 */
public interface ILogicChain extends ILogicChainArmory {

    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);
}
