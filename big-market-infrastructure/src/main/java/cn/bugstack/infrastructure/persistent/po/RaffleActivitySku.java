package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description 抽奖活动sku持久化对象
 * @create 2024-03-16 10:54
 */
@Data
public class RaffleActivitySku {

    /**
     * 自增ID
     */
    private Long id;
    /**
     * 商品sku
     */
    private Long sku;
    /**
     * 活动ID
     */
    private Long activityId;
    /**
     * 活动个人参与次数ID
     */
    private Long activityCountId;
    /**
     * 库存总量
     */
    private Integer stockCount;
    /**
     * 剩余库存
     */
    private Integer stockCountSurplus;
    /**
     * 商品金额【积分】
     */
    private BigDecimal productAmount;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
