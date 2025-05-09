package com.example.demo.repository;

import com.example.demo.entity.UnderWriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnderWriterRepository extends JpaRepository<UnderWriter,Integer> {
}
