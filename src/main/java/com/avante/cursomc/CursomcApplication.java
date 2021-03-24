package com.avante.cursomc;

import com.avante.cursomc.CategoriaResources.CategoriaResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = CategoriaResource.class)
public class CursomcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

}
