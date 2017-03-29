package haust.vk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("haust.vk.dao")
//默认 basePackages
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
