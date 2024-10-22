package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @Date: 2024/10/22 15:47
 * @Description 责任链装配
 */
public interface ILogicChainArmory {

    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);

}
