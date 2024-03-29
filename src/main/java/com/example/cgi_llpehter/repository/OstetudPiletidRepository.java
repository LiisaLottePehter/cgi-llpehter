package com.example.cgi_llpehter.repository;

import com.example.cgi_llpehter.model.OstetudPiletid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OstetudPiletidRepository extends JpaRepository<OstetudPiletid, Long> {

}
