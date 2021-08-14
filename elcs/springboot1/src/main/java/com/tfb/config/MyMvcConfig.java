package com.tfb.config;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * 扩展springmvc,如果我们要拓展springmvc,官方建议这样去做
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //ViewResolver 实现了视图解析器接口的类，我们可以把它看成视图解析器

    @Bean
    public ViewResolver myMvcViewResolver(){
        return new MyViewResolver();
    }
    //自定义视图解析器
    static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptors()).addPathPatterns("/**")
                .excludePathPatterns("index.html","/","/user/login");
    }


}


