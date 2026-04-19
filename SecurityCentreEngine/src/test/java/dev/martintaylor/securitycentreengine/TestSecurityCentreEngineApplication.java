package dev.martintaylor.securitycentreengine;

import org.springframework.boot.SpringApplication;

public class TestSecurityCentreEngineApplication {

    public static void main(String[] args) {
        SpringApplication.from(SecurityCentreEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
