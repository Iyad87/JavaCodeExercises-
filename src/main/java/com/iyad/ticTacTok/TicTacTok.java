package com.iyad.ticTacTok;

public class TicTacTok {
    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacTok(char playerToken, char aiMarker) {

        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {

        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }

        return isValid;
    }

    // check if out spot is in range
    public boolean withinRange(int num) {
        return num > 0 && num < board.length + 1;
    }

    // check if our spot is taken
    public boolean isSpotTaken(int num) {
        return board[num - 1] != '-';
    }

    public void printBoard() {
        // create this board
        // | - | - | - |
        // _____________
        // | - | - | - |
        // _____________
        // | - | - | - |

        System.out.println();
        for (int i = 0; i < board.length; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("_____________");
            }
            System.out.print(" | " + board[i]);

        }
        System.out.println();
    }

    public void printIndexBoard(){


        System.out.println();
        for (int i = 0; i < board.length; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("_____________");
            }
            System.out.print(" | " + i +1);

        }
        System.out.println();

    }
}
