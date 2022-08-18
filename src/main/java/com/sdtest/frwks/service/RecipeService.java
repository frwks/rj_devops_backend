package com.sdtest.frwks.service;

import com.sdtest.frwks.model.Recipe;
import com.sdtest.frwks.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //bean 주입
@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipe() {
        return recipeRepository.findAll();
    }

//        public void deleteBoard(Integer ct_id) {  catalogRepository.deleteById(ct_id); }

    public Optional<Recipe> getSearchList(Integer rc_id) { return recipeRepository.findById(rc_id); }
//    @Transactional //메소드 실행시 트랜잭션 시작~ 정상종료되면 커밋/ 에러시 롤백
//    public Integer save(Boards)
}
