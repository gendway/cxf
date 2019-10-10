package cn.itcast.cxfserver;

import javax.jws.WebService;

/**
 * 天气服务接口
 * @author Erc
 *
 */
@WebService
public interface IWeatherService {

	/**
	 * 查询城市的天气
	 * @param city
	 * @return
	 */
	String info(String city);
}
