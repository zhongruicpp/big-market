package cn.bugstack.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Date: 2024/11/24 9:47
 * @Description sku商品实体对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkuProductEntity {
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
     * 活动配置的次数 - 购买商品后可以获得的次数
     */
    private ActivityCount activityCount;

    @Data
    public static class ActivityCount {
        /**
         * 总次数
         */
        private Integer totalCount;

        /**
         * 日次数
         */
        private Integer dayCount;

        /**
         * 月次数
         */
        private Integer monthCount;
    }
}
