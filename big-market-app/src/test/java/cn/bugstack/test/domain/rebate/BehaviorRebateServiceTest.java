package cn.bugstack.test.domain.rebate;

import cn.bugstack.domain.rebate.model.entity.BehaviorEntity;
import cn.bugstack.domain.rebate.model.valobj.BehaviorTypeVO;
import cn.bugstack.domain.rebate.service.IBehaviorRebateService;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Date: 2024/11/10 9:10
 * @Description 行为返利单测
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BehaviorRebateServiceTest {

    @Resource
    private IBehaviorRebateService behaviorRebateService;

//    @Test
//    public void test_createOrder() {
//        BehaviorEntity behaviorEntity = new BehaviorEntity();
//        behaviorEntity.setUserId("xiaofuge");
//        behaviorEntity.setBehaviorTypeVO(BehaviorTypeVO.SIGN);
//        // 重复的 OutBusinessNo 会报错唯一索引冲突，这也是保证幂等的手段，确保不会多记账
//        behaviorEntity.setOutBusinessNo("20241120");
//
//        List<String> orderIds = behaviorRebateService.createOrder(behaviorEntity);
//        log.info("请求参数：{}", JSON.toJSONString(behaviorEntity));
//        log.info("测试结果：{}", JSON.toJSONString(orderIds));
//    }

    @Test
    public void test_createOrder() throws InterruptedException {
        BehaviorEntity behaviorEntity = new BehaviorEntity();
        behaviorEntity.setUserId("xiaofuge");
        behaviorEntity.setBehaviorTypeVO(BehaviorTypeVO.SIGN);
        // 重复的 OutBusinessNo 会报错唯一索引冲突，这也是保证幂等的手段，确保不会多记账
        behaviorEntity.setOutBusinessNo("20351989");
        List<String> orderIds = behaviorRebateService.createOrder(behaviorEntity);
        log.info("请求参数：{}", JSON.toJSONString(behaviorEntity));
        log.info("测试结果：{}", JSON.toJSONString(orderIds));
        new CountDownLatch(1).await();
    }
}
