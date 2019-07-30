package com.lamb.logicdate;

/**
 * ControllerRestTest
 */
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.minidev.json.JSONObject;

import com.jayway.restassured.RestAssured;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
/**
 * @author swathi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@TestPropertySource(value={"classpath:application.properties"})
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class ControllerRestTest {
    @LocalServerPort
    private Integer port;

    @Test
    public void getDataTest() {

        get("/api/date").then().assertThat().assertThat().statusCode(200);
    } 

    @Before
    public void setBaseUri () {
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
    }
}