package startPage;


import com.sun.javaws.exceptions.ExitException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

import static javafx.application.Application.launch;


public class uegVideo extends Application {
    //swing不支持视频，需要使用javaFX的media
        @Override
        public void start(Stage primaryStage){

            /**
             * 2.3.Image加载项目ClassPath图片资源
             *跳出javafxdemo包到他的父类写也就是classes路径下
             *…/resources/cat.jpg
             *
             */
            Media md=null;
              try {
                md = new Media(new File("ueg_gov/video/ueg_moss.mp4").toURI().toString());
            } catch (IllegalArgumentException e){//嵌套swing

            } catch (RuntimeException e){//嵌套swing

            }
            MediaPlayer mP1=new MediaPlayer(md);
            MediaView mediaView = new MediaView(mP1);
            mediaView.setFitWidth(1080);
            mediaView.setFitHeight(610);
            mP1.volumeProperty().set(0.1);
            StackPane sP = new StackPane();//swing 中的 Jpanel
            sP.getChildren().add(mediaView);
            //窗口图标在JavaFX程序中与Stage对象关联。其实本身就是一个Image对象
            Scene scene = new Scene(sP, 1060, 590);
            primaryStage.getIcons().add(new Image("ueg_gov/image/ueg_gov.png"));
            primaryStage.setTitle("UEG Video Player");//swing 中的 jframe
            primaryStage.setScene(scene);
            primaryStage.show();
            mP1.play();
            mP1.currentTimeProperty().addListener((observable, oldTime, newTime) -> {
                if(newTime==null){


                }
            });
    }

    public static void main(String[] args) {



        launch(args);

    }
}
