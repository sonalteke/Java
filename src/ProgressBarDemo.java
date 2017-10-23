import javax.swing.*;

public class ProgressBarDemo extends JFrame {
JProgressBar jb;
int i=0,num=0;
ProgressBarDemo(){
    jb=new JProgressBar(0,1000);
    jb.setBounds(50,50,500,200);
    jb.setValue(0);
    jb.setStringPainted(true);
    add(jb);
    setSize(600,500);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void iterate(){
    while(i<=2000){
        jb.setValue(i);
        i=i+20;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    public static void main(String[] args) {
        ProgressBarDemo p=new ProgressBarDemo();
        p.iterate();
    }
}
