package com.appoiments.service;

import com.appoiments.dto.AppoimentDto;
import com.appoiments.service.interfaces.IAppoimentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppoimentServiceImpl implements IAppoimentService {
    @Override
    public AppoimentDto newAppoiment(AppoimentDto appoimentDto) {
        return null;
    }

    @Override
    public AppoimentDto getAppoimentById(int id) {
        return null;
    }

    @Override
    public List<AppoimentDto> getAppoiment() {
        return null;
    }

    @Override
    public AppoimentDto updateAppoiment(AppoimentDto appoimentDto) {
        return null;
    }

    @Override
    public boolean deleteAppoiment(int id) {
        return false;
    }
}
