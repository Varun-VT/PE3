package com.stackroute;

public class ChessBoard {
    public void printChessBoard() {
        String w="WW|", b="BB|";
        for (int i=1; i<=8; i++){
            for (int j=1; j<=8; j++){
                if (i%2 != 0){
                    if (j%2 != 0)
                        System.out.print(w);
                    else
                        System.out.print(b);
                }
                else{
                    if (j%2 != 0)
                        System.out.print(w);
                    else
                        System.out.print(b);
                }
            }
            System.out.println("");
        }
    }

}
