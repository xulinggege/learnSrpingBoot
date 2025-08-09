package com.xs.springboot;



import com.xs.springboot.service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ioc= SpringApplication.run(SpringbootApplication.class, args);
        IUserService userService = ioc.getBean(IUserService.class);
        userService.getUser();
    }

    /*
     *bean意味着被Spring容器管理
     * @Bean
     * @Component 注解，表示这个类被Spring容器管理。ConfigurableApplicationContext
     * new ApplicationContext() 就是创建整个容器。 概念态的bean。
     * @Bean注解，表示这个方法返回一个bean，这个bean会交给Spring容器管理。
     * 如何配置Bean :xml,@Bean,@Component,@Configuration,@Service,@Controller,@Repository,@ComponentScan,@Autowired,@Resource,@Inject,@PostConstruct,@PreDestroy,@Scope,@Lazy,@Primary,@Qualifier,@Value,@Import,@ImportResource,@Conditional,@Order,@EventListener,@Async,@Cacheable,@CachePut,@CacheEv
     */

}
