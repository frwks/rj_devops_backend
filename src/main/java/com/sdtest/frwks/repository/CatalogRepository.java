package com.sdtest.frwks.repository;

import com.sdtest.frwks.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository  extends JpaRepository<Catalog, Integer> {
}
