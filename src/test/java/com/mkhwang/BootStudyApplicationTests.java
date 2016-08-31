package com.mkhwang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//스프링 부트로 컨텍스트 로드
/*
@SpringApplicationConfiguration(classes=BootStudyApplication)
@WebAppConfiguration
을
@SpringBootTest가 대체
 */
@SpringBootTest
public class BootStudyApplicationTests {

	@Test
	public void contextLoads() {
	}

}
