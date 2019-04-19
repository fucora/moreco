package xyz.weechang.moreco.component.gen.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import xyz.weechang.moreco.data.jpa.JpaBaseRepositoryFactoryBean;

/**
 * 自动配置
 *
 * @author zhangwei
 * date 2019/2/13
 * time 13:43
 */
@ComponentScan(value = {"xyz.weechang.moreco.component.gen"})
@EntityScan("xyz.weechang.moreco.component")
@EnableJpaRepositories(
        basePackages = {"xyz.weechang.moreco.component"},
        repositoryFactoryBeanClass = JpaBaseRepositoryFactoryBean.class)
@Configuration
public class GenAutoConfiguration {

}