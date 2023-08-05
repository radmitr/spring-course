package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Configuration
@ComponentScan("aop")
@PropertySource("classpath:myApp2.properties")
@EnableAspectJAutoProxy
public class MyConfig {
}
