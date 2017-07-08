package com.data.repo;

import java.util.HashMap;
import java.util.Map;

public class DataRepo {

	public Map<Integer,String> repo(){
		Map<Integer,String> data=new HashMap<>();
		data.put(1,"Digital");
		data.put(2,"Commerce");
		return data;
	}
}
