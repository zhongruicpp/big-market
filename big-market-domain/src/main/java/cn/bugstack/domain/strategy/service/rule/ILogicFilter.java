package cn.bugstack.domain.strategy.service.rule;

import cn.bugstack.domain.strategy.model.entity.RuleActionEntity;
import cn.bugstack.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @Date: 2024/10/19 21:00
 * @Description 抽奖规则过滤接口
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    /**
     * @param ruleMatterEntity userId、strategyId、awardId、ruleModel
     * @return
     */
    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
