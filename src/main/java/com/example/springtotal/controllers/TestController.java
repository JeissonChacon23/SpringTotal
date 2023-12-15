package com.example.springtotal.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tests")
public class TestController {
    @GetMapping
    public String getTestAll(){
        return "Hello Test";
    }
    @GetMapping("/{id}")
    public String getTest(@PathVariable String id){
        return "Get "+ id;
    }
    @PutMapping("/{id}")
    public String putTest(@PathVariable String id){
        return "Put";
    }
    @PostMapping
    public String postTest(){
        return "Post";
    }
    @DeleteMapping("/{id}")
    public String deleteTest(@PathVariable String id){
        return "Delete";
    }
    @GetMapping("/delete/{id}")
    public String getDeleteTest(@PathVariable String id){
        return "This id was delete: "+ id;
    }
}