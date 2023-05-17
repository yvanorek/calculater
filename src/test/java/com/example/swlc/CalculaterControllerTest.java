package com.example.swlc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaterControllerTest {

    private CalculaterController calculatorController =new CalculaterController();

    @Test
    public void sumTest1(){
        //arrange
        int a=6;
        int b=11;
        //act
        int result =calculatorController.sum(a,b);
        //assert
        assertEquals(17, result);
    }

    @Test
    public void sumTest2(){
        //arrange
        int a=-6;
        int b=11;
        //act
        int result =calculatorController.sum(a,b);
        //assert
        assertEquals(5, result);
    }

    @Test
    public void sumTest3(){
        //arrange
        int a=-6;
        int b=-11;
        //act
        int result =calculatorController.sum(a,b);
        //assert
        assertEquals(-17, result);
    }

    @Test
    public void sumTest4(){
        //arrange
        int a=6;
        int b=-11;
        //act
        int result =calculatorController.sum(a,b);
        //assert
        assertEquals(-5, result);
    }




}