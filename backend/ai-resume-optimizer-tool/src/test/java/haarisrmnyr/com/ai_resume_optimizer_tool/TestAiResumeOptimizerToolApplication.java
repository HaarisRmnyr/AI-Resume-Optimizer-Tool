package haarisrmnyr.com.ai_resume_optimizer_tool;

import org.springframework.boot.SpringApplication;

public class TestAiResumeOptimizerToolApplication {

	public static void main(String[] args) {
		SpringApplication.from(AiResumeOptimizerToolApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
