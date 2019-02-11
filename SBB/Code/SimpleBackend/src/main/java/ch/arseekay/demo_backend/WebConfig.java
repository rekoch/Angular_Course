package ch.arseekay.demo_backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
   @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
       corsRegistry.addMapping("localhost:8080");
   }
}