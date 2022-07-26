package com.appoiments.service;

import com.appoiments.dto.AffiliateDto;
import com.appoiments.entity.AffiliateEntity;
import com.appoiments.repository.IAffiliateRepository;
import com.appoiments.service.interfaces.IAffiliateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AffiliateServiceImpl implements IAffiliateService {

    private IAffiliateRepository iAffiliateRepository;

    @Autowired
    public AffiliateServiceImpl(IAffiliateRepository affiliateRepository) {
        this.iAffiliateRepository = affiliateRepository;
    }

    @Override
    public AffiliateDto newAffiliate(AffiliateDto affiliateDto) {
        return null;
    }

    @Override
    public AffiliateDto getAffiliateById(int id) {
        Optional<AffiliateEntity> affiliateEntity = iAffiliateRepository.findById(id);

        return new AffiliateDto(affiliateEntity.get().getId(), affiliateEntity.get().getFullName(),
                affiliateEntity.get().getAge(), affiliateEntity.get().getEmail());

    }

    @Override
    public List<AffiliateDto> getAllAffiliate() {
        List<AffiliateEntity> affiliateEntity = (List<AffiliateEntity>) iAffiliateRepository.findAll();

        if(null !=  affiliateEntity && !affiliateEntity.isEmpty()){

            ModelMapper modelMapper = new ModelMapper();

            List<AffiliateDto> affiliateDto = (List<AffiliateDto>) affiliateEntity.stream()
                    .map(affiliate -> modelMapper.map(affiliate, AffiliateDto.class))
                    .collect(Collectors.toList());

            return affiliateDto;
        }
        return null;
    }

    @Override
    public AffiliateDto updateAffiliate(AffiliateDto affiliateDto) {
        return null;
    }

    @Override
    public boolean deleteAffiliate(int id) {
        return false;
    }
}
