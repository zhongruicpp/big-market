package cn.bugstack.domain.strategy.repository;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

/**
 * @Date: 2024/10/16 19:47
 * @Description 策略服务仓储接口
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, int size, Map<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    int getRateRange(Long strategyId);

    Integer getStrategyAwardAssemble(Long strategyId, int rateKey);
}
