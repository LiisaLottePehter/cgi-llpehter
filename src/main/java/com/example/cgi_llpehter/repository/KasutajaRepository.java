package com.example.cgi_llpehter.repository;

import com.example.cgi_llpehter.model.Kasutaja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KasutajaRepository extends JpaRepository<Kasutaja, Long> {
}
