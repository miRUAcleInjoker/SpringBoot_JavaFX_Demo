package com.neo.demo.util;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JavaFxViewUtil {
    /*跳转窗口*/
    public static void toNewStage(String title, String iconUrl, Parent root) {
        Stage newStage = new Stage();
        newStage.setTitle(title);
        //为当前的stage 指定模式，他必须在stage显示之前被调用，否则他会引发异常。
        newStage.initModality(Modality.NONE);
        newStage.setScene(new Scene(root));
        newStage.setResizable(false);
        newStage.show();
    }
}
