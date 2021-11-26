package com.saurabh.nagp.devops.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabh.nagp.devops.dto.CloudProviderDTO;
import com.saurabh.nagp.devops.entity.CloudProvidersEntity;
import com.saurabh.nagp.devops.repository.DevopsRepository;
import com.saurabh.nagp.devops.services.DevopsService;

@Service
public class DevopsServiceImpl implements DevopsService {

	@Autowired
	DevopsRepository devopsRepo;
	
	@Override
	public List<CloudProviderDTO> getCloudProviders() {
		List<CloudProviderDTO> cloudProviders = new ArrayList<>();
		List<CloudProvidersEntity> entities =  devopsRepo.findAll();
		entities.forEach((entity) -> {
			CloudProviderDTO cloudProviderDTO = new CloudProviderDTO();
			cloudProviderDTO.setCode(entity.getCode());
			cloudProviderDTO.setId(entity.getId());
			cloudProviderDTO.setName(entity.getName());
			cloudProviderDTO.setOwner(entity.getOwner());
			cloudProviderDTO.setServices(entity.getServices());
			cloudProviders.add(cloudProviderDTO);
		});
		return cloudProviders;
	}

	@Override
	public CloudProviderDTO addCloudProvider(CloudProviderDTO cloudProviderDTO) {
		CloudProvidersEntity cloudProvidersEntity = new CloudProvidersEntity();
		BeanUtils.copyProperties(cloudProviderDTO, cloudProvidersEntity);
		System.out.println(cloudProvidersEntity.getId());
		devopsRepo.save(cloudProvidersEntity);
		return cloudProviderDTO;
	}

	
}
