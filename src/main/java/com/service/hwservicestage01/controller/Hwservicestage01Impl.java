package com.service.hwservicestage01.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-08T07:30:54.959Z")

@RestSchema(schemaId = "hwservicestage01")
@RequestMapping(path = "/hwservicestage01", produces = MediaType.APPLICATION_JSON)
public class Hwservicestage01Impl {

    @Autowired
    private Hwservicestage01Delegate userHwservicestage01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHwservicestage01Delegate.helloworld(name);
    }

}
