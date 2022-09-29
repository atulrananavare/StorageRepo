package com.javatechie;

import com.javatechie.annotations.MyAnnotations;
import com.javatechie.entity.Demo;
import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class StorageServiceApplication {
    static Logger logger
            = Logger.getLogger(StorageServiceApplication.class.getName());


    //This is change in the application
    public static void main(String[] args) {
        SpringApplication.run(StorageServiceApplication.class, args);


        Demo d = new Demo();
        Class aClass = d.getClass();
        logger.info(String.valueOf(aClass));

        boolean annotation = aClass.isAnnotationPresent(MyAnnotations.class);
        logger.info(String.valueOf(annotation));

        MyAnnotations anno = (MyAnnotations) aClass.getAnnotation(MyAnnotations.class);

        logger.info(anno.name());
        logger.info(String.valueOf(anno.value()));
    }

}
