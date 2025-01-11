package com.yellowTech.yellowApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yellowTech.yellowApi.entity.PostagemEntity;

public interface PostagemRepository extends JpaRepository<PostagemEntity, Long>{

}
