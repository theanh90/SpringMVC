package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"spittr.web", "spittr.data"})
public class WebConfig extends WebMvcConfigurerAdapter{

	// Configure a JSP view resolver
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	//  Configure static content handling
	//	WebConfig class extends WebMvcConfigurerAdapter and overrides
	//	its configureDefaultServletHandling() method. By calling enable() on the given
	//	DefaultServletHandlerConfigurer, you’re asking DispatcherServlet to forward
	//	requests for static resources to the servlet container’s default servlet and not to try to
	//	handle them itself
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
