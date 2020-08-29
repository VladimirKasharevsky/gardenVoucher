package com.example.garden.service;

import com.example.garden.entity.Voucher;

import java.util.Optional;

public interface VoucherService {
    void addVoucher(Voucher voucher);
    void changeVoucher(Long id, Voucher voucher);
    Optional<Voucher> findVoucher(Long id);
    void deleteVoucher(Long id);
}
