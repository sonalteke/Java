import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmult,bsub,badd,bdot,bequal,bdelete,bclear;
    JTextField text1;
    static double a=0,b=0,result=0;
    static int operator=0;
     Calculator(){
         setLayout(null);
         setTitle("Calculator");

         text1=new JTextField();
         text1.setBounds(30,40,320,50);
         add(text1);

         b1=new JButton("1");
         b2=new JButton("2");
         b3=new JButton("3");
         b4=new JButton("4");
         b5=new JButton("5");
         b6=new JButton("6");
         b7=new JButton("7");
         b8=new JButton("8");
         b9=new JButton("9");
         b0=new JButton("0");
         bdiv=new JButton("/");
         bmult=new JButton("*");
         bsub=new JButton("-");
         badd=new JButton("+");
         bdot=new JButton(".");
         bequal=new JButton("=");
         bdelete=new JButton("Delete");
         bclear=new JButton("Clear");

         b7.setBounds(30,120,70,40);
         add(b7);
         b7.addActionListener(this);
         b8.setBounds(110,120,70,40);
         add(b8);
         b8.addActionListener(this);
         b9.setBounds(190,120,70,40);
         add(b9);
         b9.addActionListener(this);
         bdiv.setBounds(270,120,70,40);
         add(bdiv);
         bdiv.addActionListener(this);

         b4.setBounds(30,170,70,40);
         add(b4);
         b4.addActionListener(this);
         b5.setBounds(110,170,70,40);
         add(b5);
         b5.addActionListener(this);
         b6.setBounds(190,170,70,40);
         add(b6);
         b6.addActionListener(this);
         bmult.setBounds(270,170,70,40);
         add(bmult);
         bmult.addActionListener(this);

         b1.setBounds(30,220,70,40);
         add(b1);
         b1.addActionListener(this);
         b2.setBounds(110,220,70,40);
         add(b2);
         b2.addActionListener(this);
         b3.setBounds(190,220,70,40);
         add(b3);
         b3.addActionListener(this);
         bsub.setBounds(270,220,70,40);
         add(bsub);
         bsub.addActionListener(this);

         bdot.setBounds(30,270,70,40);
         add(bdot);
         bdot.addActionListener(this);
         b0.setBounds(110,270,70,40);
         add(b0);
         b0.addActionListener(this);
         bequal.setBounds(190,270,70,40);
         add(bequal);
         bequal.addActionListener(this);
         badd.setBounds(270,270,70,40);
         add(badd);
         badd.addActionListener(this);

         bdelete.setBounds(30,320,150,40);
         add(bdelete);
         bdelete.addActionListener(this);
         bclear.setBounds(190,320,150,40);
         add(bclear);
         bclear.addActionListener(this);


        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Calculator c=new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
            text1.setText(text1.getText().concat("1"));
        if(e.getSource()==b2)
            text1.setText(text1.getText().concat("2"));
        if(e.getSource()==b3)
            text1.setText(text1.getText().concat("3"));
        if(e.getSource()==b4)
            text1.setText(text1.getText().concat("4"));
        if(e.getSource()==b5)
            text1.setText(text1.getText().concat("5"));
        if(e.getSource()==b6)
            text1.setText(text1.getText().concat("6"));
        if(e.getSource()==b7)
            text1.setText(text1.getText().concat("7"));
        if(e.getSource()==b8)
            text1.setText(text1.getText().concat("8"));
        if(e.getSource()==b9)
            text1.setText(text1.getText().concat("9"));
        if(e.getSource()==b0)
            text1.setText(text1.getText().concat("0"));
        if(e.getSource()==bdot)
            text1.setText(text1.getText().concat("."));
        if(e.getSource()==badd){
            a=Double.parseDouble(text1.getText());
            operator=1;
            text1.setText("");
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(text1.getText());
            operator=2;
            text1.setText("");
        }
        if(e.getSource()==bmult){
            a=Double.parseDouble(text1.getText());
            operator=3;
            text1.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(text1.getText());
            operator=4;
            text1.setText("");
        }
        if(e.getSource()==bequal){
            b=Double.parseDouble(text1.getText());
            switch (operator){
                case 1:result=a+b;
                break;
                case 2:result=a-b;
                break;
                case 3:result=a*b;
                break;
                case 4:result=a/b;
                break;
                default:result=0;
            }
            text1.setText(""+result);
        }
        if(e.getSource()==bclear)
            text1.setText("");
        if(e.getSource()==bdelete){
            String s=text1.getText();
            text1.setText("");
            for(int i=0;i<s.length()-1;i++)
                text1.setText(text1.getText()+s.charAt(i));
        }
    }
}
