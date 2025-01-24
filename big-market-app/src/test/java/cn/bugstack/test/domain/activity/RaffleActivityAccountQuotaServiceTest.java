package cn.bugstack.test.domain.activity;

import cn.bugstack.domain.activity.model.entity.SkuRechargeEntity;
import cn.bugstack.domain.activity.service.IRaffleActivityAccountQuotaService;
import cn.bugstack.domain.activity.service.armory.IActivityArmory;
import cn.bugstack.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

/**
 * @Date: 2024/10/29 18:59
 * @Description 抽奖活动订单单测
 */

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RaffleActivityAccountQuotaServiceTest {

    @Resource
    private IRaffleActivityAccountQuotaService raffleOrder;
    @Resource
    private IActivityArmory activityArmory;

    @Before
    public void setUp() {
        log.info("装配活动：{}", activityArmory.assembleActivitySku(9011L));
    }

    @Test
    public void test_createSkuRechargeOrder() throws InterruptedException {

        try {
            SkuRechargeEntity skuRechargeEntity = new SkuRechargeEntity();
            skuRechargeEntity.setUserId("xiaofuge");
            skuRechargeEntity.setSku(9011L);
            // outBusinessNo 作为幂等仿重使用，同一个业务单号2次使用会抛出索引冲突 Duplicate entry '700091009111' for key 'uq_out_business_no' 确保唯一性。
            skuRechargeEntity.setOutBusinessNo(RandomStringUtils.randomNumeric(12));
            String orderId = raffleOrder.createOrder(skuRechargeEntity);
            log.info("测试结果：{}", orderId);
        } catch (AppException e) {
            log.warn(e.getInfo());
        }

        new CountDownLatch(1).await();
    }

}
