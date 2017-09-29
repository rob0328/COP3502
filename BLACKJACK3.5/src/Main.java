import java.util.*;


public class Main

{
    public static void menu()
    {
        System.out.println(); //Provides blank space between outputs

        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print statistics");
        System.out.println("4. Exit");

    }



    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        int x = 0; //Variable for random card
        int y = 0; //Variable fot dealer's hand
        int dealer = 0; //Variable for dealer wins
        int player = 0; //Variable for player wins
        int ties = 0; //Variable for ties
        int games = 1; //Variable for number of games
        int hand; //Hand is player's hand
        int option = 0; // Option is user option input
        double percentage;



        System.out.println("Start Game #" + games);

        x += (Math.random() * 13 + 1); //Player's first card is dealt randomly from 1-13

        System.out.println(); //Provides blank space between outputs

        System.out.print("Your card is a ");

        switch (x) //Able to check for face cards
        {
            case 1:
                System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                break;
            case 11:
                System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                break;
            case 12:
                System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                break;
            case 13:
                System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                break;
            default:
                System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                break;
        }

        if (x == 11 || x == 12 || x == 13)
        {
            hand = 10;
            System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
        }

        else if (x == 1)
        {
            hand = 1;
            System.out.println("Your hand is: " + hand); //Displays hand for an ACE
        }
        else
        {
            hand = x;
            System.out.println("Your hand is: " + hand); //Displays hand from 2-10
        }

        menu();

        System.out.println(); //Provides blank space between outputs
        System.out.println("Choose an option: ");


        try
        {
            option = input.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input!");
            System.out.println("Please enter an integer between 1 and 4");
            input.nextLine();
        }




        while (option != 4)
        {
            if (option == 1)
            {
                System.out.println(); //Provides blank space between output
                System.out.print("Your card is a ");
                x += (Math.random() * 13 + 1) - x; //New card is given to player

                switch (x) //Allows to check for face cards for 2nd card
                    {
                        case 1:
                            System.out.println("ACE!");
                            break;
                        case 11:
                            System.out.println("JACK!");
                            break;
                        case 12:
                            System.out.println("QUEEN!");
                            break;
                        case 13:
                            System.out.println("KING!");
                            break;
                        default:
                            System.out.println(x + "!");
                            break;
                    }

                if (x == 11 || x == 12 || x == 13)
                {
                    hand += 10; // Gives all KINGS, QUEENS, and JACKS a value of 10 and adds to original hand
                    System.out.println("Your hand is: " + hand);
                }
                else if (x == 1)
                {
                    hand += 1; //Gives an ACE the value of 1 and adds to original hand
                    System.out.println("Your hand is: " + hand);
                }
                else
                {
                    hand += x; //Adds the value of the hand to the original hand
                    System.out.println("Your hand is: " + hand);
                }

                    //If player decides to keep using option 1, hand will eventually reach or surpass 21

                if (hand < 21) //If hand is less than 21 provide player with options
                {
                    menu();
                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }

                }


                if (hand == 21) //If player hits 21, automatic win for player
                {
                    System.out.println();
                    System.out.println("BLACKJACK! You win!");
                    player += 1;
                    games += 1;

                    System.out.println();
                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1); //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }

                }
                else if (hand > 21)  //If player exceed 21, automatic loss for player
                {
                    System.out.println();
                    System.out.println("You exceeded 21! You lose :(");
                    dealer += 1;
                    games += 1;

                    System.out.println();
                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1)-x; //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }

                }

            }

            if (option == 2)
            {
                y += (Math.random()* 11 + 16) -y; //Dealer's hand is randomized

                System.out.println();
                System.out.println("Your hand is: " + hand); //Displays the user current hand
                System.out.println("Dealer's hand: " + y); // Displays the dealer's hand

                if (hand > y && hand <= 21)
                {
                    System.out.println();
                    System.out.println("You win!");
                    player += 1;
                    games += 1;

                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1)-x; //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");
                    

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }
                }

                else if (y > hand && y <= 21)
                {
                    System.out.println();
                    System.out.println("Dealer wins!");
                    dealer += 1;
                    games += 1;

                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1)-x; //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }
                }
                else if ( y == hand && y <= 21)
                {
                    System.out.println();
                    System.out.println("It's a tie!");
                    ties += 1;
                    games += 1;

                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1)-x; //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }
                }

                else if (hand < 21 && y > 21)
                {
                    System.out.println();
                    System.out.println("You win!");
                    player += 1;
                    games += 1;

                    System.out.println("Start Game #" + games);

                    x += (Math.random() * 13 + 1)-x; //Player's first card is dealt randomly from 1-13

                    System.out.println(); //Provides blank space between outputs

                    System.out.print("Your card is a ");

                    switch (x) //Able to check for face cards
                    {
                        case 1:
                            System.out.println("ACE!"); //If x variable is 1, then ACE would be displayed as card
                            break;
                        case 11:
                            System.out.println("JACK!"); //If x is 11, then JACK would be displayed as card
                            break;
                        case 12:
                            System.out.println("QUEEN!"); //If x is 12, then QUEEN would be displayed as card
                            break;
                        case 13:
                            System.out.println("KING!"); //If x is 13, then KING would be displayed as card
                            break;
                        default:
                            System.out.println(x + "!"); //If x is 2-10, then the value of x would be displayed as card
                            break;
                    }

                    if (x == 11 || x == 12 || x == 13)
                    {
                        hand = 10;
                        System.out.println("Your hand is: " + hand); //Displays hand for a King, Jack, and Queen
                    }

                    else if (x == 1)
                    {
                        hand = 1;
                        System.out.println("Your hand is: " + hand); //Displays hand for an ACE
                    }
                    else
                    {
                        hand = x;
                        System.out.println("Your hand is: " + hand); //Displays hand from 2-10
                    }

                    menu();

                    System.out.println(); //Provides blank space between outputs
                    System.out.println("Choose an option: ");

                    try
                    {
                        option = input.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer between 1 and 4");
                        input.nextLine();
                    }
                }


            }

            if (option == 3)
            {
                System.out.println(); //Blank space between outputs
                System.out.println("Number of Player wins: " + player);
                System.out.println("Number of Dealer wins: " + dealer);
                System.out.println("Number of tie games: " + ties);
                System.out.println("Total # of games: " + games);

                percentage =  (((double)player/(double)games) * 100);

                System.out.println(); //Blank space between outputs
                System.out.println("Percentage of player wins: " + percentage + "%");

                menu();
                System.out.println(); //Provides blank space between outputs
                System.out.println("Choose an option: ");


                try
                {
                    option = input.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer between 1 and 4");
                    input.nextLine();
                }



            }

            if (option > 4 || option < 1)
            {
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer between 1 and 4");

                try
                {
                    option = input.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer between 1 and 4");
                    input.nextLine();
                }

            }


        }



    }
}
