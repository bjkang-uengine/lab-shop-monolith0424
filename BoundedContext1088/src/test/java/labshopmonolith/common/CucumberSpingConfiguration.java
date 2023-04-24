package labshopmonolith.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolith.BoundedContext1088Application;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1088Application.class })
public class CucumberSpingConfiguration {}
