package com.skss.demo.stub;

public interface DubboService {

	
	public String getNameByIdForXml(long id);
	public String getNameByIdForAnnotation(long id);
	public void redisSet(String key,String value);
	public String redisGet(String key);
	
}
