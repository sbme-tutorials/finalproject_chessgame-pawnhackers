import javax.swing.*;

public class Main {
    public static void main(String []args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Board frame1= new Board();
                Players frame2=new Players();
                Login frame3=new Login();

            }
        });
    }
}
