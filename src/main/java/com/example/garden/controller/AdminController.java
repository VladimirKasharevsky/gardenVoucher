package com.example.garden.controller;

import com.example.garden.entity.Voucher;
import com.example.garden.entity.Response;
import com.example.garden.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("admin/")
public class AdminController {

    @Autowired
    private VoucherService voucherService;

    @PostMapping("/voucher/create")
    public Response createGarden(@RequestBody Voucher voucher) {
        voucherService.addVoucher(voucher);
        return new Response(null,"Voucher created");
    }

    @PostMapping("voucher/change/{voucherId}")
    public Response changeGarden(@PathVariable long voucherId, @RequestBody Voucher voucher) {
        voucherService.changeVoucher(voucherId, voucher);
        return new Response(null,"Voucher updated");
    }

    @DeleteMapping("/voucher/{voucherId}")
    public Response deleteGarden(@PathVariable long voucherId) {
        voucherService.deleteVoucher(voucherId);
        return new Response(null, "Voucher deleted");
    }
}
