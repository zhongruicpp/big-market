package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.domain.activity.model.entity.ActivityCountEntity;
import cn.bugstack.infrastructure.persistent.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 抽奖活动次数配置表Dao
 * @create 2024-03-09 10:07
 */
@Mapper
public interface IRaffleActivityCountDao {

    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
