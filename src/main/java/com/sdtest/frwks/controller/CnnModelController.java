package com.sdtest.frwks.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CnnModelController {
    @GetMapping("/recipe/{rc_id}")
    public List getSearchList(@PathVariable Integer rc_id){
        System.out.println("검색완료");
        return Collections.singletonList(recipeService.getSearchList(rc_id));
    }
}