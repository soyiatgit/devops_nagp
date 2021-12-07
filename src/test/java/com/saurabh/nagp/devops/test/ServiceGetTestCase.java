package com.saurabh.nagp.devops.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.saurabh.nagp.devops.dto.CloudProviderDTO;
import com.saurabh.nagp.devops.entity.CloudProvidersEntity;
import com.saurabh.nagp.devops.repository.DevopsRepository;
import com.saurabh.nagp.devops.services.impl.DevopsServiceImpl;

// @RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class) 
public class ServiceGetTestCase {

	@InjectMocks
	DevopsServiceImpl devopsServiceImpl;
	
	@Mock
	DevopsRepository devopsRepository;

	@Test
    public void testGetCloudProviders() {
    	Mockito.when(devopsRepository.findAll()).thenReturn(createDevopsEntityList());
    	List<CloudProviderDTO> cloudProviders = devopsServiceImpl.getCloudProviders();
        assertEquals(1, cloudProviders.size());
    }
	
	@Test
    public void testSaveCloudProviders() {
    	Mockito.when(devopsRepository.save(Mockito.any())).thenReturn(createDevopsEntity());
    	CloudProviderDTO cloudProvider = devopsServiceImpl.addCloudProvider(createCloudProviderDTO());
        assertNotNull(cloudProvider);
    }
	
	public List<CloudProvidersEntity> createDevopsEntityList() {
		List<CloudProvidersEntity> cloudEnitites = new ArrayList<>();
		CloudProvidersEntity cloudProvidersEntity = new CloudProvidersEntity();
		cloudProvidersEntity.setCode("AC");
		cloudProvidersEntity.setId(1l);
		cloudProvidersEntity.setName("ACloud");
		cloudProvidersEntity.setOwner("Saurabh");
		cloudProvidersEntity.setServices(21L);
		cloudEnitites.add(cloudProvidersEntity);
		return cloudEnitites;
	}
	
	public CloudProvidersEntity createDevopsEntity() {
		CloudProvidersEntity cloudProvidersEntity = new CloudProvidersEntity();
		cloudProvidersEntity.setCode("AC");
		cloudProvidersEntity.setId(1l);
		cloudProvidersEntity.setName("ACloud");
		cloudProvidersEntity.setOwner("Saurabh");
		cloudProvidersEntity.setServices(21L);
		return cloudProvidersEntity;
	}
	
	public CloudProviderDTO createCloudProviderDTO() {
		CloudProviderDTO cloudProviderDTO = new CloudProviderDTO();
		cloudProviderDTO.setCode("SC");
		cloudProviderDTO.setId(1L);
		cloudProviderDTO.setName("NewCloudProvider");
		cloudProviderDTO.setOwner("NewCloudOwner");
		cloudProviderDTO.setServices(20L);
		return cloudProviderDTO;
	}
}
