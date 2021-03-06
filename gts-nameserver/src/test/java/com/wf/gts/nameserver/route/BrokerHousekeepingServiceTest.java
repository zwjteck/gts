package com.wf.gts.nameserver.route;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wf.gts.nameserver.NamesrvConfig;
import com.wf.gts.nameserver.NamesrvController;
import com.wf.gts.remoting.netty.NettyServerConfig;

public class BrokerHousekeepingServiceTest {
  
    private static BrokerHousekeepingService brokerHousekeepingService;

    @BeforeClass
    public static void setup() {
        NamesrvController namesrvController = new NamesrvController(
            new NamesrvConfig(),
            new NettyServerConfig()
        );
        brokerHousekeepingService = new BrokerHousekeepingService(namesrvController);
    }

    @AfterClass
    public static void terminate() {

    }

    @Test
    public void testOnChannelClose() {
        brokerHousekeepingService.onChannelClose("127.0.0.1:9876", null);
    }

    @Test
    public void testOnChannelException() {
        brokerHousekeepingService.onChannelException("127.0.0.1:9876", null);
    }

    @Test
    public void testOnChannelIdle() {
        brokerHousekeepingService.onChannelException("127.0.0.1:9876", null);
    }

}