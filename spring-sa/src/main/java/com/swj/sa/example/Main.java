package com.swj.sa.example;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.swj.sa.example.model.Foo;
import com.swj.sa.example.service.FooService;

@Component
public class Main {
	
	private static final String[] CONTEXT = {"spring.xml", "spring/applicationContext-data.xml"};
	
	@Resource
	private FooService fooService;
	
	@Value("${foo.no}")
	private int fooNo;
	
    public static void main(String[] args) {
    	
    	((Main) new ClassPathXmlApplicationContext(CONTEXT).getBean("main")).job();
    	
    }
    
    public void job() {
    	
    	System.out.println ("Start job ..");
    	
    	List<Foo> fooList = fooService.getFoos();
    	
    	Foo foo = fooService.getFoo(fooNo);
    	
    	//TODO do something with foo .... 
    	
    	System.out.println (foo);
    	System.out.println (fooList);
    	
    	System.out.println ("Complete ..");
    }
}
