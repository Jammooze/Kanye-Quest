import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KanyeQuest {
    final static Scanner _scanner = new Scanner(System.in);

    public static void gameOver(){
        System.out.println("");
        System.out.println("   +-----------+");
        System.out.println("   | GAME OVER |");
        System.out.println("   +-----------+");
        System.out.println("");
        System.out.print("> PLAY AGAIN? [Y] [N]: ");
        
        char retryGame;
        retryGame = _scanner.next().charAt(0);

        do{
            if (retryGame == 'y'){
                main(new String[0]);
            } else if (retryGame == 'n'){
                _scanner.close();
                System.exit(0);
            } else {
                System.out.println("> INVALID RESPONSE TRY AGAIN");
                System.out.print("< PLAY AGAIN? [Y] [N]: ");
                retryGame = _scanner.next().charAt(0);
            }
        } while (retryGame != 'y' || retryGame != 'n');

    }

    // Prints out prompt to click enter to continue code
    public static void nextPrompt(){
        String enterKey;
        System.out.print("  [PRESS ENTER TO CONTINUE]");
        System.out.println("");

        enterKey = _scanner.nextLine();
    }

    // Tic Tac Toe METHODS

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    // Prints out the tic tac toe board on terminal screen
    public static void printTicTacBoard(char[][] tictacBoard){
        for(char[] row: tictacBoard){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] tictacBoard, int playerPosition, String user){
        char symbol = 'X';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(playerPosition);
        } else if (user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(playerPosition);
        }

        switch(playerPosition){
            case 1:
                tictacBoard[1][4] = symbol;
                break;
            case 2:
                tictacBoard[1][8] = symbol;
                break;
            case 3:
                tictacBoard[1][12] = symbol;
                break;
            case 4:
                tictacBoard[3][4] = symbol;
                break;
            case 5:
                tictacBoard[3][8] = symbol;
                break;
            case 6:
                tictacBoard[3][12] = symbol;
                break;
            case 7:
                tictacBoard[5][4] = symbol;
                break;
            case 8:
                tictacBoard[5][8] = symbol;
                break;
            case 9:
                tictacBoard[5][12] = symbol;
                break;
            default:
                System.out.println("\n> INVALID ENTRY");
                break;
        }
    }

    public static String tictactoeWin(){

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List crossOne = Arrays.asList(1, 5, 9);
        List crossTwo = Arrays.asList(3, 5, 7);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List<List> winningCondition = new ArrayList<List>();

        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(botRow);

        winningCondition.add(crossOne);
        winningCondition.add(crossTwo);

        winningCondition.add(leftCol);
        winningCondition.add(midCol);
        winningCondition.add(rightCol);

        if (playerPositions.size() + cpuPositions.size() == 9) {
            return "\n> [TIE]";
        }

        for (List l : winningCondition){
            if (playerPositions.containsAll(l)){
                return "\n> [PLAYER WIN]";
            } else if (cpuPositions.containsAll(l)){
                return "\n> [KANYE WIN]";
            }
        }
        return "";
    }

    public static void main(String[] args){
        if(args.length != 0) {
            if(args[0].equals("-help")) {
                KanyeQuestHelpScreen.printHelpScreen(_scanner);
            } else {
                System.out.println("You provided Kanye with an unsupported argument!");
            }

            System.exit(0);
        }
        
        Random rand = new Random();

        String startKey;
        String nameInput;

        System.out.println("");
        System.out.println("   +--------------+");
        System.out.println("   |      /\\      |  ADIDAS PRESENTS");
        System.out.println("   |     /  \\     |");
        System.out.println("   |    /\\\\  \\    |  +-----------+");
        System.out.println("   |   /  \\\\  \\   |  |KANYE QUEST|");
        System.out.println("   |  /\\\\  \\\\  \\  |  +-----------+");
        System.out.println("   | /__\\\\__\\\\__\\ |");
        System.out.println("   | 	ADIDAS    |");
        System.out.println("   +--------------+");
        System.out.println("");
        System.out.println("   A CS-2011 PROJECT BY: - CHAN GAVIN");
        System.out.println("                         - NGUYEN JAMES");
        System.out.println("                         - ZHOU ADDISON\n");

        System.out.print("  [PRESS ENTER TO START GAME]");
        startKey = _scanner.nextLine();
        System.out.println("");

        System.out.println("   +---------------+");
        System.out.println("   |   __     __   |");
        System.out.println("   |  |..|   |..|  |");
        System.out.println("   |  /  \\   /||\\  |");
        System.out.println("   +---------------+");
        System.out.println("");
        System.out.println("> Hello there, so you are the new intern");
        System.out.println("  for our software development team here");
        System.out.println("  at Adidas huh? ");
        System.out.println("");

        nextPrompt();
       
        System.out.println("> I'm don't seem to remember your name.");
        System.out.println("  Can you reintroduce yourself once more?");
        System.out.println("");

        System.out.print("< ENTER NAME : ");
        nameInput = _scanner.next();

        // Edits name to proper formatting
        String firstLetStr = nameInput.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = nameInput.substring(1);

        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();

        // concantenate the first letter and remaining string
        String name = firstLetStr + remLetStr;

        System.out.println("");
        System.out.println("> So your name is " + name + "? HA HA good luck working");
        System.out.println("  here with that name, HA HA HA HA HA!");
        System.out.println("");

        System.out.print("< CHOOSE TO BEAT HIM UP? [Y] [N]:");
        char yesNo;

        yesNo = _scanner.next().charAt(0);

        do {
            if (yesNo == 'y'){
                System.out.println("");
                System.out.println("   +---------------+          +---------------+");
                System.out.println("   |  You got mad  |          | You got fired |");
                System.out.println("   |          !    |          |  for assault  |");
                System.out.println("   |   __     __   |   --->   |       __      |");
                System.out.println("   |  |..|   |..|  |          |      |..|     |");
                System.out.println("   |  /  ==o /||\\  |          |      /  \\     |");
                System.out.println("   +---------------+          +---------------+");
                System.out.println("");
                System.out.println("> HEY! WHAT DO YOU THINK YOU'RE DOIN?!");
                System.out.println("  SECURITY!");
                // Game Over Method
                gameOver();
                break;
            } else if (yesNo == 'n'){
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   |  You chose to |");
                System.out.println("   |  ignore his   |");
                System.out.println("   |  comment...   |");
                System.out.println("   |   __     __   |");
                System.out.println("   |  |..|   |..|  |");
                System.out.println("   |  /  \\   /||\\  |");
                System.out.println("   +---------------+");
                System.out.println("");
                break;
            } else {
                System.out.println("> INVALID RESPONSE TRY AGAIN");
                System.out.print("< CHOOSE TO BEAT HIM UP? [Y] [N]:");
                yesNo = _scanner.next().charAt(0);
            }
        } while (yesNo != 'y' || yesNo != 'n');

        nextPrompt();
        
        System.out.println("  Alright " + name + ", your first task as an intern");
        System.out.println("  here at Adidas is-");
        System.out.println("");
        System.out.println("   +---------------+");
        System.out.println("   |  ***BOOM***   |");
        System.out.println("   |   !      !    |");
        System.out.println("   |   __     __   |");
        System.out.println("   |  |..|   |..|  |");
        System.out.println("   |  /  \\   /||\\  |");
        System.out.println("   +---------------+");
        System.out.println("");

        nextPrompt();

        System.out.println("> What was that?!");
        System.out.println("");

        nextPrompt();

        System.out.println("   +---------------------------------------+");
        System.out.println("   |  ***PA SYSTEM***  	                   |");
        System.out.println("   |                CODE YE! CODE YE!      |");
        System.out.println("   |   __     __    ALL ADIDAS EMPLOYEES   |");
        System.out.println("   |  |..|   |..|   EVACUATE THE BUILDING! |");
        System.out.println("   |  /  \\   /||\\                          |");
        System.out.println("   +---------------------------------------+");
        System.out.println("");
        
        nextPrompt();

        System.out.println("> I knew this day would come, Kanye is trying to");
        System.out.println("  get back his Yeezy contract deal.");
        System.out.println("");

        nextPrompt();

        System.out.println("> " + name + ", I know it's too much to ask from an ");
        System.out.println("  intern. You need to stop Kanye from ");
        System.out.println("  getting what he wants. The fate of the");
        System.out.println("  world rests on your shoulders.");
        System.out.println("");

        nextPrompt();

        System.out.println("> Good luck Joe, now I'm gonna just head");
        System.out.println("  to the nearest exit and leave you here.");
        System.out.println("");
 
        nextPrompt();

        System.out.println("   +------------------------------------------------------------+");
        System.out.println("   |MMMMMMMMMMMMMMMMMMMMWKko:,.......';cdONWMMMMMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMWXOl;.                'cxKWWWWWMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMW0o'          .....        .c0WMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMWOc.    ........'''.......     .lKMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMXo. .......'',,,,;;;;;,,''......  'OWMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMXc  .....''',,;;:::c:::;;,,,''..... .xWMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMNl  .....''',,;:ccccccccc::;,,''..... .kMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMM0'  .....''',,;::ccccc:cc::;;,''...... ;KMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMd. .......'',,;:cccccccccc:::;,'...... .oWMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWo  ........'',;:loooollclloll:;,'...... ;KMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWl  .............,:ldxxxddolc;'......  . 'OMMMMMMMMM|");
        System.out.println("   |MMMMMMMMNc  .....',,,,;;;,,,:lloocc;,''','.... . .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMNl......',,''',,;;;,,,,:c;''',,,,'...... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWd.....','......',',''';c:,..,;'......'...xWMMMMMMMM|");
        System.out.println("   |MMMMMMMMK:....''''',,,;c:;,,',;:::,''',;;,,'..'...,OMMMMMMMM|");
        System.out.println("   |MMMMMMMM0:....'',;;:::cllc:,,;;;::;,'';cc:;;;,'...:0MWMMMMMM|");
        System.out.println("   |MMMMMMMMNo,'...',;:ldddoll:;;;;;clc,,;;:loool:,'..cXMMMMMMMM|");
        System.out.println("   |MMMMMMMMNdc;..'';:cdxxl:;:;;:;,;clc,''';clddlc;'..lNMMMMMMMM|");
        System.out.println("   |MMMMMMMMWk:'..'',;:ccc;;;,.....',''....':clc:;,'..dWMMMMMMMM|");
        System.out.println("   |MMMMMMMMMXo......'',,,,'......',,;,.......,,'... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMNl....'',,''....',;::ccc:,,'... ..'... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMM0,...'',:;..':odkOOO0000Okkdc,...'... ,KMWMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMWd.....';,..,;:clloddxxxolc:,,,....  .dWMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMNd. ......',;,,,;;:clc::,'..''..   .dNMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMNx'     ...'',;;,',,'........    ;OWMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMWKc.    .....,:,.,,'.....     'xNMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMW0c.     ...',',,,...     .cKWMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMMWXd;.  ........'...   .;kNMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMMMMMN0o;..          ..:xNWWMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMWMMMMMMN0d:'......,:dKWMMMMMMMMMMMMMMMMMMMM|");
        System.out.println("   +------------------------------------------------------------+");
        System.out.println("");
        System.out.println("> HAHAHA ITS ME KANYE WEST! AND I'M HERE TO");
        System.out.println("  PUT THE YE BACK IN YEEZY! ");
        System.out.println("");

        nextPrompt();

        System.out.println("   +---------------+");
        System.out.println("   | Is he talking |");
        System.out.println("   |   about me?   |");
        System.out.println("   |       __      |");
        System.out.println("   |    ? |..| ?   |");
        System.out.println("   |      /  \\     |");
        System.out.println("   +---------------+");
        System.out.println("");
        System.out.println("> WELL WELL WELL, LOOK WHAT WE HAVE HERE?");
        System.out.println("  A POOR LITTLE LOSER WHO HAS GIVEN INTO");
        System.out.println("  THE LIES OF CORRUPT MEDIA!");
        System.out.println("");

        nextPrompt();

        System.out.println("> WAIT A MINUTE... I KNOW YOU!");
        System.out.println("  YOU'RE NUMBER 4 ON MY LIST!");
        System.out.println("");

        System.out.println("   +---------------+");
        System.out.println("   |   His list?   |");
        System.out.println("   |   What list?  |");
        System.out.println("   |       __      |");
        System.out.println("   |    ? |..| ?   |");
        System.out.println("   |      /  \\     |");
        System.out.println("   +---------------+");
        System.out.println("");

        nextPrompt();

        System.out.println("> THE NAUGHTY LIST!!!");
        System.out.println("");

        // Prints String of empty space long as name
        int whitespaceSize = 22 - (name.length() + 9);
        String whiteSpace = "";
        for (int i = 0; i <= whitespaceSize; i++) {
            whiteSpace += " ";
        }

        System.out.println("   +-----------------------+");
        System.out.println("   |  [YE'S NAUGHTY LIST]  |");
        System.out.println("   |                       |");
        System.out.println("   | [1] Pete Davidson [X] |");
        System.out.println("   | [2] Kasper R      [X] |");
        System.out.println("   | [3] Taylor Swift  [ ] |");
        System.out.println("   | [4] " + name + whiteSpace + "[ ] |");
        System.out.println("   | [5] Drake         [X] |");
        System.out.println("   | [6] George W Bush [ ] |");
        System.out.println("   | [7] Michael Burke [ ] |");
        System.out.println("   | [8] Kimberly K    [ ] |");
        System.out.println("   | [9] Leonardo D    [X] |");
        System.out.println("   | [10] Chris Paul   [X] |");
        System.out.println("   |               pg 1/50 |");
        System.out.println("   +-----------------------+");
        System.out.println("");

        nextPrompt();

        System.out.println("> SO YOU ARE " + name.toUpperCase() + "!");
        System.out.println("  HOW ABOUT I CHECK YOU OFF MY LIST!");
        System.out.println("  YOU ARE GOING DOWN WITH THE REST OF YOUR");
        System.out.println("  BUDDIES WHO WRONGED ME!");
        System.out.println("");

        System.out.print("< WILL YOU STOP YE? [Y] [N]:");

        char challengeAccept;
        challengeAccept = _scanner.next().charAt(0);

        do{
            if (challengeAccept == 'y') {
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   |  You decided  |");
                System.out.println("   |  to stop Ye!  |");
                System.out.println("   |   __          |");
                System.out.println("   |  |..|  STOP!  |");
                System.out.println("   |  /  ==o       |");
                System.out.println("   +---------------+");
                System.out.println("\n> OH... YOU THINK YOU HAVE THE GUTS TO STOP ME!?");
                System.out.println("  HA HA HA! GET READY FOR A FIGHT TO THE DEATH!\n");
                break;
            } else if (challengeAccept == 'n'){
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   | You let Ye go |");
                System.out.println("   | do his stuff  |          +------------------+");
                System.out.println("   |   __          |   --->   | 2 YEARS LATER... |");
                System.out.println("   |  |..| ...ok   |          +------------------+");
                System.out.println("   |  /  \\         |");
                System.out.println("   +---------------+\n");
                System.out.println("   +--------------------------------------------------------+");
                System.out.println("   | [FOX NEWS] - VIOLENCE FLARES IN WASHINGTON DURING      |");
                System.out.println("   |              WEST INAUGURATION                         |");
                System.out.println("   | Activists among hundreds of demonstrators protesting   |");
                System.out.println("   | Kanye West's swearing-in on Friday clashed with police |");
                System.out.println("   | a few blocks from the White House, in an outburst of   |");
                System.out.println("   | violence rare for a presidential inauguration...       |");
                System.out.println("   |   __                                                   |");
                System.out.println("   |  |..|  - Dang... I should've stopped that dude...      |");
                System.out.println("   |  /  \\                                                  |");
                System.out.println("   +--------------------------------------------------------+");
                gameOver();
                break;
            } else {
                System.out.println("> INVALID RESPONSE TRY AGAIN");
                System.out.print("< WILL YOU ACCEPT TO CHALLENGE YE? [Y] [N]:");
                challengeAccept = _scanner.next().charAt(0);
            }
        } while (challengeAccept != 'y' || challengeAccept != 'n');

        nextPrompt();

        System.out.println("> I CHALLENGE YOU TO A DUEL!");
        System.out.println("  PREPARE TO BE OUTSMARTED");
        System.out.println("  IN A GAME OF...\n");

        System.out.println("             [TIC-TAC-TOE]\n");
        System.out.println("  +---+---+---+          +---+---+---+");
        System.out.println("  | X | O | O |          | 1 | 2 | 3 |");
        System.out.println("  +---+---+---+          +---+---+---+");
        System.out.println("  | X | O | X |   --->   | 4 | 5 | 6 |");
        System.out.println("  +---+---+---+          +---+---+---+");
        System.out.println("  | X | X | O |          | 7 | 8 | 9 |");
        System.out.println("  +---+---+---+          +---+---+---+\n");

        System.out.println("> THIS IS A TURN BASED STATEGY GAME WHERE");
        System.out.println("  TWO CHALLENGERS MUST SUCCEED IN PLACING");
        System.out.println("  THREE MARKS IN A ROW: - HORIZONTAL");
        System.out.println("                        - VERTICAL");
        System.out.println("                        - DIAGONAL\n");

        nextPrompt();

        System.out.println("> THIS IS GONNA BE TOO EASY!");

        /*
         TicTacToe Grid Design
         +---+---+---+
         | X | O | O |
         +---+---+---+
         | X | O | X |
         +---+---+---+
         | X | X | O |
         +---+---+---+
         */

        char [][] tictacBoard = {{' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'}};

        System.out.println("");
        printTicTacBoard(tictacBoard);

        String result = tictactoeWin();

        while(true){
            System.out.print("\n< ENTER POSITION [1-9] : ");
            int playerPosition = _scanner.nextInt();
            while(playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)){
                System.out.println("\n< POSITION TAKEN! RETRY!");
                playerPosition = _scanner.nextInt();
            }

            placePiece(tictacBoard, playerPosition, "player");
            //String result = tictactoeWin();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }

            //Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)){
                cpuPosition = rand.nextInt(9) + 1;
            }
            placePiece(tictacBoard, cpuPosition, "cpu");

            // Call printTicTacBoard Method
            System.out.println("");
            printTicTacBoard(tictacBoard);

            result = tictactoeWin();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
        }
        System.out.println("");
        printTicTacBoard(tictacBoard);
        System.out.println("");

        if (result.equals("\n> [PLAYER WIN]")){
            System.out.println("> YOU DEFEATED KANYE AT TIC-TAC-TOE!\n");
        } else {
            System.out.println("   +---------------+");
            System.out.println("   |   You lost... |");
            System.out.println("   | HOW!? UR BAD! |");
            System.out.println("   |       __      |");
            System.out.println("   |      |..|     |");
            System.out.println("   |      /  \\     |");
            System.out.println("   +---------------+\n");
            System.out.println("> YOU LOST TO KANYE... HOW IS THAT");
            System.out.println("  EVEN POSSIBLE??? UR TRASH KID!");
            System.exit(0);
        }

        nextPrompt();

        System.out.println("> YOU THINK YOU'VE ALREADY BEAT ME?! HA!");
        System.out.println("  YE HAS GOT MORE TRICKS UP HIS SLEEVES!\n");
        System.out.println("> I CHALLENGE YOU TO A GAME OF...\n");
        System.out.println("       [ROCK PAPER SCISSORS]\n");
        System.out.println("> THIS A GAME WITH ONLY THREE SELECTIONS");
        System.out.println("  OF ACTION AND OUTCOME! TWO OPPONENTS SHALL");
        System.out.println("  THROW EITHER: - ROCK");
        System.out.println("                - PAPER");
        System.out.println("                - SCISSORS\n");

        nextPrompt();

        System.out.println("> PREPARE TO MEET YOUR MAKER " + name.toUpperCase() + "!");
        System.out.println("  AND I DON'T MEAN YOUR MOTHER!\n");

        System.out.print("< THROW [R] ROCK / [P] PAPER / [S] SCISSORS:");

        int rpsOutcome = 0;
        /*
        1 = WIN
        2 = TIE
        3 = LOSE
         */

        char rpsSelect;
        rpsSelect = _scanner.next().charAt(0);

        int handValue;
        do{
            do{
                if (rpsSelect == 'r'){
                    System.out.println("");
                    System.out.println("   +---------------+");
                    System.out.println("   |  You threw... |");
                    System.out.println("   |     [ROCK]    |");
                    System.out.println("   |     __        |");
                    System.out.println("   |    |..|       |");
                    System.out.println("   |    /  =o      |");
                    System.out.println("   +---------------+");
                    break;
                } else if (rpsSelect == 'p'){
                    System.out.println("");
                    System.out.println("   +---------------+");
                    System.out.println("   |  You threw... |");
                    System.out.println("   |    [PAPER]    |");
                    System.out.println("   |     __        |");
                    System.out.println("   |    |..|       |");
                    System.out.println("   |    /  =o-     |");
                    System.out.println("   +---------------+");
                    break;
                } else if (rpsSelect == 's'){
                    System.out.println("");
                    System.out.println("   +---------------+");
                    System.out.println("   |  You threw... |");
                    System.out.println("   |   [SCISSORS]  |");
                    System.out.println("   |     __        |");
                    System.out.println("   |    |..|       |");
                    System.out.println("   |    /  =o<     |");
                    System.out.println("   +---------------+");
                    break;
                } else {
                    System.out.println("\n> INVALID INPUT TRY AGAIN!\n");
                    System.out.print("< THROW [R] ROCK / [P] PAPER / [S] SCISSORS:");
                    rpsSelect = _scanner.next().charAt(0);
                }
            } while (rpsSelect != 'r' || rpsSelect != 'p' || rpsSelect != 's');

            int cpuHand = rand.nextInt(3) + 1;

            boolean rpsWin;


            if (cpuHand == 1){
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   |   Ye threw... |");
                System.out.println("   |     [ROCK]    |");
                System.out.println("   +---------------+\n");
                if (rpsSelect == 'r'){
                    rpsOutcome = 2;
                    System.out.println("> [TIE]");
                } else if (rpsSelect == 'p') {
                    rpsOutcome = 1;
                    System.out.println("> [PLAYER WIN]");
                    rpsWin = true;
                } else {
                    rpsOutcome = 3;
                    System.out.println("> [KANYE WIN]");
                    rpsWin = false;
                }
            } else if (cpuHand == 2){
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   |   Ye threw... |");
                System.out.println("   |    [PAPER]    |");
                System.out.println("   +---------------+\n");
                if (rpsSelect == 'r'){
                    rpsOutcome = 3;
                    System.out.println("> [KANYE WIN]");
                    rpsWin = false;
                } else if (rpsSelect == 'p') {
                    rpsOutcome = 2;
                    System.out.println("> [TIE]");
                } else {
                    rpsOutcome = 1;
                    System.out.println("> [PLAYER WIN]");
                    rpsWin = true;
                }
            } else if (cpuHand == 3){
                System.out.println("");
                System.out.println("   +---------------+");
                System.out.println("   |   Ye threw... |");
                System.out.println("   |   [SCISSORS]  |");
                System.out.println("   +---------------+\n");
                if (rpsSelect == 'r'){
                    rpsOutcome = 1;
                    System.out.println("> [PLAYER WIN]");
                    rpsWin = true;
                } else if (rpsSelect == 'p') {
                    rpsOutcome = 3;
                    System.out.println("> [KANYE WIN]");
                    rpsWin = false;
                } else {
                    rpsOutcome = 2;
                    System.out.println("> [TIE]");
                }
            }
        } while (rpsOutcome == 2);

        System.out.println("");
        System.out.println("   +------------------------------------------------------------+");
        System.out.println("   |MMMMMMMMMMMMMMMMMMMMWKko:,.......';cdONWMMMMMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMWXOl;.                'cxKWWWWWMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMW0o'          .....        .c0WMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMWOc.    ........'''.......     .lKMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMXo. .......'',,,,;;;;;,,''......  'OWMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMXc  .....''',,;;:::c:::;;,,,''..... .xWMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMNl  .....''',,;:ccccccccc::;,,''..... .kMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMM0'  .....''',,;::ccccc:cc::;;,''...... ;KMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMd. .......'',,;:cccccccccc:::;,'...... .oWMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWo  ........'',;:loooollclloll:;,'...... ;KMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWl  .............,:ldxxxddolc;'......  . 'OMMMMMMMMM|");
        System.out.println("   |MMMMMMMMNc  .....',,,,;;;,,,:lloocc;,''','.... . .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMNl......',,''',,;;;,,,,:c;''',,,,'...... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMWd.....','......',',''';c:,..,;'......'...xWMMMMMMMM|");
        System.out.println("   |MMMMMMMMK:....''''',,,;c:;,,',;:::,''',;;,,'..'...,OMMMMMMMM|");
        System.out.println("   |MMMMMMMM0:....'',;;:::cllc:,,;;;::;,'';cc:;;;,'...:0MWMMMMMM|");
        System.out.println("   |MMMMMMMMNo,'...',;:ldddoll:;;;;;clc,,;;:loool:,'..cXMMMMMMMM|");
        System.out.println("   |MMMMMMMMNdc;..'';:cdxxl:;:;;:;,;clc,''';clddlc;'..lNMMMMMMMM|");
        System.out.println("   |MMMMMMMMWk:'..'',;:ccc;;;,.....',''....':clc:;,'..dWMMMMMMMM|");
        System.out.println("   |MMMMMMMMMXo......'',,,,'......',,;,.......,,'... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMNl....'',,''....',;::ccc:,,'... ..'... .kMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMM0,...'',:;..':odkOOO0000Okkdc,...'... ,KMWMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMWd.....';,..,;:clloddxxxolc:,,,....  .dWMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMNd. ......',;,,,;;:clc::,'..''..   .dNMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMNx'     ...'',;;,',,'........    ;OWMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMWKc.    .....,:,.,,'.....     'xNMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMW0c.     ...',',,,...     .cKWMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMMWXd;.  ........'...   .;kNMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMMMMMN0o;..          ..:xNWWMMMMMMMMMMMMMMMM|");
        System.out.println("   |MMMMMMMMMMMMMMMMMWMMMMMMN0d:'......,:dKWMMMMMMMMMMMMMMMMMMMM|");
        System.out.println("   +------------------------------------------------------------+");
        System.out.println("");

        if (rpsOutcome == 1){
            System.out.println("> DANG IT! YOU DEFEATED ME! MY EMPIRE OF YEEZY");
            System.out.println("  ALL GONE! I SHALL RETURN ONE DAY FOR MY REVENGE!");
            System.out.println("  TILL NEXT TIME WE MEET " + name.toUpperCase() + "!");
        } else if (rpsOutcome == 3){
            System.out.println("> HA HA HA! OUTSMARTED BY THE ONE AND ONLY YE!");
            System.out.println("  WITH THIS VICTORY, I SHALL REVIVE MY YEEZY CONTRACT");
            System.out.println("  AND RULE THE WORLD UNDER YE!\n");
            gameOver();
        }

        System.out.println("");
        System.out.println("   +---------------------+");
        System.out.println("   |   CONGRATULATIONS!  |");
        System.out.println("   | YOU DEFEATED KANYE! |");
        System.out.println("   |          __         |");
        System.out.println("   |        o|..|o       |");
        System.out.println("   |         \\  /        |");
        System.out.println("   | THE WORLD IS NOW AT |");
        System.out.println("   |        PEACE!       |");
        System.out.println("   +---------------------+\n");
        System.out.println("> THANK YOU FOR PLAYING KANYE QUEST...");
        System.out.println("  A CS-2011 PROJECT BY: - CHAN GAVIN");
        System.out.println("                        - NGUYEN JAMES");
        System.out.println("                        - ZHOU ADDISON");

        _scanner.close();
        System.exit(0);
    }

}
