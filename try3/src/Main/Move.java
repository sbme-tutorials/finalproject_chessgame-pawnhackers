package Main;


import Pieces.Piece;


public class Move {
    int oldCol,newCol,oldRow,newRow;
     Piece piece,capture;

    public Move(Board board, Piece piece,int newCol,int newRow)
    {
        this.oldCol=piece.col;
        this.oldRow= piece.row;
        this.newCol= newCol;
        this.newRow= newRow;
        this.piece=piece;
        this.capture=board.getPiece(newCol,newRow);



    }



}
