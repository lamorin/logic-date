package com.lamb.logicdate;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


/**
 * ControllerTests
 */

@RunWith(SpringJUnit4ClassRunner.class)  
@TestPropertySource(value={"classpath:application.properties"})
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class ControllerTests {

    @TestConfiguration
    static class ControllerTestsContextConfiguration {
  
        @Bean
        public DateService dateService() {
            return new DateServiceImpl();
        }
    }
 
    @Autowired
    private DateService dateService;

	@Test
	public void getDate() {
		LogicDate logicDate = dateService.getDate();
        assertTrue("logicDate no puede estar en null", logicDate != null);
	}    
}


