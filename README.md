# springboot-ehcache

引入缓存模块主要步骤：

1.pom.xml文件中引入ehcache的依赖。  
2.在src/main/resources文件夹下新建ehcache.xml，设置缓存策略，选择用LRU算法。  
3.新建CacheConfiguration类，加@EnableCaching注解，定义两个bean（EhCacheManagerFactoryBean和EhCacheCacheManager）。  
4.新建UserServiceImpl类，读缓存用@Cacheable，存数据用@CachePut  
5.新建UserController，定义requestMapping，不同的url触发不同的业务方法。
