package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan //서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	//Bean등록으로도 controller실행 가능 다만 Componet만 등록되므로
	//@RequestMapping을 controller에 달아줘야 RequestMappingHandlerMapping가 mapping정보로 인식하여 등록함

	/*@Bean
	SpringMemberFormControllerV1 SpringMemberFormControllerV1(){
		return new SpringMemberFormControllerV1();
	}*/

}
