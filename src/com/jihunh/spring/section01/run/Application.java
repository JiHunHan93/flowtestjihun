package com.jihunh.spring.section01.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jihunh.spring.section01.model.dto.MgDTO;
import com.jihunh.spring.section01.model.service.MgService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("com/jihunh/spring/section01/config/spring.xml");
		
		MgService mgService = context.getBean(MgService.class);
		
		List<MgDTO> memberList = mgService.selectMgList();
		for(MgDTO member : memberList) {
			System.out.println(member);
		}
		
		String[] names = context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println("Bean : " + name);
		}
		
		System.out.println("난 이제 지쳤어요 땡벌");
		
		System.out.println("완규형이 시키신 작업");

		System.out.println("빠르게 확ㅇ린");
		
		System.out.println("이렇게 수정");
		
	}

}
