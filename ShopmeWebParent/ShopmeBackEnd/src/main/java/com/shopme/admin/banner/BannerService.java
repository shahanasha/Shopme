package com.shopme.admin.banner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopme.common.entity.Banner;

import java.util.List;

@Service
@Transactional
public class BannerService {

    @Autowired
    private BannerRepository bannerRepository;


    public Banner save(Banner banner){
        Banner savedBanner  = bannerRepository.save(banner);
        return savedBanner;
    }

    public List<Banner> findAll() {
        return bannerRepository.findAll();
    }

    public Banner findById(int id) {
        Banner banner = bannerRepository.findById(id).get();

        return banner;
    }
}