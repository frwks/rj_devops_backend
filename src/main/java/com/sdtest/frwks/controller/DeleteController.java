package com.sdtest.frwks.controller;

import com.sdtest.frwks.model.Catalog;
import com.sdtest.frwks.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://34.132.90.222:3306")
@RestController
@RequestMapping("/api2")
public class DeleteController {
    @Autowired
    private CatalogService catalogService;

    // 유저 아이디로 삭제
//    @DeleteMapping("/delete/{idx}")
//    public void delete(@PathVariable Integer ct_id, @RequestParam String account){
//        System.out.println(ct_id);
//
//        catalogService.deleteBoard(ct_id);
//        System.out.println("삭제완료");
//    }

    // 글 작성
//    @PostMapping("/board")
//    public Board createBoard(@RequestBody Req_Board req_board){
//        return boardService.createBoard(req_board);
//    }
}
