package com.bill.cache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
public class CacheConfiguration {

	@Bean
	public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
		 EhCacheManagerFactoryBean factoryBean=new EhCacheManagerFactoryBean();
		 factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		 factoryBean.setShared(true);
		 return factoryBean;
	}
	
	@Bean
	public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean factoryBean){
		return new EhCacheCacheManager(factoryBean.getObject());
	} 
}
