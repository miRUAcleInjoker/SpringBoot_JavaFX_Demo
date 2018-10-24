package com.neo.demo;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
        launch(DemoApplication.class,StartView.class,args);
    }
}
