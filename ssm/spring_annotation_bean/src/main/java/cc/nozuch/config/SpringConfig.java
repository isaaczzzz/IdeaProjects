package cc.nozuch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//纯注解开发配置
/*
@Component
    @Repository: 数据层
    @Service: 业务层
    @Controller: 表现层
*/
@Configuration //设定当前类为配置类
@ComponentScan("cc.nozuch") //扫描路径，多个路径需要用数组{}
@PropertySource("jdbc.properties") //property路径，多个用数组
public class SpringConfig {
}
