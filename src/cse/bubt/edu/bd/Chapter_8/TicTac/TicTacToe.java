package cse.bubt.edu.bd.Chapter_8.TicTac;
import java.util.Scanner;
public class TicTacToe {
    private Cell[][] board; // 3x3 board
    private boolean xTurn; // True if it's X's turn

    // Constructor
    public TicTacToe() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
        xTurn = true; // X starts first
    }

    // Display the board
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == Cell.EMPTY ? "- " : board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if a move is valid
    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == Cell.EMPTY;
    }

    // Make a move
    public void makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = xTurn ? Cell.X : Cell.O;
            xTurn = !xTurn; // Switch turns
        } else {
            System.out.println("Invalid move! Try again.");
        }
    }

    // Check if the game is won
    public boolean checkWin(Cell player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    // Check if the board is full (draw)
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) return false;
            }
        }
        return true;
    }

    // Main game loop
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.println("Player " + (xTurn ? "X" : "O") + "'s turn.");
            System.out.print("Enter row (0-2) and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            makeMove(row, col);

            if (checkWin(Cell.X)) {
                displayBoard();
                System.out.println("Player X wins!");
                break;
            } else if (checkWin(Cell.O)) {
                displayBoard();
                System.out.println("Player O wins!");
                break;
            } else if (isDraw()) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
        scanner.close();
    }
}

