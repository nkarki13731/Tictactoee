import java.awt.*;
import  java.awt.event.*;
class Fdemo extends Frame implements ActionListener{
    Button b[] = new Button[9];
    Button b1 ;
    int k = 0;
    int x = 8;
    int y = 28;
    int a = 0; //0 or X
    int z = 0, z1 = 0, z2 =0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0;

    Fdemo(){
        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.white);
        setForeground(Color.black);
        for(int i = 0; i<3; ++i){
            for(int j = 0; j<3; ++j){
                b[k] = new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x,y);
                b[k].setFont(new Font("",Font.BOLD,40));
                add(b[k]);
                b[k].addActionListener(this);
                b[k].setBackground(new Color(255,141,28));//orange color
                k++;
                x+=100;


            }
            x =8;
            y =y+100;
        }
        b1 = new Button("New Game");
        b1.setSize(150,40);
        b1.setLocation(500,300);
        b1.setFont(new Font("",Font.BOLD,20));

        add(b1);
        b1.addActionListener(this);
    }
    @java.lang.Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == b1){
            for(int i = 0; i < 9; i++ ){
                b[i].setLabel("");
            }
            z = 0; z1 = 0; z2 =0; z3=0; z4=0; z5=0; z6=0; z7=0; z8=0;
        }

    }
}

public class Ticktactoee {  
    public static void main(String[] args) {
        Fdemo f = new Fdemo();

    }
}
