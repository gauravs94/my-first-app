package com.app.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MyFirstAppController {

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "welcome to my first spring boot app";
    }

    @GetMapping(value = "/read")
    public String readOperation(){
        return "this is read operation";
    }

    @PostMapping(value = "/create")
    public String createOperation(@RequestBody String request){
        return request;
    }

    @PutMapping(value = "/update/{id}")
    public String updateOperation(@RequestBody String request, @PathVariable String id){
        return request+" for id: "+id;
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteOperation(@PathVariable String id){
        return "this is delete operation for id: "+id;
    }
}
