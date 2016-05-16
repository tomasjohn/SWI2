package cz.mendelu.seminar.swi2.bodycare.sampledata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "cz.mendelu.seminar.swi2.bodycare.bodycare.sampledata")
public class SampleDataConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private SampleData sampleData;

    @PostConstruct
    public void dataLoading() {
        sampleData.loadData();
    }
}