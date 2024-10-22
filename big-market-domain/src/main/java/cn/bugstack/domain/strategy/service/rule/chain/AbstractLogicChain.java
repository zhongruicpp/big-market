package cn.bugstack.domain.strategy.service.rule.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date: 2024/10/22 16:50
 * @Description
 */
@Slf4j
public abstract class AbstractLogicChain implements ILogicChain {

    private ILogicChain next;

    @Override
    public ILogicChain next() {
        return next;
    }

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    protected abstract String ruleModel();
}
