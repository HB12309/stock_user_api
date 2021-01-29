package cn.ebing.stock.user.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableTransactionManagement
@SpringBootApplication
public class UserApiApplication {

	public static void main(String[] args) {
		System.out.println("===== UserApiApplication 准备启动 =====");
		SpringApplication.run(UserApiApplication.class, args);
		System.out.println("===== UserApiApplication 启动完成 =====");
	}

}
