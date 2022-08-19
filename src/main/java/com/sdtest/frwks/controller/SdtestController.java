package com.sdtest.frwks.controller;

import com.sdtest.frwks.repository.RecipeRepository;
import com.sdtest.frwks.service.CatalogService;
import com.sdtest.frwks.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

//@CrossOrigin(origins = "http://34.132.90.222:3306")
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class SdtestController {
    @Autowired
    private CatalogService catalogService;

    // 모든 게시글 부름
    @GetMapping("/catalog")
    public List getAllCatalog() {
        return catalogService.getAllCatalog();
    }
    // 글 작성
//    @PostMapping("/board")
//    public Board createBoard(@RequestBody Req_Board req_board){
//        return boardService.createBoard(req_board);
//    }

//    @DeleteMapping("/delete/{idx}")
//    public void delete(@PathVariable Integer ct_id){
//        System.out.println(ct_id);
//        catalogService.deleteBoard(ct_id);
//        System.out.println("삭제완료");
//    }
    @Autowired
    private RecipeService recipeService;

//    @GetMapping("/recipe")
//    public List getAllRecipe() {
//        return recipeService.getAllRecipe();

    @GetMapping("/recipe/{rc_id}")
    public List getSearchList(@PathVariable Integer rc_id){
        System.out.println("검색완료");
        return Collections.singletonList(recipeService.getSearchList(rc_id));
    }
}
