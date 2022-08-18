package com.sdtest.frwks.service;

import com.sdtest.frwks.model.Catalog;
import com.sdtest.frwks.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //bean 주입
@Service
public class CatalogService {
    private final CatalogRepository catalogRepository;

    public List<Catalog> getAllCatalog() {
        return catalogRepository.findAll();
    }

//    public void deleteBoard(Integer ct_id) {  catalogRepository.deleteById(ct_id); }
//
    public Optional<Catalog> getSearchList(Integer ct_id) { return catalogRepository.findById(ct_id); }
//    @Transactional //메소드 실행시 트랜잭션 시작~ 정상종료되면 커밋/ 에러시 롤백
//    public Integer save(Boards)
}
