/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author abdlmjeed
 */
public class MainController implements Initializable {

    private Label label;
    @FXML
    private ImageView workerPhoto;
    @FXML
    private TextField QRCode;
    @FXML
    private HBox hBoxBehindeTheBarcode;
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane root;
    @FXML
    private VBox vBoxOnScrollPane;

    @FXML
    private VBox vBoxHolderOfItems;
    @FXML
    private Button pay_Visa;
    @FXML
    private Button pay_Cash;
    @FXML
    private GridPane numPad;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

      
        
        
        //coooment
        
        
        vBoxHolderOfItems.getChildren().forEach((h) -> {
if(!(h.getStyle().contains(" linear-gradient(to bottom,lightblue,snow)"))){
            h.setOnMouseEntered(value -> {

                h.setStyle("-fx-background-color:lightgrey ; -fx-border-color: black ; -fx-border-width:  1px 0px 1px 0px ;");

                vBoxHolderOfItems.getChildren().forEach((s) -> ((HBox) h).getChildren().forEach((m) -> ((HBox) m).getChildren().forEach((b) -> {

                    if (b instanceof JFXButton) {
                        b.setVisible(true);

                    }

                })
                ));

            });

            h.setOnMouseExited(value -> {

                h.setStyle("-fx-background-color:snow ; -fx-border-color: black ; -fx-border-width:  1px 0px 1px 0px ;");
                                vBoxHolderOfItems.getChildren().forEach((s) -> ((HBox) h).getChildren().forEach((m) -> ((HBox) m).getChildren().forEach((b) -> {

                    if (b instanceof JFXButton) {
                        b.setVisible(false);

                    }

                })
                ));

            });
        }});

        Rectangle clip = new Rectangle(
                workerPhoto.getFitWidth(), workerPhoto.getFitHeight()
        );

        clip.setArcWidth(
                20);
        clip.setArcHeight(
                20);

        workerPhoto.setClip(clip);

        // snapshot the rounded image.
        SnapshotParameters parameters = new SnapshotParameters();

        parameters.setFill(Color.TRANSPARENT);
        WritableImage image = workerPhoto.snapshot(parameters, null);

        // remove the rounding clip so that our effect can show through.
        workerPhoto.setClip(
                null);

        // apply a shadow effect.
        // store the rounded image in the imageView.
        workerPhoto.setImage(image);
        // TODO------------------------------------------------------------------------
    }

    @FXML
    private void changeBackgroundcolor(MouseEvent event) {
        QRCode.setStyle("-fx-background-radius: 10px ; -fx-background-color: #969696;");
        hBoxBehindeTheBarcode.setStyle("-fx-background-radius: 10px ; -fx-background-color: #969696;");

    }

    @FXML
    private void changeBackgroundcolorback(MouseEvent event) {
        QRCode.setStyle(" -fx-background-radius: 10px ; -fx-background-color:  #cecfd1;");
        hBoxBehindeTheBarcode.setStyle(" -fx-background-radius: 10px ; -fx-background-color:  #cecfd1;");

    }

    @FXML
    private void keyBoard(KeyEvent event) {
        
        
        
        
    }

    @FXML
    private void showNumPad(MouseEvent event) {
        TranslateTransition s = new TranslateTransition(Duration.seconds(0.5), numPad);
        s.setFromX(1000);
        s.setToX(0);
        s.play();
        numPad.setVisible(true);
        
        
        
    }

    @FXML
    private void hideNumPad(ActionEvent event) {
        
           TranslateTransition s = new TranslateTransition(Duration.seconds(0.5), numPad);
        s.setToX(1000);
        
        s.play();
       
        
        
    }

}
