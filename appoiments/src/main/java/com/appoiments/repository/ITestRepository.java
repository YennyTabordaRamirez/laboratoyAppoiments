package com.appoiments.repository;

import com.appoiments.dto.TestDto;
import com.appoiments.entity.TestEntity;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITestRepository extends CrudRepository<TestEntity, Integer> {

    @Procedure("select test_name from tests")
    List<TestDto> findByTestName();
}
