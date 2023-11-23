package com.corgi.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author tairanliu
 */
@Component
@Slf4j
public class CorgiOrderTask {
//    @Autowired
//    private CorgiOrderService corgiOrderService;

    //@Async
    //@Scheduled(fixedRate = 24 * 3600 * 1000)
    public void run() {
//        log.info("message:" + corgiOrderService.completeChatMessage("", ""));
    }

}
