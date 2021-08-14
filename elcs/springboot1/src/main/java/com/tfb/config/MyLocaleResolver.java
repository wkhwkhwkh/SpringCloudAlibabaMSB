package com.tfb.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class MyLocaleResolver implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的语言参数
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(language)){
            //zh_CN
            String [] splitStr = language.split("-");
            //国家地区
            locale = new Locale(splitStr[0],splitStr[1]);
        }
        return locale;
    }

    //
    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
