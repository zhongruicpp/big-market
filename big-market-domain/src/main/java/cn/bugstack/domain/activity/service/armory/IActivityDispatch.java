package cn.bugstack.domain.activity.service.armory;

import java.util.Date;

/**
 * @Date: 2024/10/30 13:36
 * @Description 活动调度【扣减库存】
 */
public interface IActivityDispatch {

    boolean subtractionActivitySkuStock(Long sku, Date endDate);

}
