package shenzhen.teamway.tms9000.portal.util;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;


/**
 * 配置文件工具类
 * @author keneys
 *
 */
public class Config {
	 private static CompositeConfiguration config = null;
	 static {
		   config = new CompositeConfiguration(); 
          try {
			config.addConfiguration(new PropertiesConfiguration("properties/conf.properties"));
		} catch (ConfigurationException e) {

			e.printStackTrace();
		} 
		 
	 }
	 
	 /**
	  * 获得String类型的配置
	  * @param key
	  * @return
	  */
	 public static String getString(String key){
		 return config.getString(key);
	 }
}
