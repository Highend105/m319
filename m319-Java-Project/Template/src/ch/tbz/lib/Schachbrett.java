public class Schachbrett {
    private char[][] board;
    
    // Konstruktor für die Initialisierung des Schachbretts
    public Schachbrett() {
        this.board = new char[8][8];
        initializeBoard();
    }

    // Methode zur Initialisierung des Schachbretts mit Figuren
    private void initializeBoard() {
        // Weiß
        board[0] = new char[] {'T', 'S', 'L', 'Q', 'K', 'L', 'S', 'T'};
        for (int i = 0; i < 8; i++) {
            board[1][i] = 'B';
            board[6][i] = 'b'; // Schwarz
        }
        board[7] = new char[] {'t', 's', 'l', 'q', 'k', 'l', 's', 't'};
    }

    // Methode zur Ausgabe des Schachbretts auf der Konsole
    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }

    // Methode zur Bewegung der Spielfigur
    public void movePiece(int fromX, int fromY, int toX, int toY) {
        char piece = board[fromY][fromX];
        board[toY][toX] = piece;
        board[fromY][fromX] = '.';
    }

    public static void main(String[] args) {
        Schachbrett board = new Schachbrett();

        // Task a)
        // char player1Knight = 'S'; // Springer für Spieler 1
        // char player2Knight = 's'; // Springer für Spieler 2
        // board.printBoard(); // Ausgabe des unveränderten Schachbretts
        // board.movePiece(1, 0, 2, 2); // Spieler 1 Springer bewegen
        // board.movePiece(6, 7, 5, 5); // Spieler 2 Springer bewegen
        // System.out.println("\nSchachbrett nach Zügen:");
        // board.printBoard(); // Ausgabe des Schachbretts nach den Zügen

        // Task b)
        // String player1Pawn = "B"; // Bauer für Spieler 1
        // String player2Pawn = "b"; // Bauer für Spieler 2
        // board.printBoard(); // Ausgabe des unveränderten Schachbretts
        // board.movePiece(1, 1, 2, 3); // Spieler 1 Bauer bewegen
        // board.movePiece(6, 6, 5, 4); // Spieler 2 Bauer bewegen
        // System.out.println("\nSchachbrett nach Zügen:");
        // board.printBoard(); // Ausgabe des Schachbretts nach den Zügen

        // Task c)
        float player1Pawn = 1.0f; // Bauer für Spieler 1
        float player2Pawn = 0.1f; // Bauer für Spieler 2
        board.printBoard(); // Ausgabe des unveränderten Schachbretts
        board.movePiece(1, 0, 2, 2); // Spieler 1 Bauer bewegen
        board.movePiece(6, 7, 5, 5); // Spieler 2 Bauer bewegen
        System.out.println("\nSchachbrett nach Zügen:");
        board.printBoard(); // Ausgabe des Schachbretts nach den Zügen
    }
}
