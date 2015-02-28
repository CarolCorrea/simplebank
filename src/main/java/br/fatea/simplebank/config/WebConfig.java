package br.fatea.simplebank.config;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration 
@EnableAsync 
@EnableWebMvc 
@ComponentScan(basePackages = "br.fatea.simplebank.*")

public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override 
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		HashMap<String, MediaType> mediaTypes = new HashMap<>(); 
		mediaTypes.put("xml", MediaType.APPLICATION_XML); 
		mediaTypes.put("json", MediaType.APPLICATION_JSON); 
		configurer.mediaTypes(mediaTypes) .defaultContentType(MediaType.APPLICATION_JSON) .favorParameter(false) .favorPathExtension(true); 
		super.configureContentNegotiation(configurer); 
	}
	
	@Bean
	public BCryptPasswordEncoder encoder(){
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		registry.viewResolver(viewResolver);
	}
}
