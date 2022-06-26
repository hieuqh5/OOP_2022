import java.io.IOException;

import cnode.CNode;
import view.AnimationController;
import view.MainWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
  private Stage stage;
  private Scene scene1;

  private Button button1;
  
  private Scene scene2;

  @Override
  public void start(Stage stage) {
    scene2 = createSceneTwo();
    stage.setTitle("Visual Sorting Algorithms");
    stage.setScene(scene2);
    stage.show();
  }

  

  private Scene createSceneTwo() {
    AnimationController animationController = new AnimationController();
    scene2 = new Scene(animationController,
                            AnimationController.WINDOW_WIDTH,
                            AnimationController.WINDOW_HEIGHT);
    return scene2;
  }

  public void switchScenes(Scene scene){
    stage.setScene(scene);
  }  

  public static void main(String[] args) {
    Application.launch(args);
  }
}
