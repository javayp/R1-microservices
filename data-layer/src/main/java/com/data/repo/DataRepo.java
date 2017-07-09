package com.data.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.data.model.Device;

@Service
public class DataRepo {

	private Map<Integer,Device> data;
	private final int ZERO=0;
	
	DataRepo(){
		data=new HashMap<>();
	}
	
	
	public void write(Device device){
		if(device.getDeviceid()==ZERO){			
			data.put(device.getDeviceid()+1, device);
		}else{
			data.put(device.getDeviceid(), device);
		}
	}
	
	public Map<Integer,Device> read(){
		return data;		
	}
}
