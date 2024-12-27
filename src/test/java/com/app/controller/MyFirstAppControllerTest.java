package com.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MyFirstAppControllerTest {

    @Autowired
    private MyFirstAppController myFirstAppController;


    @Test
    public void readOperationTest(){

        String result = myFirstAppController.readOperation();
        assertNotNull(result);
    }

    @Test
    public void createOperationTest(){
        String request = "This is create request";
        String result = myFirstAppController.createOperation(request);
        assertEquals(request, result);
    }

    @Test
    public void updateOperationTest(){
        String request = "This is update request";
        String result = myFirstAppController.updateOperation(request, "1");
        assertNotNull(result);
    }

    @Test
    public void deleteOperationTest(){

        String result = myFirstAppController.deleteOperation("1");
        assertNotNull(result);
    }


}