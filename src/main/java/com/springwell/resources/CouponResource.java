package com.springwell.resources;

import com.springwell.beans.Coupon;
import com.springwell.repos.CouponRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon-api")
public class CouponResource {

    private final CouponRepository couponRepository;

    public CouponResource(CouponRepository couponRepo) {
        this.couponRepository = couponRepo;
    }

    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon findCouponByCode(@PathVariable String code) {
        return couponRepository.findByCode(code);
    }

    @GetMapping("/coupons")
    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }
}
