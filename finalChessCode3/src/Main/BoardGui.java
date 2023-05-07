package Main;

import LoginSystem.MyButton;
import LoginSystem.Person;
import Pieces.Knight;
import Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoardGui extends JLayeredPane {
    private JFrame frame;
    private JLayeredPane panel;
    private JLabel label;
    private JPanel board;
    private JLabel square;
    private JLabel labelSquare;
    private JLabel time1;
    private JLabel time2;
    private JLabel name1;
    private JLabel name2;
    private JPanel newPanel;
    private JPanel deadWhite;
    private JLabel deadBlack;
    private int counterBlack;
    private int counterWhite;

    private MyButton whiteDead1= new MyButton(0);
    private MyButton whiteDead2=new MyButton(1);
    private MyButton whiteDead3=new MyButton(2);
    private MyButton whiteDead4=new MyButton(3);
    private MyButton whiteDead5=new MyButton(4);
    private MyButton whiteDead6=new MyButton(5);
    private MyButton whiteDead7=new MyButton(6);
    private MyButton whiteDead8=new MyButton(7);
    private MyButton whiteDead9=new MyButton(8);
    private MyButton whiteDead10=new MyButton(9);
    private MyButton whiteDead11=new MyButton(10);
    private MyButton whiteDead12=new MyButton(11);
    private MyButton whiteDead13=new MyButton(12);
    private MyButton whiteDead14=new MyButton(13);
    private MyButton whiteDead15=new MyButton(14);
    ArrayList<MyButton> deadWhiteList = new ArrayList<>();


    public BoardGui(Person p1, Person p2) {

        counterBlack = 0;
        counterWhite = 0;

        frame = new JFrame("PawnHackers Chess");
        panel = new JLayeredPane();
        frame.add(panel);
        panel.setBounds(0, 0, 1012, 645);

        frame.setSize(1012, 645);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);

        Board board1 = new Board(this);
        //panel.add(board1);

        newPanel = new JPanel();
        newPanel.setBounds(260, 60, 480, 480);
        newPanel.setLayout(new GridBagLayout());
        newPanel.add(board1);
        panel.add(newPanel);

//        deadWhite = new JLabel();
//        deadWhite.setBounds(48, 153, 120, 250);
////        deadWhite.setLayout(new GridLayout(5, 3));
//        deadWhite.setForeground(Color.BLACK);
//        panel.add(deadWhite);
/*-----------------------------------------------------------------------*/
        deadWhite = new JPanel();
        deadWhite.setBounds(48, 153, 120, 250);
        deadWhite.setLayout(new GridLayout(5,3));
//        deadWhite.setLayout(new GridLayout(5, 3));
        deadWhite.setForeground(Color.BLACK);
        deadWhiteList.add(whiteDead1);
        deadWhiteList.add(whiteDead2);
        deadWhiteList.add(whiteDead3);
        deadWhiteList.add(whiteDead4);
        deadWhiteList.add(whiteDead5);
        deadWhiteList.add(whiteDead6);
        deadWhiteList.add(whiteDead7);
        deadWhiteList.add(whiteDead8);
        deadWhiteList.add(whiteDead9);
        deadWhiteList.add(whiteDead10);
        deadWhiteList.add(whiteDead11);
        deadWhiteList.add(whiteDead12);
        deadWhiteList.add(whiteDead13);
        deadWhiteList.add(whiteDead14);
        deadWhiteList.add(whiteDead15);
        for(MyButton myButton : deadWhiteList){
            deadWhite.add(myButton);

        }






        panel.add(deadWhite);

/*------------------------------------------------------------------------*/
        deadBlack = new JLabel();
        deadBlack.setBounds(832, 153, 120, 250);
//        deadBlack.setLayout(new GridLayout(5, 3));
        deadBlack.setForeground(Color.BLACK);
        panel.add(deadBlack);


        name1 = new JLabel(p1.getPlayerName() + "'s Time:");
        name1.setHorizontalAlignment(SwingConstants.CENTER);
        name1.setFont(new Font("Bayon", Font.BOLD, 15));
        name1.setForeground(new Color(39, 69, 129, 255));
        name1.setBounds(35, 460, 145, 40);
        panel.add(name1);

        name2 = new JLabel(p2.getPlayerName() + "'s Time:");
        name2.setHorizontalAlignment(SwingConstants.CENTER);
        name2.setFont(new Font("Bayon", Font.BOLD, 15));
        name2.setForeground(new Color(39, 69, 129, 255));
        name2.setBounds(819, 460, 145, 40);
        panel.add(name2);

        time1 = new JLabel("05:00");
        time1.setHorizontalAlignment(SwingConstants.CENTER);
        time1.setFont(new Font("Bayon", Font.BOLD, 20));
        time1.setForeground(new Color(39, 69, 129, 255));
        time1.setBounds(70, 510, 76, 40);
        panel.add(time1);

        time2 = new JLabel("05:00");
        time2.setHorizontalAlignment(SwingConstants.CENTER);
        time2.setFont(new Font("Bayon", Font.BOLD, 20));
        time2.setForeground(new Color(39, 69, 129, 255));
        time2.setBounds(854, 510, 76, 40);
        panel.add(time2);


        label = new JLabel();
        panel.add(label);
        label.setOpaque(true);
        label.setBounds(0, 0, 1000, 600);
        ImageIcon image2 = new ImageIcon("board.png");
        label.setIcon(image2);

    }

    public void displayDeadPieces(boolean isWhite, String name) {
        // i mod 3 , i/3
        if (isWhite) {
//            if (counterWhite == 2) {
//                counterWhite = 0;
//                deadWhite.setText(deadWhite.getText() + "<html>My cool App <br> Buy it now</html>");
//            }
            if (name.equals("Bishop")) {
                for (MyButton myButton : deadWhiteList)
                {
                    if (myButton.index==counterWhite){
                        ImageIcon whiteDeadBishop=new ImageIcon("white bishop 1.png");
                        myButton.setIcon(whiteDeadBishop);
                    }
                }
                this.counterWhite++;
            }if (name.equals("Castle")) {
                for (MyButton myButton : deadWhiteList)
                {
                    if (myButton.index==counterWhite){
                        ImageIcon whiteDeadCastle=new ImageIcon("white castle 1.png");
                        myButton.setIcon(whiteDeadCastle);
                    }
                }
                this.counterWhite++;
            }if (name.equals("Queen")) {
                for (MyButton myButton : deadWhiteList)
                {
                    if (myButton.index==counterWhite){
                        ImageIcon whiteDeadQueen=new ImageIcon("white queen 1.png");
                        myButton.setIcon(whiteDeadQueen);
                    }
                }
                this.counterWhite++;
            }if (name.equals("Knight")) {
                for (MyButton myButton : deadWhiteList)
                {
                    if (myButton.index==counterWhite){
                        ImageIcon whiteDeadKnight=new ImageIcon("white knight 1.png");
                        myButton.setIcon(whiteDeadKnight);

                    }
                }
                this.counterWhite++;
            }
            if (name.equals("Pawn")) {
                for (MyButton myButton : deadWhiteList)
                {
                    if (myButton.index==counterWhite){
                        ImageIcon whiteDeadPawn=new ImageIcon("white pawn 1.png");
                        myButton.setIcon(whiteDeadPawn);
                    }
                }
                this.counterWhite++;
            }


//                deadWhite.setDisplayedMnemonicIndex(counterWhite);
//                deadWhite.setText(deadWhite.getText() + " ♙ ");
//                this.counterWhite++;
            }
//            if (name.equals("Knight")) {
////                deadWhite.setDisplayedMnemonicIndex(counterWhite);
//                deadWhite.setText(deadWhite.getText() + " ♘ ");
//
//            }
        }
//            else {
//                if (name.equals("Bishop")) {
////                deadBlack.setDisplayedMnemonicIndex(counterBlack);
//                    deadBlack.setText(deadBlack.getText() + " ♗ ");
//                    this.counterBlack++;
//                }
//                if (name.equals("Castle")) {
////                deadBlack.setDisplayedMnemonicIndex(counterBlack);
//                    deadBlack.setText(deadBlack.getText() + " ♖ ");
//                    this.counterBlack++;
//                }
//                if (name.equals("Queen")) {
////                deadBlack.setDisplayedMnemonicIndex(counterBlack);
//                    deadBlack.setText(deadBlack.getText() + " ♕ ");
//                    this.counterBlack++;
//                }
//                if (name.equals("Pawn")) {
////                deadBlack.setDisplayedMnemonicIndex(counterBlack);
//                    deadBlack.setText(deadBlack.getText() + " ♙ ");
//                    this.counterBlack++;
//                }
//                if (name.equals("Knight")) {
////                deadBlack.setDisplayedMnemonicIndex(counterBlack);
//                    deadBlack.setText(deadBlack.getText() + " ♘ ");
//
//                }
//    }}












}