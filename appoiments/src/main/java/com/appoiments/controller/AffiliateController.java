package com.appoiments.controller;

import com.appoiments.dto.AffiliateDto;
import com.appoiments.service.AffiliateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laboratory")
public class AffiliateController {

    @Autowired
    private AffiliateServiceImpl affiliateServiceImpl;

    @GetMapping
    public List<AffiliateDto> getAllAffiliate( ){
        return affiliateServiceImpl.getAllAffiliate();
    }

    @GetMapping("/findAffiliate/{id}")
    public AffiliateDto getAffiliateById(@PathVariable("id") int id){
        return affiliateServiceImpl.getAffiliateById(id);
    }

}
