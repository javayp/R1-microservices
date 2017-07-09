package com.data.model;

import org.springframework.stereotype.Service;

@Service
public class Device {
	
	private int deviceid;
	
	private String devicename;

	public Device() {
		super();
	}

	public int getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
}
