package cz.mendelu.seminar.swi2.bodycare.service.config;

import cz.mendelu.seminar.swi2.bodycare.utils.EmbeddedDerbyDatabase;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@Import(EmbeddedDerbyDatabase.class)
@ComponentScan(basePackages = "cz.mendelu.seminar.swi2.bodycare.service")
public class ServiceConfiguration {

    @Bean
    public Mapper dozer() {
	DozerBeanMapper dozer = new DozerBeanMapper();
	return dozer;
    }
}
