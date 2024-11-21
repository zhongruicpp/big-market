package cn.bugstack.domain.award.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Date: 2024/11/20 20:13
 * @Description 用户积分奖品实体对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreditAwardEntity {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 积分值
     */
    private BigDecimal creditAmount;

}
