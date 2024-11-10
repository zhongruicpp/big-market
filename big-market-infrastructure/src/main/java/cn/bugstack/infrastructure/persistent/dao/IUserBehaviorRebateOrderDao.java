package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.UserBehaviorRebateOrder;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Date: 2024/11/10 8:53
 * @Description 用户行为返利流水订单表
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserBehaviorRebateOrderDao {

    void insert(UserBehaviorRebateOrder userBehaviorRebateOrder);

}
