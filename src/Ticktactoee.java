import java.awt.*;
import  java.awt.event.*;
class Fdemo extends Frame implements ActionListener {
    Button b[][] = new Button[3][3];
    //    Button b[] = new Button[9];
    Button b1;
    int k = 0;
    int x = 8;
    int y = 28;
    int a = 0; //0 or X
    int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0, z7 = 0, z8 = 0;
    private Frame secondFrame;

    Fdemo() {
        setLayout(null);
        setVisible(true);
        setSize(800, 600);
        setLocation(400, 100);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = new Button();
                b[i][j].setSize(100, 100);
                b[i][j].setLocation(x, y);
                b[i][j].setFont(new Font("", Font.BOLD, 40));
                add(b[i][j]);
                b[i][j].addActionListener(this);
                b[i][j].setBackground(new Color(255, 141, 28));//orange color
                x+=100;

            }
            x = 8;
            y = y + 100;

        }
//
//        for(int i = 0; i<3; ++i){
//            for(int j = 0; j<3; ++j){
//                b[k] = new Button();
//                b[k].setSize(100,100);
//                b[k].setLocation(x,y);
//                b[k].setFont(new Font("",Font.BOLD,40));
//                add(b[k]);
//                b[k].addActionListener(this);
//                b[k].setBackground(new Color(255,141,28));//orange color
//                k++;
//
//
//
//            }



        b1 = new Button("New Game");
        b1.setSize(150, 40);
        b1.setLocation(500, 300);
        b1.setFont(new Font("", Font.BOLD, 20));

        add(b1);
        b1.addActionListener(this);
    }

    @java.lang.Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        //settifng button for newGame
        if(e.getSource() == b1){
            for(int i = 0; i < 3; i++ ){
                for(int j = 0 ; j<3; j++ ){
                    b[i][j].setLabel("");
                }

            }
            z = 0; z1 = 0; z2 =0; z3=0; z4=0; z5=0; z6=0; z7=0; z8=0;
        }

        // setting other buttons as per the player input
        if(e.getSource() == b[0] && z ==0);{
            if(a%2==0){
                b[0].setLabel("O");
                a++;
                z++;
            }
            else {
                b[0].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[1] && z1 ==0);{
            if(a%2==0){
                b[1].setLabel("O");
                a++;
                z++;
            }
            else {
                b[1].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[2] && z2 ==0);{
            if(a%2==0){
                b[2].setLabel("O");
                a++;
                z++;
            }
            else {
                b[2].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[3] && z3 ==0);{
            if(a%2==0){
                b[3].setLabel("O");
                a++;
                z++;
            }
            else {
                b[3].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[4] && z4 ==0);{
            if(a%2==0){
                b[4].setLabel("O");
                a++;
                z++;
            }
            else {
                b[4].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[5] && z5 ==0);{
            if(a%2==0){
                b[5].setLabel("O");
                a++;
                z++;
            }
            else {
                b[5].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[6] && z6 ==0);{
            if(a%2==0){
                b[6].setLabel("O");
                a++;
                z++;
            }
            else {
                b[6].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[7] && z7 ==0);{
            if(a%2==0){
                b[7].setLabel("O");
                a++;
                z++;
            }
            else {
                b[7].setLabel("X");
                a++;
                z++;
            }
        }
        if(e.getSource() == b[8] && z8 ==0);{
            if(a%2==0){
                b[8].setLabel("O");
                a++;
                z++;
            }
            else {
                b[8].setLabel("X");
                a++;
                z++;
            }
        }


    }

}

public class Ticktactoee {
    public static void main(String[] args) {
        Fdemo f = new Fdemo();

    }
}
