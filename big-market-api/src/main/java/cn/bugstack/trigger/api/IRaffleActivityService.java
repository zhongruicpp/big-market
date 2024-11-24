package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.dto.*;
import cn.bugstack.types.model.Response;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Date: 2024/11/6 15:19
 * @Description 抽奖活动服务
 */
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     *
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     *
     * @param request 请求对象(userId activityId)
     * @return 返回结果(awardId 、 awardTitle 、 awardIndex)
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

    /**
     * 日历签到返利接口
     *
     * @param userId 用户ID
     * @return 签到结果
     */
    Response<Boolean> calendarSignRebate(String userId);

    /**
     * 判断是否完成日历签到返利接口
     *
     * @param userId
     * @return
     */
    Response<Boolean> isCalendarSignRebate(String userId);

    /**
     * 查询用户活动账户
     *
     * @param request 请求对象[活动ID、用户ID]
     * @return 返回结果 [总额度、月额度、日额度 ]
     */
    Response<UserActivityAccountResponseDTO> queryUserActivityAccount(UserActivityAccountRequestDTO request);

    /**
     * 查询sku商品集合
     *
     * @param activityId 活动ID
     * @return 商品集合
     */
    Response<List<SkuProductResponseDTO>> querySkuProductListByActivityId(Long activityId);

    /**
     * 查询用户积分值
     *
     * @param userId 用户ID
     * @return 可用积分
     */
    Response<BigDecimal> queryUserCreditAccount(String userId);

    /**
     * 积分支付兑换商品
     *
     * @param request 请求对象「用户ID、商品ID」
     * @return 兑换结果
     */
    Response<Boolean> creditPayExchangeSku(SkuProductShopCartRequestDTO request);
}
