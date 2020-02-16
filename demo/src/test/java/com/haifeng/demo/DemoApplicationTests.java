package com.haifeng.demo;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureEmbeddedDatabase
class DemoApplicationTests {

  @Test
  void contextLoads() {
  }

}
