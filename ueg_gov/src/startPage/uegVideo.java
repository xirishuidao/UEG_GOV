package startPage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class uegVideo extends Application {
    //swing不支持视频，需要使用javaFX的media

    private MediaView mediaView1;
    private MediaView mediaView2;
    private boolean isView1Active = true;
        @Override
        public void start(Stage primaryStage){//传入一个页面框架，默认调用

            /**
             * 2.3.Image加载项目ClassPath图片资源
             *跳出javafxdemo包到他的父类写也就是classes路径下
             *…/resources/cat.jpg
             *
             */

            Media md=null,mm=null;
            Image ugimg=null;
              try {
                  md = new Media(getClass().getResource("/main/resource/ueg_moss.mp4").toString());//接受string
                  ugimg = new Image(getClass().getResourceAsStream("/main/resource/ueg_gov.png"));//接受流文件
                  mm=new Media(getClass().getResource("/main/resource/mountocean.mp4").toString());
                  //mt;
            } catch (IllegalArgumentException e){//嵌套swing

            } catch (RuntimeException e){//嵌套swing

            }
                MediaPlayer mP1=new MediaPlayer(md);
                mediaView1 = new MediaView(mP1);
                mediaView1.setFitWidth(1080);
                mediaView1.setFitHeight(610);
                mP1.volumeProperty().set(0.1);

                MediaPlayer mP2=new MediaPlayer(mm);
                mediaView2 = new MediaView(mP2);
                mediaView2.setFitWidth(1080);
                mediaView2.setFitHeight(610);
                mP2.volumeProperty().set(0.1);


            StackPane sP = new StackPane();//页面的栈，可以切换页面
            sP.getChildren().add(mediaView1);




            //窗口图标在JavaFX程序中与Stage对象关联。其实本身就是一个Image对象
            Scene scene = new Scene(sP, 1060, 590);
            primaryStage.getIcons().add(ugimg);
            //LanguageUtil uvl = new LanguageUtil();
            //primaryStage.setTitle(uvl.PageTitle);//swing 中的 jframe




            primaryStage.setScene(scene);
            primaryStage.show();
            mP1.play();
            // 设置当媒体播放完毕时执行的操作
            mP1.setOnEndOfMedia(() -> {
                System.out.println("媒体播放完毕，正在停止...");
                mP1.stop(); // 停止播放
                System.out.println("播放器状态: " + mP1.getStatus()); // 应该打印出 STOP
            });



            mP1.statusProperty().addListener((observable, oldStatus, newStatus) -> {
                System.out.println("Old Status: " + oldStatus + ", New Status: " + newStatus);
                if (newStatus == MediaPlayer.Status.STOPPED) {
                    //从一个界面跳转到另外一个新的界面
                    //同一个布局中加载不同的界面, 使用StackPane进行界面切换
                    //StackPane允许你将多个节点堆叠在一起，并通过设置某个节点的可见性或将其置于顶部来显示不同的界面。
                    System.out.println("播放器已停止");

                    //更换mp4
                   sP.getChildren().remove(mediaView1); // 从布局中移除当前视频视图
                    sP.getChildren().add(mediaView2); // 添加新的视频视图到布局
                    mP2.play(); // 播放新的视频

                }
            });



            mP2.setOnEndOfMedia(() -> {
                mP2.stop(); // 停止播放
            });
            mP2.statusProperty().addListener((observable, oldStatus, newStatus) -> {
                if (newStatus == MediaPlayer.Status.STOPPED) {
                primaryStage.close();
                }
            });
    }


    public static void main(String[] args) {
        launch(args);
        ChooseLanguagePage.main(args);
    }
}
