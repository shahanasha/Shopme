package com.shopme.admin.banner;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopme.common.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Integer> {

}
