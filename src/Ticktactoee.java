//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Fdemo extends Frame implements ActionListener {
    Button[] b = new Button[9];
    Button b1;
    int k = 0;
    int x = 8;
    int y = 28;
    int a = 0;
    int z = 0;
    int z1 = 0;
    int z2 = 0;
    int z3 = 0;
    int z4 = 0;
    int z5 = 0;
    int z6 = 0;
    int z7 = 0;
    int z8 = 0;
    int l = 70;

    Fdemo() {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setSize(800, 600);
        this.setLocation(400, 100);
        this.setBackground(Color.black);
        this.setForeground(Color.white);

        for(int var1 = 1; var1 <= 3; ++var1) {
            for(int var2 = 1; var2 <= 3; ++var2) {
                this.b[this.k] = new Button();
                this.b[this.k].setSize(100, 100);
                this.b[this.k].setLocation(this.x, this.y);
                this.b[this.k].setFont(new Font("", 1, 40));
                this.add(this.b[this.k]);
                this.b[this.k].addActionListener(this);
                this.b[this.k].setBackground(new Color(255, 141, 28));
                ++this.k;
                this.x += 100;
            }

            this.x = 8;
            this.y += 100;
        }

        this.b1 = new Button("New Game");
        this.b1.setSize(150, 40);
        this.b1.setLocation(500, 300);
        this.b1.setFont(new Font("", 1, 20));
        this.b1.setForeground(Color.black);
        this.add(this.b1);
        this.b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent var1) {
        if (var1.getSource() == this.b1) {
            for(int var2 = 0; var2 <= 8; ++var2) {
                this.b[var2].setLabel("");
            }

            this.z = 0;
            this.z1 = 0;
            this.z2 = 0;
            this.z3 = 0;
            this.z4 = 0;
            this.z5 = 0;
            this.z6 = 0;
            this.z7 = 0;
            this.z8 = 0;
        }

        if (var1.getSource() == this.b[0] && this.z == 0) {
            if (this.a % 2 == 0) {
                this.b[0].setLabel("O");
                ++this.z;
                ++this.a;
            } else {
                this.b[0].setLabel("X");
                ++this.z;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[1] && this.z1 == 0) {
            if (this.a % 2 == 0) {
                this.b[1].setLabel("O");
                ++this.z1;
                ++this.a;
            } else {
                this.b[1].setLabel("X");
                ++this.z1;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[2] && this.z2 == 0) {
            if (this.a % 2 == 0) {
                this.b[2].setLabel("O");
                ++this.z2;
                ++this.a;
            } else {
                this.b[2].setLabel("X");
                ++this.z2;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[3] && this.z3 == 0) {
            if (this.a % 2 == 0) {
                this.b[3].setLabel("O");
                ++this.z3;
                ++this.a;
            } else {
                this.b[3].setLabel("X");
                ++this.z3;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[4] && this.z4 == 0) {
            if (this.a % 2 == 0) {
                this.b[4].setLabel("O");
                ++this.z4;
                ++this.a;
            } else {
                this.b[4].setLabel("X");
                ++this.z4;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[5] && this.z5 == 0) {
            if (this.a % 2 == 0) {
                this.b[5].setLabel("O");
                ++this.z5;
                ++this.a;
            } else {
                this.b[5].setLabel("X");
                ++this.z5;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[6] && this.z6 == 0) {
            if (this.a % 2 == 0) {
                this.b[6].setLabel("O");
                ++this.z6;
                ++this.a;
            } else {
                this.b[6].setLabel("X");
                ++this.z6;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[7] && this.z7 == 0) {
            if (this.a % 2 == 0) {
                this.b[7].setLabel("O");
                ++this.z7;
                ++this.a;
            } else {
                this.b[7].setLabel("X");
                ++this.z7;
                ++this.a;
            }
        }

        if (var1.getSource() == this.b[8] && this.z8 == 0) {
            if (this.a % 2 == 0) {
                this.b[8].setLabel("O");
                ++this.z8;
                ++this.a;
            } else {
                this.b[8].setLabel("X");
                ++this.z8;
                ++this.a;
            }
        }

        Font var4 = new Font("", 1, 20);
        Label var3;
        if (this.b[0].getLabel() == this.b[1].getLabel() && this.b[0].getLabel() == this.b[2].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[3].getLabel() == this.b[4].getLabel() && this.b[4].getLabel() == this.b[5].getLabel()) {
            if (this.b[3].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[3].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[6].getLabel() == this.b[7].getLabel() && this.b[6].getLabel() == this.b[8].getLabel()) {
            if (this.b[6].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[6].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[0].getLabel() == this.b[3].getLabel() && this.b[0].getLabel() == this.b[6].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[1].getLabel() == this.b[4].getLabel() && this.b[1].getLabel() == this.b[7].getLabel()) {
            if (this.b[1].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[1].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[2].getLabel() == this.b[5].getLabel() && this.b[5].getLabel() == this.b[8].getLabel()) {
            if (this.b[2].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[2].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[0].getLabel() == this.b[4].getLabel() && this.b[0].getLabel() == this.b[8].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[2].getLabel() == this.b[4].getLabel() && this.b[2].getLabel() == this.b[6].getLabel()) {
            if (this.b[2].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[2].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        }

    }
}





public class Ticktactoee {
    public static void main(String[] args) {
        Fdemo f = new Fdemo();

    }
}
