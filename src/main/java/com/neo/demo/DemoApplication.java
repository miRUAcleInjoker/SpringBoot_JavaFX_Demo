package com.neo.demo;

import com.neo.demo.view.StartView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
        launch(DemoApplication.class, StartView.class,args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //调整stage
        stage.setResizable(false);
        stage.setTitle("登录");
        super.start(stage);
    }

}
