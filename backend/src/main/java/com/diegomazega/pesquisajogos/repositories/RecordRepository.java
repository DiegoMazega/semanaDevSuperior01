package com.diegomazega.pesquisajogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomazega.pesquisajogos.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
