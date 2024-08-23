import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] play = {
            { " ", "|", " ", "|", " " },
            { "---", "+", "---", "+", "---" },
            { " ", "|", " ", "|", " " },
            { "---", "+", "---", "+", "---" },
            { " ", "|", " ", "|", " " }
        };

        // Initial display
        displayBoard(play);

        boolean playerXTurn = true;
        boolean gameRunning = true;

        while (gameRunning) {
            // Get input
            System.out.println("Enter the row and column (e.g., 00, 11) or -1 to quit:");
            int move = scanner.nextInt();
            
            if (move == -1) {
                System.out.println("Game over.");
                gameRunning = false;
                continue;
            }

            int row = move / 10;
            int col = move % 10;

            // Check if the move is valid
            if (row < 0 || row > 4 || col < 0 || col > 4 || !play[row][col].equals(" ")) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            // Make the move
            if (playerXTurn) {
                play[row][col] = "X";
            } else {
                play[row][col] = "O";
            }

            // Display the board
            displayBoard(play);

            // Switch player
            playerXTurn = !playerXTurn;

            // Check for win or draw condition (simple version)
            if (checkForWin(play, 'X')) {
                System.out.println("Player X wins!");
                gameRunning = false;
            } else if (checkForWin(play, 'O')) {
                System.out.println("Player O wins!");
                gameRunning = false;
            } else if (isBoardFull(play)) {
                System.out.println("It's a draw!");
                gameRunning = false;
            }
        }

        scanner.close();
    }

    private static void displayBoard(String[][] play) {
        for (String[] row : play) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    private static boolean checkForWin(String[][] play, char player) {
        String mark = String.valueOf(player);

        // Check rows and columns
        for (int i = 0; i < 5; i++) {
            if ((play[i][0].equals(mark) && play[i][2].equals(mark) && play[i][4].equals(mark)) ||
                (play[0][i].equals(mark) && play[2][i].equals(mark) && play[4][i].equals(mark))) {
                return true;
            }
        }

        // Check diagonals
        if ((play[0][0].equals(mark) && play[2][2].equals(mark) && play[4][4].equals(mark)) ||
            (play[0][4].equals(mark) && play[2][2].equals(mark) && play[4][0].equals(mark))) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(String[][] play) {
        for (String[] row : play) {
            for (String cell : row) {
                if (cell.equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
