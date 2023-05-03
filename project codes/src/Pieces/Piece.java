package Pieces;

import Board.Square;

import javax.swing.*;

public abstract class Piece extends ImageIcon {
    private final Square square;
    protected final PieceColor color;
    protected Piece(Square square,PieceColor color){
        this.color=color;
        this.square=square;
        this.square.setPiece(this);
    }





























    /*boolean isWhite;
    boolean isKilled;
    int X;
    int Y;


    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public abstract boolean canMove(Square s1,Square s2);*/
}