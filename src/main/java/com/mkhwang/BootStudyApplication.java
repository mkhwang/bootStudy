package com.mkhwang;

import com.mkhwang.resolver.ReaderHandlerMethodArgumentResolver;
import com.sun.rowset.internal.XmlReaderContentHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class BootStudyApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(BootStudyApplication.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
		//Reader 타입의 객체가 컨트롤러 매개변수로 있을 때 처리할 리졸버 설정
		argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
	}

}