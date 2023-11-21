package com.corgi.job;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.corgi.order.api.CorgiOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tairanliu
 */
@Component
@Slf4j
public class CorgiOrderTask {
    @Reference
    private CorgiOrderService corgiOrderService;

    @Async
    @Scheduled(fixedRate = 24 * 3600 * 1000)
    public void run() {
        log.info("message:" + corgiOrderService.completeChatMessage());
    }

}
