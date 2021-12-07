package com.saurabh.nagp.devops.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.nagp.devops.entity.CloudProvidersEntity;

@Repository
public interface DevopsRepository extends JpaRepository<CloudProvidersEntity, Long> {

	Optional<CloudProvidersEntity> findById(Long id);

}