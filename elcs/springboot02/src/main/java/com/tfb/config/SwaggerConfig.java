package com.tfb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }

    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }

    //配置swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment){
        //配置swagger环境 设置要显示swagger的环境
        //Profiles profiles = Profiles.of("dev","test");
        //获取项目环境
        //boolean flag = environment.acceptsProfiles();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("翁克浩")//配置分组
                .enable(true) //配置是否启动swagger
                .select()
                //RequestHandlerSelectors.basePackage配置要扫描的包
                //RequestHandlerSelectors.withMethodAnnotation(GetMapping.class)配置扫描方法上的注解
                //RequestHandlerSelectors.withClassAnnotation(RestController.class)配置扫描类上的注解为其生成接口
                .apis(RequestHandlerSelectors.basePackage("com.tfb.controller"))
                //.paths(PathSelectors.ant("/tfb/**")) //过滤路径
                .build();//构建者模式
    }

    //配置swagger信息
    private ApiInfo apiInfo(){
        return new ApiInfo("weaken的swagger接口文档", "程序媛", "1.0", "urn:tos",
                new Contact("", "", ""), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

    }
}
