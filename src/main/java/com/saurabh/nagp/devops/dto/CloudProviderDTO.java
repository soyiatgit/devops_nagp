package com.saurabh.nagp.devops.dto;

public class CloudProviderDTO {

	private Long id;
	private String name;
	private String code;
	private String owner;
	private Long services;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getServices() {
		return services;
	}

	public void setServices(Long services) {
		this.services = services;
	}

}
