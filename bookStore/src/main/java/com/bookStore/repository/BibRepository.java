package com.bookStore.repository;

import com.bookStore.entity.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BibRepository extends JpaRepository<Bibliotheque,Long> {
}
