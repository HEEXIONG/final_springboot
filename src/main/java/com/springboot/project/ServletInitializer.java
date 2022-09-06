package com.springboot.project;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
<<<<<<< HEAD
		return application.sources(FinalSpringbootApplication.class);
=======
		return application.sources(FinalProjectApplication.class);
>>>>>>> refs/heads/KMH
	}

}
