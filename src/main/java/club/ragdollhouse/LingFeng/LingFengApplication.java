package club.ragdollhouse.LingFeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("club.ragdollhouse.LingFeng.mapper")
public class LingFengApplication {

	//入口
	public static void main(String[] args) {
		//这个LingFengApplication就是你启动类的名字
		SpringApplication.run(LingFengApplication.class, args);
	}
}
