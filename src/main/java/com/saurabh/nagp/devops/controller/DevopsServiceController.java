package com.saurabh.nagp.devops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.nagp.devops.dto.CloudProviderDTO;
import com.saurabh.nagp.devops.services.DevopsService;

@RestController
@RequestMapping(value = "/cloud")
public class DevopsServiceController {

	@Autowired
	DevopsService devopsService;
	
	@GetMapping(value = "/providers/list")
	public List<CloudProviderDTO> getProvidersList() {
		List<CloudProviderDTO> cloudProviders = devopsService.getCloudProviders();
		return cloudProviders;
	}
	
	@PostMapping(value = "/providers")
	public CloudProviderDTO addProviders(@RequestBody CloudProviderDTO cloudProviderDTO) {
		devopsService.addCloudProvider(cloudProviderDTO);
		return cloudProviderDTO;
	}

}
