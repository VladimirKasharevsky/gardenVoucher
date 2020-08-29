package com.example.garden.service;

import com.example.garden.entity.Voucher;
import com.example.garden.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VoucherServiceImp implements VoucherService {

    @Autowired
    private VoucherRepository voucherRepository;

    @Override
    public void addVoucher(Voucher voucher) {
        voucherRepository.save(voucher);
    }

    @Override
    public void changeVoucher(Long id, Voucher voucherNewInfo) {
        voucherNewInfo.setId(id);
        voucherRepository.save(voucherNewInfo);
    }

    @Override
    public Optional<Voucher> findVoucher(Long id) {
        return voucherRepository.findById(id);
    }

    @Override
    public void deleteVoucher(Long id) {
        voucherRepository.deleteById(id);
    }
}
