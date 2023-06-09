package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Knight extends Piece{

    public Knight(Board board, int col, int row , boolean isWhite) {
        super(board);
        this.col=col;
        this.row=row;
        this.xPos=col* board.squareSize;
        this.yPos=row* board.squareSize;
        this.isWhite=isWhite;
        this.name = "Knight";
        if (isWhite){
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white knight.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black knight.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public boolean isvalidmovement(int col, int row){

        return ((Math.abs(this.col-col)==2&&Math.abs(this.row-row)==3)||(Math.abs(this.row-row)==2&& Math.abs(this.col-col)==3))&&!(this.col==col&&this.row==row);}


    }




