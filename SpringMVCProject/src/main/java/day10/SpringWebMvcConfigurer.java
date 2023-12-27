package day10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class SpringWebMvcConfigurer implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/pages/";
		String suffix = ".jsp";
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(suffix);
		return viewResolver;
	}
}
