# jmx

## 开启JMX功能需要添加配置
```xml
spring:
  jmx:
    enabled: true
```
    
暴露为MBean后，可以通过jconsole访问

## 可以通过集成jolokia来使用HTTP形式访问MBean
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
    <groupId>org.jolokia</groupId>
    <artifactId>jolokia-core</artifactId>
</dependency>
```

### 添加配置
```xml
management:
  endpoint:
    jolokia:
      enabled: true
  endpoints:
    web:
      exposure:
        include: health,info,jolokia
```
      
### 通过访问：http://localhost:8080/actuator/jolokia
http://localhost:8080/actuator/jolokia/read/com.xiaxinyu.jmx.service:name=spideMpbServiceImpl 可以看到对应MBean属性