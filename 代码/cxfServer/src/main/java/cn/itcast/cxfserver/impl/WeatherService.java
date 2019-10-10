package cn.itcast.cxfserver.impl;

import cn.itcast.cxfserver.IWeatherService;

public class WeatherService implements IWeatherService {

	@Override
	public String info(String city) {
		if("北京".equals(city)){
			return "雾霾";
		}
		return "晴天";
	}

}
