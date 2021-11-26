package com.saurabh.nagp.devops.services;

import java.util.List;

import com.saurabh.nagp.devops.dto.CloudProviderDTO;

public interface DevopsService {

	public List<CloudProviderDTO> getCloudProviders();

	public CloudProviderDTO addCloudProvider(CloudProviderDTO cloudProviderDTO);
	
}
