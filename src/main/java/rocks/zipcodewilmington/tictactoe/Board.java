package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public final Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }
    public Boolean isInFavorOfX() {
        final Character X = 'X';

        if (board[0][0] == X && board[0][1] == X && board[0][2] == X) {
            return true;
        } else if (board[1][0] == X && board[1][1] == X && board[1][2] == X) {
            return true;
        } else if (board[2][0] == X && board[2][1] == X && board[2][2] == X) {
            return true;
        } else if (board[0][0] == X && board[1][1] == X && board[2][2] == X) {
            return true;
        } else if (board[0][2] == X && board[1][1] == X && board[2][0] == X) {
            return true;
        } else if (board[0][0] == X && board[1][0] == X && board[2][0] == X) {
            return true;
        } else if (board[0][1] == X && board[1][1] == X && board[2][1] == X) {
            return true;
        } else if (board[0][2] == X && board[1][2] == X && board[2][2] == X) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
        final Character O = 'O';

        if (board[0][0] == O && board[0][1] == O && board[0][2] == O) {
            return true;
        } else if (board[1][0] == O && board[1][1] == O && board[1][2] == O) {
            return true;
        } else if (board[2][0] == O && board[2][1] == O && board[2][2] == O) {
            return true;
        } else if (board[0][0] == O && board[1][1] == O && board[2][2] == O) {
            return true;
        } else if (board[0][2] == O && board[1][1] == O && board[2][0] == O) {
            return true;
        } else if (board[0][0] == O && board[1][0] == O && board[2][0] == O) {
            return true;
        } else if (board[0][1] == O && board[1][1] == O && board[2][1] == O) {
            return true;
        } else if (board[0][2] == O && board[1][2] == O && board[2][2] == O) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
        boolean isTie = false;
        if (isInFavorOfO() == false && isInFavorOfX() == false) {
            isTie = true;
        }
        return isTie;
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfX() == true) {
            winner = "X";
        } else if (isInFavorOfO() == true) {
            winner = "O";
        }
        return winner;
    }

}
