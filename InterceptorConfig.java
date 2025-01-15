package com.clickit.inteceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private UserInterceptor userInterceptor;

    @Autowired
    private AdminInterceptor adminInterceptor;

    @Autowired
    private ShopInterceptor shopInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(userInterceptor)
//                .addPathPatterns("/user/**")
//                .addPathPatterns("/address/**")
//                .excludePathPatterns("/user/login", "/user/signup");
//        registry.addInterceptor(adminInterceptor).addPathPatterns("/admin/**");
//        registry.addInterceptor(shopInterceptor).addPathPatterns("/shop/**").excludePathPatterns("/shop/register");
    }
}
