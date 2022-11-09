package mvc.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc //Pour pouvoir travailler avec SpringMvc
@ComponentScan(basePackages = "mvc.rest")

public class SpringMvcConfiguration extends WebMvcConfigurationSupport {
}