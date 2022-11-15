import java.util.Scanner;

public class KanyeQuest {

    public static void gameOver(){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("   +-----------+");
        System.out.println("   | GAME OVER |");
        System.out.println("   +-----------+");
        System.out.println("");
        System.out.print("> PLAY AGAIN? [Y] [N]: ");
        
        char retryGame;

        retryGame = input.next().charAt(0);
        if (retryGame == 'y'){
            main(null);
        } else if (retryGame == 'n'){
        System.exit(0);
        }
        System.out.println("");
    }

    // Prints out prompt to click enter to continue code
    public static void nextPrompt(){
        Scanner input = new Scanner(System.in);
        String enterKey;
        System.out.print("  [PRESS ENTER TO CONTINUE]");
        System.out.println("");

        enterKey = input.nextLine();
    }

    // Prints out the tic tac toe board on terminal screen
    public static void printTicTacBoard(char[][] tictacBoard){
        for(char[] row: tictacBoard){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String startKey;
        String name;


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

        System.out.print("  [PRESS ENTER TO START GAME]");
        startKey = input.nextLine();
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
        name = input.next();

        // Edits name to proper formatting
        String firstLetStr = name.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = name.substring(1);

        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();

        // concantenate the first letter and remaining string
        String reformatedName = firstLetStr + remLetStr;

        System.out.println("");
        System.out.println("> So your name is " + reformatedName + "? HA HA good luck working");
        System.out.println("  here with that name, HA HA HA HA HA!");
        System.out.println("");

        System.out.print("< CHOOSE TO BEAT HIM UP? [Y] [N]:");
        char beatDown;

        beatDown = input.next().charAt(0);

        if (beatDown == 'y'){
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
        } else if (beatDown == 'n'){
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
        }

        nextPrompt();
        
        System.out.println("  Alright " + reformatedName + ", your first task as an intern");
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

        System.out.println("> " + reformatedName + ", I know it's too much to ask from an ");
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

        System.out.println("");
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
        // Prints String of empty space long as name
        int whitespaceSize = 17 - (name.length() + 11);
        String whiteSpace = "";
        for (int i = 0; i <= whitespaceSize; i++) {
            whiteSpace += " ";
        }

        System.out.println("         _____");
        System.out.println("        |     |");
        System.out.println("   +----|     |---+");
        System.out.println("   |   (|_____|)  |");
        System.out.println("   | +------+     |");
        System.out.println("   | |INTERN|  A  |");
        System.out.println("   | +------+  D  |");
        System.out.println("   | +------+  I  |");
        System.out.println("   | |  __  |  D  |");
        System.out.println("   | | |..| |  A  |");
        System.out.println("   | | /  \\ |  S  |");
        System.out.println("   | +------+     |");
        System.out.println("   | NAME: " + name.toUpperCase() + whiteSpace + "|");
        System.out.println("   | [||||||||||] |");
        System.out.println("   +--------------+");
        System.out.println("");
        
        System.out.println("> I CHALLENGE YOU TO A DUEL!");
        System.out.println("");

        char [][] tictacBoard = {{' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                                 {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                                 {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                                 {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                                 {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'},
                                 {' ',' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|', ' ', ' ', ' ','|'},
                                 {' ',' ','+', '-', '-', '-','+', '-', '-', '-','+', '-', '-', '-','+'}};

        for(char[] row: tictacBoard){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println("Enter position 1-9");
        int position = input.nextInt();


        switch(position){
            case 1:
                tictacBoard[1][4] = 'X';
                break;
            case 2:
                tictacBoard[1][8] = 'X';
                break;
            case 3:
                tictacBoard[1][12] = 'X';
                break;
            case 4:
                tictacBoard[3][4] = 'X';
                break;
            case 5:
                tictacBoard[3][8] = 'X';
                break;
            case 6:
                tictacBoard[3][12] = 'X';
                break;
            case 7:
                tictacBoard[5][4] = 'X';
                break;
            case 8:
                tictacBoard[5][8] = 'X';
                break;
            case 9:
                tictacBoard[5][12] = 'X';
                break;
            default:
                System.out.println("INVALID ENTRY");
                break;
        }



        // Call printTicTacBoard Method 
        printTicTacBoard(tictacBoard);


        //placePosition(tictacBoard, position, "cpu");


        /*
         +---+---+---+
         | X | O | O |
         +---+---+---+
         | X | O | X |
         +---+---+---+
         | X | X | O |
         +---+---+---+
         */

    }
}