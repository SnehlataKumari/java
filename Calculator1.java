import java.awt.*;
import java.awt.event.*;
class Calculator1 implements ActionListener{
	Frame f;
	TextField tf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
	
	Calculator1(String c){
	f=new Frame(c);
	tf=new TextField();
	tf.setBounds(40,50,250,30);
	f.add(tf);
	
	b1=new Button("%");
	b1.setBounds(40,100,50,50);
	b1.addActionListener(this);
	f.add(b1);
	
	b2=new Button("CE");
	b2.setBounds(90,100,50,50);
	b2.addActionListener(this);
	f.add(b2);
	
	b3=new Button("C");
	b3.setBounds(140,100,50,50);
	b3.addActionListener(this);
	f.add(b3);
	
	b4=new Button("x");
	b4.setBounds(190,100,50,50);
	b4.addActionListener(this);
	f.add(b4);
	
	b5=new Button("/");
	b5.setBounds(240,100,50,50);
	b5.addActionListener(this);
	f.add(b5);
	
	b6=new Button("X^2");
	b6.setBounds(40,160,50,50);
	b6.addActionListener(this);
	f.add(b6);
	
	b7=new Button("7");
	b7.setBounds(90,160,50,50);
	b7.addActionListener(this);
	f.add(b7);
	
	b8=new Button("8");
	b8.setBounds(140,160,50,50);
	b8.addActionListener(this);
	f.add(b8);
	
	b9=new Button("9");
	b9.setBounds(190,160,50,50);
	b9.addActionListener(this);
	f.add(b9);
	
	b10=new Button("*");
	b10.setBounds(240,160,50,50);
	b10.addActionListener(this);
	f.add(b10);
	
	b11=new Button("");
	b11.setBounds(40,220,50,50);
	b11.addActionListener(this);
	f.add(b11);
	
	b12=new Button("4");
	b12.setBounds(90,220,50,50);
	b12.addActionListener(this);
	f.add(b12);
	
	b13=new Button("5");
	b13.setBounds(140,220,50,50);
	b13.addActionListener(this);
	f.add(b13);
	
	b14=new Button("6");
	b14.setBounds(190,220,50,50);
	b14.addActionListener(this);
	f.add(b14);
		
	b15=new Button("-");
	b15.setBounds(240,220,50,50);
	b15.addActionListener(this);
	f.add(b15);
	
	b16=new Button("x^3");
	b16.setBounds(40,280,50,50);
	b16.addActionListener(this);
	f.add(b16);
	
	b17=new Button("1");
	b17.setBounds(90,280,50,50);
	b17.addActionListener(this);
	f.add(b17);
	
	b18=new Button("2");
	b18.setBounds(140,280,50,50);
	b18.addActionListener(this);
	f.add(b18);
	
	b19=new Button("3");
	b19.setBounds(190,280,50,50);
	b19.addActionListener(this);
	f.add(b19);
	
	b20=new Button("+");
	b20.setBounds(240,280,50,50);
	b20.addActionListener(this);
	f.add(b20);
	
	b21=new Button("1/x");
	b21.setBounds(40,340,50,50);
	b21.addActionListener(this);
	f.add(b21);		
	
	b22=new Button("+-");
	b22.setBounds(90,340,50,50);
	b22.addActionListener(this);
	f.add(b22);		
	
	b23=new Button("0");
	b23.setBounds(140,340,50,50);
	b23.addActionListener(this);
	f.add(b23);		
		
	b24=new Button(".");
	b24.setBounds(190,340,50,50);
	b24.addActionListener(this);
	f.add(b24);		
		
	b25=new Button("=");
	b25.setBounds(240,340,50,50);
	b25.addActionListener(this);
	f.add(b25);
	
	f.setLayout(null);
	f.setVisible(true);
	
	Toolkit t = f.getToolkit( );
	Dimension screenSize=t.getScreenSize();
	int width=screenSize.width*5/23;
	int height=screenSize.height*5/10;
	f.setBounds(width/2,height/2,width,height);
	}
		public static void main(String args[]){
		new Calculator1("Calculator");
		}
	public void actionPerformed(ActionEvent a){
		System.out.println("Ap");
		if(a.getSource()==b1){tf.setText("%");}
		if(a.getSource()==b2){tf.setText("CE");}
		if(a.getSource()==b3){tf.setText("C");}
		if(a.getSource()==b4){tf.setText("x");}
		if(a.getSource()==b5){tf.setText("/");}
		if(a.getSource()==b6){tf.setText("x^2");}
		if(a.getSource()==b7){tf.setText("8");}
		if(a.getSource()==b8){tf.setText("7");}
		if(a.getSource()==b9){tf.setText("9");}
		if(a.getSource()==b10){tf.setText("*");}
		if(a.getSource()==b11){tf.setText("");}
		if(a.getSource()==b12){tf.setText("4");}
		if(a.getSource()==b13){tf.setText("5");}
		if(a.getSource()==b14){tf.setText("6");}
		if(a.getSource()==b15){tf.setText("-");}
		if(a.getSource()==b16){tf.setText("1");}
		if(a.getSource()==b17){tf.setText("2");}
		if(a.getSource()==b18){tf.setText("3");}
		if(a.getSource()==b19){tf.setText("x^3");}
		if(a.getSource()==b20){tf.setText("+");}
		if(a.getSource()==b21){tf.setText("1/x");}
		if(a.getSource()==b22){tf.setText("+-");}
		if(a.getSource()==b23){tf.setText("0");}
		if(a.getSource()==b24){tf.setText(".");}
		if(a.getSource()==b25){tf.setText("=");}
		
	}
			
}