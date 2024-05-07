import java.awt.*;
import  java.awt.event.*;
class Fdemo extends Frame implements ActionListener {
    private Button b[][] = new Button[3][3];
    private Button b1;
//    private int k = 0;
    private int x = 8;
    private int y = 28;
    private int a = 0; //0 or X
    private int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0, z7 = 0, z8 = 0;

    Fdemo() {
        this.setLayout(null);
        this. setVisible(true);
        this.setSize(800, 600);
        this.setLocation(400, 100);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.b[i][j] = new Button();
                this.b[i][j].setSize(100, 100);
                this.b[i][j].setLocation(x, y);
                this.b[i][j].setFont(new Font("", Font.BOLD, 40));
                this.add(b[i][j]);
                this.b[i][j].addActionListener(this);
                this.b[i][j].setBackground(new Color(255, 141, 28));//orange color
                this.x+=100;

            }
            this.x = 8;
            this.y = y + 100;

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



        this.b1 = new Button("New Game");
        this.b1.setSize(150, 40);
        this.b1.setLocation(500, 300);
        this.b1.setFont(new Font("", Font.BOLD, 20));

        this.add(b1);
        this.b1.addActionListener(this);
    }

    @java.lang.Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        //settifng button for newGame
        if(e.getSource() == this.b1){
            for(int i = 0; i < 3; i++ ){
                for(int j = 0 ; j<3; j++ ){
                    this.b[i][j].setLabel("");
                }

            }
            this.z = 0; this.z1 = 0; this.z2 =0; this.z3=0; this.z4=0; this.z5=0; this.z6=0; this.z7=0; this.z8=0;
        }

        // setting other buttons as per the player input
        else if (e.getSource() == this.b[0][0] ) {
            if(this.a%2==0){
                this.b[0][0].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                b[0][0].setLabel("X");
                a++;
                z++;
            }

        }

        else if  (e.getSource() == this.b[0][1] ){
            if(this.a%2==0){
                this.b[0][1].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[0][1].setLabel("X");
                this.a++;
                this.z++;
            }
        }


        else if (e.getSource() == this.b[0][2] ){
            if(this.a%2==0){
                this.b[0][2].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[0][2].setLabel("X");
                this.a++;
                this.z++;
            }
        }
        else if(e.getSource() == this.b[1][0] ){
            if(this.a%2==0){
                this.b[1][0].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[1][0].setLabel("X");
                this.a++;
                this.z++;
            }
        }
        else if(e.getSource() == this.b[1][1] ){
            if(this.a%2==0){
                this.b[1][1].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[1][1].setLabel("X");
                this.a++;
                this. z++;
            }
        }
        else if(e.getSource() == this.b[1][2] ){
            if(this.a%2==0){
                this.b[1][2].setLabel("O");
                this. a++;
                this.z++;
            }
            else {
                this.b[1][2].setLabel("X");
                this.a++;
                this.z++;
            }
        }
        else if(e.getSource() == this.b[2][0]){
            if(this.a%2==0){
                this.b[2][0].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[2][0].setLabel("X");
                this.a++;
                this.z++;
            }
        }
         else if(e.getSource() == this.b[2][1] ){
            if(a%2==0){
                this.b[2][1].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[2][1].setLabel("X");
                this.a++;
                this.z++;
            }
        }
        else if(e.getSource() == this.b[2][2] ){
            if(this.a%2==0){
                this.b[2][2].setLabel("O");
                this.a++;
                this.z++;
            }
            else {
                this.b[2][2].setLabel("X");
                this.a++;
                this. z++;
            }
        }


    }

}

public class Ticktactoee {
    public static void main(String[] args) {
        Fdemo f = new Fdemo();

    }
}
