import java.awt.*;
import java.awt.event.*;

class EtName extends KeyAdapter{
	Frame f;
	TextField tf,tf1;
	EtName(){
		public void keyTyped(KeyEvent e){
			System.out.print(e.getKeyChar());
		}	
	tf=new TextField();
	tf.setBounds(45,45,70,30);
	tf.setText("Invalid character.");
	f.add(tf);
	f=new Frame("Sum");
	tf1=new TextField();
	tf1.addKeyListener(new KeyEventListener());
	tf1.setBounds(55,45,70,30);
	f.add(tf1);
	f.setVisible(true);
	f.setLayout(null);
	Toolkit t=f.getToolkit();
	Dimension d=t.getScreenSize();
	int width=d.width*5/23;
	int height=d.height*5/10;
	f.setBounds(width/2,height/2,width,height);
	}	
		
		public static void main(String s[]){
			new EtName();
		}
}