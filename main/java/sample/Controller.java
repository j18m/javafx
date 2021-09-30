package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import utils.Fofa;
import utils.HttpUtils;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private TextField text1;
    @FXML
    private Button btn2;
    @FXML
    private ImageView img;
//    https://www.bilibili.com/favicon.ico

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        btn1.setOnAction(event -> {
//            System.out.println("Button Clicked!");
//            Date now= new Date();
//            DateFormat df = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
//            String dateTimeString = df.format(now);
//            // Show in VIEW
//            text1.setText(dateTimeString);
//        });
        System.out.println("controller Start");
        btn1.setOnAction(this::showDateTime);
        btn2.setOnAction(this::getTitle);


        img.setImage(new Image("https://t7.baidu.com/it/u=4198287529,2774471735&fm=193&f=GIF"));


    }


    public void showDateTime(ActionEvent event) {
        System.out.println("Button Clicked!");
        Date now= new Date();
        DateFormat df = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dateTimeString = df.format(now);
        // Show in VIEW
        text1.setText(dateTimeString);
    }

    public void changeImg(ActionEvent event){ }

    public void getTitle(ActionEvent event) {
        System.out.println("strat getTitle");
        String title = null;
//        try {
//              HttpUtils hu = new HttpUtils();
////            title= HttpUtils.reg(HttpUtils.doGet(Fofa.BASEURL));
//              hu.doGet(Fofa.BASEURL);
////            System.out.println("pass");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        if(title!=null){
//            text1.setText(title);
//        }


    }




}
