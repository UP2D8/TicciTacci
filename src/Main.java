public class Main {

    public static void main(String[] args) {
        // hier steht der code, der ausgeführt wird
        int turn = 0;
        int winner = -1;
        int[] board = new int[9];
        // unten folgt die schleife für eine gewisse wdh.
        for(int i = 0; i < board.length; i++){
            board[i] = -1;
        }
        Player a = new Player( 0);
        Player b = new Player( 1);
        Player[] players = new Player[2];
        players[0] = a;
        players[1] = b;

        // unten folgt eine while schleife , hat nur eine Bedingung
        while(winner == -1){
            int turnField = players[turn].getTurn();
            if (players[turn].validateTurn(board, turnField)){
                board[turnField] = players[turn].number;
                turn = (turn + 1) % 2;
                printBoard(board);
            }
            winner = checkWinner(board);

        }
        printBoard(board);



    }

    public static int checkWinner(int[] board){
        int winner = -1;
        if(board[0] == board[1] && board[0] == board[2] && board[0] != -1){
            winner = board[0];
        }

        else if(board[3] == board[4] && board[3] == board[5] && board[0] != -1){
            winner = board[3];
        }

        else if(board[6] == board[7] && board[6] == board[8] && board[0] != -1){
            winner = board[6];
        }

        else if(board[0] == board[4] && board[0] == board[8] && board[0] != -1){
            winner = board[0];
        }

        else if(board[2] == board[4] && board[6] == board[2] && board[0] != -1){
            winner = board[2];
        }

        else if(board[0] == board[3] && board[0] == board[6] && board[0] != -1){
            winner = board[0];
        }

        else if(board[1] == board[4] && board[1] == board[7] && board[0] != -1){
            winner = board[1];
        }

        else if(board[2] == board[5] && board[2] == board[8] && board[0] != -1){
            winner = board[2];
        }
        else{
            winner = -1;

        }
        return winner ;
    }



    public static void printBoard(int[] meinBoard){
        System.out.println(meinBoard[0] +  " | " + meinBoard[1] + " | " + meinBoard[2]);
        System.out.println("____________");
        System.out.println(meinBoard[3] +  " | " + meinBoard[4] + " | " + meinBoard[5]);
        System.out.println("____________");
        System.out.println(meinBoard[6] +  " | " + meinBoard[7] + " | " + meinBoard[8]);

    }
}
