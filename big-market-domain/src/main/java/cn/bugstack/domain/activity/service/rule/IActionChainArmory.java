package cn.bugstack.domain.activity.service.rule;

/**
 * @description
 * @create 2024-03-23 10:15
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
