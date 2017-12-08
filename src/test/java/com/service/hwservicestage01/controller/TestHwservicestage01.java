package com.service.hwservicestage01.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHwservicestage01 {

        Hwservicestage01Delegate hwservicestage01Delegate = new Hwservicestage01Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = hwservicestage01Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}