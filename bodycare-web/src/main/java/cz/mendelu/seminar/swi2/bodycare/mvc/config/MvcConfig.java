package cz.mendelu.seminar.swi2.bodycare.mvc.config;

import cz.mendelu.seminar.swi2.bodycare.sampledata.SampleDataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.validation.Validator;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@EnableWebMvc
@Configuration
@Import({SampleDataConfig.class})
@ComponentScan(basePackages = "cz.mendelu.seminar.swi2.bodycare.mvc")
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
	registry.addViewController("/").setViewName("index");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
    }

    @Bean
    public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/jsp/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
    }

    @Bean
    public Validator validator() {
	return new LocalValidatorFactoryBean();
    }

}
