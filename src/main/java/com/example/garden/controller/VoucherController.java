package com.example.garden.controller;

import com.example.garden.entity.Voucher;
import com.example.garden.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("voucher/")
public class VoucherController {

    @Autowired
    private VoucherService voucherService;

    @GetMapping("/{voucherId}")
    public Voucher findGarden(@PathVariable long voucherId) {
        return voucherService.findVoucher(voucherId).get();
    }
}
