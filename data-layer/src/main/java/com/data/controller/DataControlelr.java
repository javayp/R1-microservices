package com.data.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Device;
import com.data.repo.DataRepo;

@RestController
public class DataControlelr {
	
	@Autowired
	private DataRepo dataRepo;
		
	@PostMapping(value="write-data",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Device write(@RequestBody Device device){
		dataRepo.write(device);
		return device;
	}
	
	@GetMapping("/read-data")
	public Map<Integer,Device> read(){
		return dataRepo.read();
	}
}
