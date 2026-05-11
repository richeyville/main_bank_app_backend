package com.onlinebankingsystem.onlinebankingsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = com.onlinebankingsystem.OnlineBankingSystemApplication.class)
@ActiveProfiles("test")
class OnlineBankingSystemApplicationTests {
    @Test
    void contextLoads() {}
}
