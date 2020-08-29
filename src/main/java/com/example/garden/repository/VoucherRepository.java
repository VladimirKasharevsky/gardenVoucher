package com.example.garden.repository;

import com.example.garden.entity.Voucher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoucherRepository extends CrudRepository<Voucher, Long> {
    Optional<Voucher> findById(Long Id);
}
