import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

public class MyProjectController {

    @FXML
    private Canvas canv;
    private GraphicsContext gc;
    
    public void initialize() {
    	gc = canv.getGraphicsContext2D();
   }

    @FXML
    void btmPressed(ActionEvent event) {
    	gc.clearRect(0, 0, canv.getWidth(), canv.getHeight());
    	final int SIZE = 10;
    	int x, y, w, h, type;
    	Random r = new Random();
    	for (int i=0; i<SIZE; i++) {
    		x = r.nextInt(400);
    		y = r.nextInt(400);
    		w = r.nextInt(200);
    		h = r.nextInt(200);
    		type = r.nextInt(3);
    		
    		gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
    		if (type==1)
    			gc.fillOval(x,y,w,h);
    		else if (type==2)
    			gc.fillRect(x,y,w,h);
    		else 
				gc.strokeLine(x,y,w,h);
    	}
    	
    }

}
