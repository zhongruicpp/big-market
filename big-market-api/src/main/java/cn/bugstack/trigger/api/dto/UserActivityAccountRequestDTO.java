package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @Date: 2024/11/13 8:35
 * @Description 用户活动账户请求对象
 */
@Data
public class UserActivityAccountRequestDTO {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 活动ID
     */
    private Long activityId;
}
