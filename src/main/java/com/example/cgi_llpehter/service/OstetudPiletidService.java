package com.example.cgi_llpehter.service;

import com.example.cgi_llpehter.model.OstetudPiletid;
import com.example.cgi_llpehter.repository.OstetudPiletidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OstetudPiletidService {
    private final OstetudPiletidRepository ostetudPiletidRepository;

    @Autowired
    public OstetudPiletidService(OstetudPiletidRepository ostetudPiletidRepository) {
        this.ostetudPiletidRepository = ostetudPiletidRepository;
    }

    public OstetudPiletid saveOst(OstetudPiletid ostetudPiletid) {
        ostetudPiletidRepository.save(ostetudPiletid);
        return ostetudPiletid;
    }

}
