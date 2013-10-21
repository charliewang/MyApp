import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class MyJFrame {

	public MyJFrame(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyJPanel frameContent = new MyJPanel();
		
		Container visibleArea = getContentPane();
		visibaleArea.add(frameContent);
		
		show();
	}
	
}
