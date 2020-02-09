package todo.platform.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import todo.platform.api.config.ApiConfig;

@SpringBootApplication
@Import(ApiConfig.class)
@EnableJpaRepositories(basePackages = { "todo.core.ta" })
@ComponentScan(basePackages = { "todo.core.ta" })
@EntityScan(basePackages = { "todo.core.ta" })
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class);
	}

}
