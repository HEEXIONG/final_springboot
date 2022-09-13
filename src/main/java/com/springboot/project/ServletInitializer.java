package com.springboot.project;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FinalSpringbootApplication.class);
<<<<<<< HEAD
	}
=======
>>>>>>> branch 'master' of https://github.com/HEEXIONG/final_springboot.git

	}
}
