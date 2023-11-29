package fr.sorbonne.paris.nord.university.tpteamshandlingapi;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.modelmapper.ModelMapper;

@SpringBootApplication
public class TpTeamsHandlingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpTeamsHandlingApiApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

//	@Bean
//	public ModelMapper modelMapper() {
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
//		return modelMapper;
//	}
}
