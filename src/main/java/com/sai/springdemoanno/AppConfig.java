/**
 * 
 */
package com.sai.springdemoanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sv
 *
 */

@Configuration
@ComponentScan("com.sai.springdemoanno")
public class AppConfig {
	
/*
 * We can create bean also by adding the @Component Annotation in Respective Class
 */
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new SnapDragon();
//	}

}
