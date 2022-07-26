package com.appoiments.service;

import com.appoiments.dto.TestDto;
import com.appoiments.service.interfaces.ITestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {
    @Override
    public TestDto newTest(TestDto testDto) {
        return null;
    }

    @Override
    public TestDto getTestById(int id) {
        return null;
    }

    @Override
    public List<TestDto> getTest() {
        return null;
    }

    @Override
    public TestDto updateTest(TestDto testDto) {
        return null;
    }

    @Override
    public boolean deleteTest(int id) {
        return false;
    }
}
