// Name: Niveditha K.
// Title: Cat Collector RPG
// Date: April 8th, 2016
// Class: ICS208

// ASCII art credits:
// https://theissuesdesk.files.wordpress.com/2015/08/library_cat.jpg
// http://images.memes.com/character/meme/chemistry-cat.jpg
// https://s-media-cache-ak0.pinimg.com/236x/93/55/23/935523b3943c78efb442661e29e0f3fd.jpg
// http://patorjk.com/software/taag/#p=display&f=Nancyj-Underlined&t=Cat%20Collector
// http://ascii.co.uk/art/hallway

import java.applet.*;
import java.awt.*;
import javax.swing.*;



public class CatCollector
{

    private static int score = 0;
    public static void main (String args[])
    {
        new CatCollector ();
    }


    public CatCollector ()
    {

        char again = 'y';
        while (again == 'y')
        {
            while (PlayGame () == 'y')
            {
                String nom = IBIO.inputString ("What is your name? ");
                Backstory (nom);
                Entrance ();



                again = IBIO.inputChar ("Would you like to play again? (y/n) ");
            }

        }

    }


    // Game start page
    public char PlayGame ()
    {
        System.out.println("\n﻿a88888b.            dP       a88888b.          dP dP                     dP                     ");
        System.out.println("d8'   `88            88      d8'   `88          88 88                     88                     ");
        System.out.println("88        .d8888b. d8888P    88        .d8888b. 88 88 .d8888b. .d8888b. d8888P .d8888b. 88d888b. ");
        System.out.println("88        88'  `88   88      88        88'  `88 88 88 88ooood8 88'  `\"\"   88   88'  `88 88'  `88 ");
        System.out.println("Y8.   .88 88.  .88   88      Y8.   .88 88.  .88 88 88 88.  ... 88.  ...   88   88.  .88 88       ");
        System.out.println("Y88888P' `88888P8   dP       Y88888P' `88888P' dP dP `88888P' `88888P'   dP   `88888P' dP       ");
        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        return IBIO.inputChar ("Welcome to Cat Collector! Play? (y/n) ");

    }

    // Score counter
    // Call score = score(score); whenever the score is increased by 1 cat
    public int score (int score) {
        score++;
        System.out.println("You have received a stamp from " + score + "/6 cats.");
        return score;
    }

    public void Backstory (String nom)
    {
        System.out.println ("\n||,             |..|: (:)          []     (:)  xxxxxxX|");
        System.out.println ("|||             |..|:   ()                 (:)   xxxxX|");
        System.out.println ("\\|''         o  |..|:   (:)        []        ()_   xxX|");
        System.out.println (" cc88b       Cb |..|:  __||___________________||_   xx|            \"");
        System.out.println ("68%8QU89  \" d8Ub|..|:_//=========================\\  _x| \"  cce*88oo       \"");
        System.out.println ("O0896%68Oo   ||  \\.l/=/===========================\\|#||  C8O8*8Q8P*Ob o8oo");
        System.out.println ("a%0C88i%8B,,    \" /==/=============================\\#|/dOB*9*OLS*UOpugO9*D");
        System.out.println ("PQ%OO8OO' |||, \"  |..|     __               __ -=  |-' CO*9O0*89PBCOPL*SOBB*");
        System.out.println ("8OUC%CBO%b`|||,,,,|..| O   /\\    -=-        /\\   O |  \" Cgg*bU8*UO*OOd*UOdcb");
        System.out.println ("89Y|//OOP `||||||||..||/| /__\\ ___________ /__\\ |/||,,,,,,6O*U  /p  gc*U*dpP");
        System.out.println ("  \\||       \\||||||:.||/|      |##X##X##||      |/||||||||, \\\\\\//  /d*uUP* ,");
        System.out.println ("  |||        `|||||::||/| =-   |XX:XX:XX||      |/||||||||||, \\\\\\////_\\ ,,||");
        System.out.println (":        \"         \\:||/|      |.::..::.|| =    |/|||||||||||| |||// ,,,||||");
        System.out.println ("::   \"     \"        \\||_|______|........\\|______|_||           |||||");
        System.out.println (":::.      \"       \"                :  :                \"     .//||||\\   \"");
        System.out.println ("::::::.       \"            \"     , .           \"                     \"");
        System.out.println ("::%::::::.  \"       \"    .           :   `              \"        \"        \"");
        System.out.println ("::::::%:::::....              ,   :  . : ` .     \"          \"");
        System.out.println (":%:::::::::%::::::::.........:...:.:...:..:...........................::::::");
        System.out.println ("::::::%::::::::::%:::::::::::%:::::::::::::::%:::::::::::::::%::::%::::%::::");
        System.out.println ("`::::::::::%::::::::::::%::::::::::::::%::::::::::::%:::::%::::::::::::::%::");
        System.out.println ("\nIt's a bright, clear summer day!");
        System.out.println ("On your walk home from school, you notice your neighbour beckon you over.");
        System.out.println ("\"" + nom + "! Could you watch over my cats for an hour?\" she asks, \"I'd appreciate it.\"\n");
        System.out.println ("Your neighbour owns 6 cats, and you've always wanted to meet them...");
        System.out.println ("\n1) \"Sure, I'd love to.\"");
        System.out.println ("2) \"Will I be paid?\"");
        System.out.println ("3) \"Sorry, I'm busy right now.\"");
        int a = IBIO.inputInt ("\nYour response: ");

        if (a == 1)
            System.out.println ("\nYour neighbour smiles at you brightly. \"Great!\" she exclaims.");
        else if (a == 2)
        {
            System.out.println ("\n\"Not a penny. But perhaps you'll find something of significant value inside.\"");
            char watch = IBIO.inputChar ("Watch the house? (y/n) ");

            if (watch == 'n')
            {
                // Returns to beginning
                printSlow ("You refuse to watch the house.");
                System.out.println ("\n\"That's too bad then. You might have found something very interesting inside...\" says the neighbour.");
                System.out.println ("\nAll of a sudden, you fall asleep. Zzzzzzzzz...\n");
                String[] args = {};
                CatCollector.main (args);
            }
        }
        else
        {
            printSlow ("You refuse to watch the house.");
            System.out.println ("\n\"That's too bad then. You might have found something very interesting inside...\" says the neighbour.");
            System.out.println ("\nAll of a sudden, you fall asleep. Zzzzzzzzz...\n");
            String[] args = {};
            CatCollector.main (args);
        }

        System.out.println ("\n\"Thanks, " + nom + ". Feel free to use whatever you'd like while I'm away,\" she says.");
        System.out.println ("You try to say something in response but the lady runs off.");
        char enter = IBIO.inputChar ("\nEnter the house? (y/n) ");
        if (enter == 'n')
        {
            printSlow ("You refused to enter the house.");
            System.out.println ("\nHow are you planning to watch the cats, then?");
            System.out.println ("\nAll of a sudden, you fall asleep. Zzzzzzzzz...\n");
            String[] args = {};
            CatCollector.main (args);
        }
    }

    public void Entrance ()
    {
        printSlow("Slowly, you push open the front door, and walk through. You lock the door behind you.");
        System.out.println ("Current location:");
        System.out.println("______________________________________________________________");
        System.out.println("|                      ___      ___  __             __   ___ |");
        System.out.println("| |\\/|  /\\  | |\\ |    |__  |\\ |  |  |__)  /\\  |\\ | /  ` |__  |");
        System.out.println("| |  | /~~\\ | | \\|    |___ | \\|  |  |  \\ /~~\\ | \\| \\__, |___ |");
        System.out.println("|____________________________________________________________|\n");
        char read = IBIO.inputChar ("In front of you is a large poster titled \"The Catalogue\". Read it? (y/n) ");
        if (read == 'y')
        {
            System.out.println ("The Catalogue says:");
            System.out.println ("\n ___________________________________________________________________________________________");
            System.out.println ("| CHALLENGE:                                                                               |");
            System.out.println ("| If you obtain the paw-print of all 5 cats in the house, you will be crowned the next Cat |");
            System.out.println ("| Master. The cats wander around the house, and you must gain their respect before you     |");
            System.out.println ("| may be granted their paw-print. Good luck.                                               |");
            System.out.println (" ___________________________________________________________________________________________\n");
            System.out.println ("Sounds interesting! Hoping to become the next Cat Master, you decide to accept the challenge.\n");
        }


        char next = IBIO.inputChar ("\nWill you enter the Right Hallway (r) or the Left Hallway (l)? ");
        if (next == 'r')
            RightHallway ();
        else
            LeftHallway ();

    }


    // SCHRODINGER MAY APPEAR HERE

    public void RightHallway ()
    {
        HallwayArt();
        System.out.println ("\nCurrent location:");
        System.out.println("______________________________________________________________");
        System.out.println("|  __     __       ___                                       |");
        System.out.println("| |__) | / _` |__|  |     |__|  /\\  |    |    |  |  /\\  \\ /  |");
        System.out.println("| |  \\ | \\__> |  |  |     |  | /~~\\ |___ |___ |/\\| /~~\\  | |");
        System.out.println("|______________________________________________________________|");
        System.out.println ("\n1) Look inside the box on the floor");
        System.out.println ("2) Look behind the potted plant");
        System.out.println ("3) Continue walking");
        int choice = IBIO.inputInt("What do you do? (1/2/3) ");
        if (choice == 1){
            int random = (int) (Math.random () * 5) + 1;
            if (random != 1)
            {
                cat ("catbox");
                char pet = IBIO.inputChar("Will you approach the cat? (y/n) ");
                if (pet == 'y')
                    Schrodinger();
            }
            else
                System.out.println("It seems like there's nothing there for now.");
        }
        else
            System.out.println ("Looks like there's nothing there.");

        char next = IBIO.inputChar ("Will you enter the Music Room (m), or return to the Main Entrance (e)? ");
        if (next == 'm')
            MusicRoom ();
        else
            Entrance ();
    }


    public int MusicRoom () {
        MusicRoomArt();
        System.out.println ("\nCurrent location:");
        System.out.println("________________________________________________________");
        System.out.println("|            __     __      __   __   __               |");
        System.out.println("| |\\/| |  | /__` | /  `    |__) /  \\ /  \\  |\\/|        |");
        System.out.println("| |  | \\__/ .__/ | \\__,    |  \\ \\__/ \\__/  |  |        |");
        System.out.println("|______________________________________________________|");

        System.out.println ("\n1) Look on top of the piano");
        System.out.println ("2) Look behind the cello");
        System.out.println ("3) Continue walking");
        int choice = IBIO.inputInt("What do you do? (1/2/3) ");
        if (choice == 1)
        {
            // Calls MUSICAT
            int random = (int) (Math.random () * 5) + 1;
            if (random != 1)
            {
                cat ("catmusic");
                char pet = IBIO.inputChar("Will you approach the cat? (y/n) ");
                if (pet == 'y')
                    Musicat();

            }
            else
                System.out.println ("Looks like there's nothing there.");
        }

        else if (choice == 2)
            System.out.println ("Looks like there's nothing there.");

        char next = IBIO.inputChar("Go to the Chamber Room (c), or return to Right Hallway (r)? ");
        if (next == 'c')
            ChamberRoom();
        else
            RightHallway();
        return 0;
    }



    public void LeftHallway ()
    {

        System.out.println ("Current location:");
        System.out.println(" _________________________________________________________");
        System.out.println("|       ___  ___ ___                                      |");
        System.out.println("| |    |__  |__   |     |__|  /\\  |    |    |  |  /\\  \\ / |");
        System.out.println("| |___ |___ |     |     |  | /~~\\ |___ |___ |/\\| /~~\\  |  |");
        System.out.println("|_________________________________________________________|\n");

        System.out.println ("There seem to be many furballs in this room, but there are no cats in sight.");

        char next = IBIO.inputChar ("Will you enter the Library (l), or return to the Main Entrance (e)? ");
        if (next == 'l')
            Library ();
        else
            Entrance ();

    }


    public void ChamberRoom ()
    {
        System.out.println ("Current location:");
        System.out.println(" _______________________________________________________________");
        System.out.println("|  __                   __   ___  __      __   __   __         |");
        System.out.println("| /  ` |__|  /\\   |\\/| |__) |__  |__)    |__) /  \\ /  \\  |\\/|  |");
        System.out.println("| \\__, |  | /~~\\  |  | |__) |___ |  \\    |  \\ \\__/ \\__/  |  |  |");
        System.out.println("|______________________________________________________________|");
        System.out.println("");
        char next = IBIO.inputChar ("Will you enter the Laboratory (l), or return to the Right Hallway (r)? ");
        if (next == 'l')
            Laboratory ();
        else
            RightHallway ();
    }


    // CATHERINE MAY APPEAR HERE
    public int Library ()
    {
        System.out.println ("Current location:");
        System.out.println(" ____________________________________");
        System.out.println("|         __   __        __          |");
        System.out.println("| |    | |__) |__)  /\\  |__) \\ /     |");
        System.out.println("| |___ | |__) |  \\ /~~\\ |  \\  |      |");
        System.out.println("|____________________________________|");
        System.out.println("");
        int random = (int) (Math.random () * 5) + 1;
        int Catherine = 0;
        if (random != 1)
        {
            cat ("catbook");
            char pet = IBIO.inputChar("Will you approach the cat? (y/n) ");
            if (pet == 'y')
                Catherine = Catherine ();
        }


        char next = IBIO.inputChar ("Will you enter the Kitchen (k), or enter the Left Hallway (l)? ");
        if (next == 'k')
            Kitchen ();
        else
            LeftHallway ();
        return Catherine;
    }


    public int Kitchen ()
    {
        System.out.println ("Current location:");
        System.out.println(" __________________________________");
        System.out.println("|        ___  __        ___        |");
        System.out.println("| |__/ |  |  /  ` |__| |__  |\\ |   |");
        System.out.println("| |  \\ |  |  \\__, |  | |___ | \\|   |");
        System.out.println("|__________________________________|\n");
        int TheCaterer = 0;
        int Peaches = 0;
        System.out.println ("\nYou are in the Kitchen.");
        int random = (int) (Math.random () * 5) + 1;
        if (random != 1)
        {
            cat ("catchef");
            char pet = IBIO.inputChar("Will you approach the cat? (y/n) ");
            if (pet == 'y')
                TheCaterer = TheCaterer ();
        }
        char next = IBIO.inputChar ("Will you look in the fruits basket (f), or enter the Mush-room (m)? ");
        if (next == 'f')
            Peaches ();
        else
            Mushroom ();
        return (TheCaterer + Peaches);
    }


    public int Laboratory ()
    {
        System.out.println ("\nCurrent location:");
        System.out.println(" __________________________________________________");
        System.out.println("|            __   __   __       ___  __   __       |");
        System.out.println("| |     /\\  |__) /  \\ |__)  /\\   |  /  \\ |__) \\ /  |");
        System.out.println("| |___ /~~\\ |__) \\__/ |  \\ /~~\\  |  \\__/ |  \\  |   |");
        System.out.println("|__________________________________________________|\n");
        int random = (int) (Math.random () * 5) + 1;
        int Cation = 0;
        if (random != 1)
        {
            cat ("catlab");
            char pet = IBIO.inputChar("Will you approach the cat? (y/n) ");
            if (pet == 'y')
                Cation = Cation ();
        }
        char next = IBIO.inputChar ("Will you go to the Library (l), or enter the Right Hallway (r)? ");
        if (next == 'l')
            Library ();
        else
            RightHallway ();
        return Cation;


    }


    public void Ending (int score)
    {

        System.out.println ("After 20 minutes, the doorbell rings!");
        System.out.println ("You rush downstairs to open the door. Your neighbour waves at you.");
        System.out.println ("A cat rushes over to her and meows at her. Nodding, she turns to you.");
        printSlow ("\"I see that you accepted the challenge. We shall see if you have earned the title of Cat Master,\" she says.");
        System.out.println ("\nA few thoughtful moments later, your neighbour reveals the results.");


        if (score < 2)
            System.out.println ("You could only get the paw-prints of  " + score + " cats? I'm disappointed.");
        else if (score < 3)
            System.out.println ("Not bad. You were able to get at least " + score + " paw-prints.");
        else if (score < 5){
            System.out.println ("Impressive! The majority of my cats bestowed you with their paw-print. You deserve the title of");
            System.out.println ("   ____     ____     ________        __    __       ____      _____   ________    _____   ______    ");
            System.out.println ("  / ___)   (    )   (___  ___)       \\ \\  / /      (    )    / ____\\ (___  ___)  / ___/  (   __ \\   ");
            System.out.println (" / /       / /\\ \\       ) )          () \\/ ()      / /\\ \\   ( (___       ) )    ( (__     ) (__) )  ");
            System.out.println ("( (       ( (__) )     ( (           / _  _ \\     ( (__) )   \\___ \\     ( (      ) __)   (    __/   ");
            System.out.println ("( (        )    (       ) )         / / \\/ \\ \\     )    (        ) )     ) )    ( (       ) \\ \\  _  ");
            System.out.println (" \\ \\___   /  /\\  \\     ( (         /_/      \\_\\   /  /\\  \\   ___/ /     ( (      \\ \\___  ( ( \\ \\_)) ");
            System.out.println ("  \\____) /__(  )__\\    /__\\       (/          \\) /__(  )__\\ /____/      /__\\      \\____\\  )_) \\__/  ");}
        else
        { System.out.println ("Amazing! Not only did you find all the cats, but earned all the paw-prints! You certainly deserve the title of");
            System.out.println ("   ____     ____     ________        __    __       ____      _____   ________    _____   ______    ");
            System.out.println ("  / ___)   (    )   (___  ___)       \\ \\  / /      (    )    / ____\\ (___  ___)  / ___/  (   __ \\   ");
            System.out.println (" / /       / /\\ \\       ) )          () \\/ ()      / /\\ \\   ( (___       ) )    ( (__     ) (__) )  ");
            System.out.println ("( (       ( (__) )     ( (           / _  _ \\     ( (__) )   \\___ \\     ( (      ) __)   (    __/   ");
            System.out.println ("( (        )    (       ) )         / / \\/ \\ \\     )    (        ) )     ) )    ( (       ) \\ \\  _  ");
            System.out.println (" \\ \\___   /  /\\  \\     ( (         /_/      \\_\\   /  /\\  \\   ___/ /     ( (      \\ \\___  ( ( \\ \\_)) ");
            System.out.println ("  \\____) /__(  )__\\    /__\\       (/          \\) /__(  )__\\ /____/      /__\\      \\____\\  )_) \\__/  ");}


    }














    // PRINT SLOW METHOD

    public void printSlow (String s)
    {
        for (int i = 0 ; i < s.length () ; i++)
        {
            System.out.print ("" + s.charAt (i));
            //sleep for a bit after printing a letter
            try
            {
                Thread.sleep (100);
            }
            catch (InterruptedException m)
            {
                ;
            }
        }
        System.out.println ();
    }


    // IMAGE BOX METHOD

    public void cat (String pic)
    {
        if (pic.equals ("catbox"))
            JOptionPane.showMessageDialog (null, createImageIcon ("CatBox.jpg"), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
        else if (pic.equals ("catlab"))
            JOptionPane.showMessageDialog (null, createImageIcon ("catlab.jpg"), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
        else if (pic.equals ("catchef"))
            JOptionPane.showMessageDialog (null, createImageIcon ("catchef.jpg"), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
        else if (pic.equals ("catbook"))
            JOptionPane.showMessageDialog (null, createImageIcon ("catbook.jpg"), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
    }



   public void catlab (String pic)
   {
   JOptionPane.showMessageDialog (null, createImageIcon (pic), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
   }

   public void catchef (String pic)
   {
   JOptionPane.showMessageDialog (null, createImageIcon (pic), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
   }

   public void catbook (String pic)
   {
   JOptionPane.showMessageDialog (null, createImageIcon (pic), "A Cat Has Appeared!", JOptionPane.INFORMATION_MESSAGE);
   }


    // IMAGE BOX EXTRA
    protected static ImageIcon createImageIcon (String path)
    {
        java.net.URL imgURL = CatCollector.class.getResource (path);
        if (imgURL != null)
        {
            return new ImageIcon (imgURL);
        }
        else
        {
            System.err.println ("Couldn't find file: " + path);
            return null;
        }


    }


    // SCHRODINGER METHOD

    public int Schrodinger ()
    {
        System.out.println ("You look inside the box... and there's a cat!");
        System.out.println ("Feeling lucky, you try to put your hand inside the box to pet the cat, but the cat pushes a note into your hand instead.");
        char read = IBIO.inputChar ("Read the note? (y/n) ");
        if (read == 'y')
        {
            System.out.println ("The note says:");
            System.out.println ("\n ___________________________________________________________________________________________");
            System.out.println ("| WELCOME, HUMAN! I may or may not be the great Schrodinger cat. I hope we have a lively   |");
            System.out.println ("| time, and that no one is bored to death! I see that you are collecting paw prints, and   |");
            System.out.println ("| my task for you is very simple. You only have to answer the riddle on the front of the   |");
            System.out.println ("| box! No one else wants to entertain my puns...                                           |");
            System.out.println ("|__________________________________________________________________________________________|\n");
        }


        System.out.println ("You turn the box over, and read the riddle. It reads:");

        // The answer is "Purr-ple"
        // 4 tries to solve the riddle
        for (int i = 3 ; i > 0 ; i--)
        {
            String ans = IBIO.inputString ("\nWhat is a cat's favourite colour? ");
            // Complicated boolean expression for case-sensitive entries
            if (ans.equals ("Purrple") || ans.equals ("PURRPLE") || ans.equals ("purrple") || ans.equals ("Purr-ple") || ans.equals ("purr-ple")) {
                System.out.println ("You're correct! The cat meows in excitement. \"Good job!\" it seems to be saying.");
                System.out.println ("The cat excitedly dips its paw in an ink pad and stamps your forehead.");
                // This is a unicode symbol that looks like a paw-print
                System.out.println("\u1F43E");
                return score = score(score);
            }
            System.out.println("That is incorrect. You have " + i + " tries left.");
        }
        System.out.println ("Schrodinger shakes its head.");
        System.out.println ("You failed the task.");
        return 0;

    }


    public int Catherine ()
    {
        System.out.println("\nPerched on the shelves of the vast library, you notice a cat!");
        System.out.println ("Seeing the pretty cat trying to read a book, you try to stifle laughter.");
        System.out.println ("Despite your efforts, the cat turns to look at you. Before you can say a word, it slides over a book.\n");
        char read = IBIO.inputChar ("Read the book? (y/n) ");
        if (read == 'y')
        {
            System.out.println ("\nYou open the book to the first page. It reads:");
            System.out.println ("\n ___________________________________________________________________________________________");
            System.out.println ("| I see a human has finally came. I a-pawlogize for not noticing you previously. My name   |");
            System.out.println ("| is Catherine. Yes, it's a very uncommon cat name. But since you have to complete my task |");
            System.out.println ("| in order to obtain my paw print, I thought I could have you do me a favour. See, every   |");
            System.out.println ("| cat teases me for being stoic and never laughing. But I only don't laugh because their   |");
            System.out.println ("| jokes aren't funny! Could you tell me a funny joke so that I can prove to everyone that  |");
            System.out.println ("| I also have a sense of humour? I'll print my paw if I laugh. If not, please try again.   |");
            System.out.println ("|__________________________________________________________________________________________|\n");
        }

        MakeaJoke ();

        int random = (int) (Math.random () * 4);

        while (random == 1)
        {
            System.out.println ("Looks like that wasn't good enough. Try again!");
            MakeaJoke ();
            random = (int) (Math.random () * 4);
        }

        System.out.println ("\nTo your excitement, the cat bursts out laughing in what comes out as little meows. You made");
        System.out.println ("her laugh! Well done.");
        score = score(score);
        return score;

    }


    public void MakeaJoke ()
    {
        String noun = IBIO.inputString ("Enter a noun: ");
        String verb = IBIO.inputString ("Enter a plural noun: ");
        String colour = IBIO.inputString ("Enter a colour: ");
        String adj = IBIO.inputString ("Enter an adjective: ");
        String sil = IBIO.inputString ("Enter a silly word: ");
        String nam = IBIO.inputString ("Enter a store name: ");
        String ani = IBIO.inputString ("Enter an animal: ");
        String emo = IBIO.inputString ("Enter an emotion: ");
        String foo = IBIO.inputString ("Enter a food: ");
        String noun2 = IBIO.inputString ("Enter a plural noun: ");

        System.out.println ("My cat, " + sil + ", is the best kitten ever! Her mom was a tabby cat and her");
        System.out.println ("dad was a " + ani + ", so she looks more like a " + adj + " " + noun + ".");
        System.out.println ("Her favourite food is " + foo + ", but only if you dye it " + colour + ". One of our");
        System.out.println ("favourite games is to " + verb + " in my bedroom (except she always wins). Yesterday");
        System.out.println ("I felt " + emo + " because I thought she had run away... but it turns out she went to ");
        System.out.println (nam + " all day because we were out of " + noun2 + ". What a thoughtful kitten!\n");
    }


    public int TheCaterer ()
    {

        System.out.println ("\nTo your surprise, you see a cat stirring a bowl of stew!");
        char read = IBIO.inputChar ("\nThe cat pushes a cookbook toward you. Read the cookbook? (y/n) ");
        if (read == 'y')
        {
            System.out.println ("\nYou find a note wedged between two of the pages. It says:");
            System.out.println ("\n ___________________________________________________________________________________________");
            System.out.println ("| Hello! You've ended up in the kitchen, haven't you? Then, could you please help          |");
            System.out.println ("| me with an important mission?                                                            |");
            System.out.println ("| I am The Caterer. As our owner bought new magical cat food yesterday, I am in            |");
            System.out.println ("| charge of dividing up the food to serve all the cats. But I can't decide what to eat     |");
            System.out.println ("| for dinner today. Magical Cat meals must be nutritious and enjoyable to eat, and         |");
            System.out.println ("| must consist of an appetizer, main course, dessert, and drink. In total, the calories    |");
            System.out.println ("| should add to around 800.                                                                |");
            System.out.println ("| Here is a list of all the meal options. Please come up with a new, exciting, and         |");
            System.out.println ("| magical meal plan for us tonight.                                                        |");
            System.out.println (" ___________________________________________________________________________________________\n");
        }

        for (int i = 3 ; i > 0 ; i--)
        {
            if (MealPlanner () < 800)
            {
                System.out.println ("\nThe Caterer suddenly nods in approval. He fishes the menu from your hands and immediately gets");
                System.out.println ("to work on making the dish. After a second, he turns around and stamps his paw on some paper. \n");
                score = score(score);
                return score;
            }
            System.out.println ("That looks like it has too many calories.");
            System.out.println ("That was a horrible menu! Try again!");

        }
        return 0;

    }


    public double MealPlanner ()
    {
        double total = 0;
        System.out.println ("\nHere are the three appetizer choices:");
        System.out.println ("1 - Strawberries (121 Calories)");
        System.out.println ("2 - Cheese (333 Calories)");
        System.out.println ("3 - Fried pineapples (420 Calories)");
        System.out.println ("4 - no appetizer");
        int appetizer = IBIO.inputInt ("\nPlease enter an appetizer choice: ");
        if (appetizer == 1)
            total += 121;
        else if (appetizer == 2)
            total += 333;
        else if (appetizer == 3)
            total += 420;

        System.out.println ("\nHere are the three main course choices:");
        System.out.println ("1 - Bread (100 Calories)");
        System.out.println ("2 - Seasoned shrimp (57 Calories)");
        System.out.println ("3 - Mice (100 Calories)");
        System.out.println ("4 - No main course");
        int maincourse = IBIO.inputInt ("\nPlease enter a main course choice: ");
        if (maincourse == 1)
            total += 100;
        else if (maincourse == 2)
            total += 57;
        else if (maincourse == 3)
            total += 100;

        System.out.println ("\nHere are the three dessert choices:");
        System.out.println ("1 - Marshmallow cake (400 Calories)");
        System.out.println ("2 - Sweet yam (200 Calories)");
        System.out.println ("3 - Coconut jell0 (98 Calories)");
        System.out.println ("4 - no dessert");
        int dessert = IBIO.inputInt ("\nPlease enter a dessert choice: ");
        if (dessert == 1)
            total += 400;
        else if (dessert == 2)
            total += 200;
        else if (dessert == 3)
            total += 98;

        System.out.println ("\nHere are the three drink choices:");
        System.out.println ("1 - Milk (167 Calories)");
        System.out.println ("2 - Magic water (2 Calories)");
        System.out.println ("3 - Banana soup (280 Calories)");
        System.out.println ("4 - no drink");
        int drink = IBIO.inputInt ("\nPlease enter a drink choice: ");
        if (drink == 1)
            total += 167;
        else if (drink == 2)
            total += 2;
        else if (drink == 3)
            total += 280;

        System.out.println ("\nYour total calorie count is " + total + ". That is " + total/1600 * 100 + "% of the maximum.");
        return total;
    }



    //PATH starts

    public void Peaches ()
    {
        cat ("catbasket");
        char ans = IBIO.inputChar ("There's a note on the table that says \"Read Me\". Read it? (y/n) ");
        if (ans == 'y')
        {
            System.out.println ("The note says:");

            System.out.println ("\n ___________________________________________________________________________________________");
            System.out.println ("| Hello human! My name is Peaches. I like maps and mystery, so if you want to pet me,      |");
            System.out.println ("| you'll need to pass my maze. In this challenge, there are three rows of rocks that you   |");
            System.out.println ("| must cross in order to reach me. Only one rock in each row is real, and you can step on  |");
            System.out.println ("| it. If you step on a fake rock, you'll fall on the floor. Falling to the floor means     |");
            System.out.println ("| that you have to return to the beginning again. I hope you pass the task!                |");
            System.out.println ("|                                                                                          |");
            System.out.println ("| Hint: The path remains the same for one visit!                                           |");
            System.out.println (" ___________________________________________________________________________________________\n");
            System.out.println ("What a nice cat.\n");

            System.out.println("\nOooOOo.                o    ");
            System.out.println("O     `O              O     ");
            System.out.println("o      O          O   o     ");
            System.out.println("O     .o         oOo  O     ");
            System.out.println("oOooOO'  .oOoO'   o   OoOo. ");
            System.out.println("o        O   o    O   o   o ");
            System.out.println("O        o   O    o   o   O ");
            System.out.println("o'       `OoO'o   `oO O   o\n");

        }

        char array[] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        //These are the three correct rocks.
        int answer1 = (int) (Math.random () * 3);
        int answer2 = (int) (Math.random () * 3) + 3;
        int answer3 = (int) (Math.random () * 3) + 6;
        array [answer1] = 'c';
        array [answer2] = 'c';
        array [answer3] = 'c';

        // This prints out the answers:
        // System.out.println(Arrays.toString(array));

        runPath (array);



    }


    // This hides the correct answers
    public char PrintBlank (int x, char array[])
    {
        if (array [x] == 'c')
            return ' ';
        else
            return array [x];
    }




    public int FirstStep (char array[])
    {
        printPath (1, array);
        int choice = IBIO.inputInt ("Which row would you like to step in? ");
        while (choice < 1 || choice > 3)
        {
            System.out.println ("You can't step there.");
            choice = IBIO.inputInt ("Which row would you like to step in? ");
        }
        if (array [choice - 1] == ' ' || array [choice - 1] == 'X')
        {
            array [choice - 1] = 'X';
            System.out.println ("Oh no! You appear to have stepped on a fake rock, and fall to the ground.");
            System.out.println ("You return to the beginning.");
            System.out.println ("");
            return 1;
        }
        else
        {

            array [choice - 1] = '+';
            System.out.println ("Great! You stepped on the right rock.");
            return 2;
        }
    }


    public int SecondStep (char array[])
    {
        printPath (2,array);
        int choice = IBIO.inputInt ("Which row would you like to step in? ");
        while (choice < 3 || choice > 6)
        {
            System.out.println ("You can't step there.");
            choice = IBIO.inputInt ("Which row would you like to step in? ");
        }
        if (array [choice - 1] == ' ' || array [choice - 1] == 'X')
        {
            array [choice - 1] = 'X';
            System.out.println ("Oh no! You appear to have stepped on a fake rock, and fall to the ground.");
            System.out.println ("You return to the beginning.");
            System.out.println ("");
            return 1;
        }
        else
        {

            array [choice - 1] = '+';
            System.out.println ("Great! You stepped on the right rock.");
            return 3;
        }

    }


    public int ThirdStep (char array[])
    {
        printPath (3,array);
        int choice = IBIO.inputInt ("Which row would you like to step in? ");
        while (choice < 6 || choice > 9)
        {
            System.out.println ("You can't step there.");
            choice = IBIO.inputInt ("Which row would you like to step in? ");
        }
        if (array [choice - 1] == ' ' || array [choice - 1] == 'X')
        {
            array [choice - 1] = 'X';
            System.out.println ("Oh no! You appear to have stepped on a fake rock, and fall to the ground.");
            System.out.println ("You return to the beginning.");
            System.out.println ("");
            return 1;
        }
        else
        {

            array [choice - 1] = '+';
            System.out.println ("Great! You stepped on the right rock.");
            return 4;
        }
    }


    public void runPath (char array[])
    {
        int currentRow = 1;
        while (currentRow < 4)
        {
            if (currentRow == 1)
                currentRow = FirstStep (array);
            else if (currentRow == 2)
                currentRow = SecondStep (array);
            else
                currentRow = ThirdStep (array);

        }

        Winner ();


    }


    public void printPath (int row, char array[])
    {
        if (row == 1)
            System.out.println ("\n        1          2          3");
        else if (row == 2)
            System.out.println ("\n        4          5          6");
        else
            System.out.println ("\n        7          8          9");
        System.out.println ("");
        System.out.println ("      ***      |    ***    |   ***");
        System.out.println ("     * " + PrintBlank (0, array) + " *     |   * " + PrintBlank (1, array) + " *   |  * " + PrintBlank (2, array) + " *");
        System.out.println ("      ***      |    ***    |   ***");
        System.out.println ("   -  -  -  -  -  -  -  -  -  -  -");
        System.out.println ("      ***      |    ***    |   ***");
        System.out.println ("     * " + PrintBlank (3, array) + " *     |   * " + PrintBlank (4, array) + " *   |  * " + PrintBlank (5, array) + " *");
        System.out.println ("      ***      |    ***    |   ***");
        System.out.println ("   -  -  -  -  -  -  -  -  -  -  -");
        System.out.println ("      ***      |    ***    |   ***");
        System.out.println ("     * " + PrintBlank (6, array) + " *     |   * " + PrintBlank (7, array) + " *   |  * " + PrintBlank (8, array) + " *");
        System.out.println ("      ***      |    ***    |   ***");

    }


    public int Winner ()
    {
        System.out.println ("You crossed all three rows!");
        System.out.println ("Peaches nudges you. You look up and notice that she is holding a note in her paws.");
        System.out.println (" _____________________________________________");
        System.out.println ("| CongCATuations! You may pet me now. It was |");
        System.out.println ("| fun giving you this challenge!             |");
        System.out.println ("|                                  - Thanks, |");
        System.out.println ("|                                    Peaches |");
        System.out.println (" _____________________________________________");
        System.out.println ("");
        char pet = IBIO.inputChar ("Would you like to get her paw-print? (y/n) ");
        if (pet == 'y')
        {
            System.out.println ("Peaches stamps a tissue, and then she gracefully rolls away.");

        }
        score = score(score);
        char next = IBIO.inputChar("Go to the music room (m), or the laboratory (l)? ");
        if (next == 'm')
            MusicRoom();
        else
            Laboratory();
        return score;
    }

    // PATH ENDS

    public void Mushroom ()
    {
        System.out.println("Your current location:");
        System.out.println(" ___________________________________________");
        System.out.println("|            __        __   __   __        |");
        System.out.println("| |\\/| |  | /__` |__| |__) /  \\ /  \\  |\\/| |");
        System.out.println("| |  | \\__/ .__/ |  | |  \\ \\__/ \\__/  |  | |");
        System.out.println(" __________________________________________|");
        System.out.println ("Is this even a real room?");
        System.out.println ("Yes, this is the final room!");
        System.out.println ("Come here when you'll seen as many cats as you can.");
        char next = IBIO.inputChar("Go to the Fruit Basket (f), return to the Hallway (h), or stay (s)? ");
        if (next == 'f')
            Peaches();
        else if (next == 'h')
            RightHallway();
        else
            Ending(score);
    }


    public int Cation ()
    {
        System.out.println ("The note says:");
        System.out.println ("");
        System.out.println (" ___________________________________________________________________________________________");
        System.out.println ("| Welcome, human! Everyone calls me Cation.      I�ve been waiting for you. This is my     |");
        System.out.println ("| challenge for you. I enjoy strategy, and other cats have said that I�m unbeatable at Paws|");
        System.out.println ("| and Fish. You may know this game as Tic Tac Toe. You have to get three fish in a row to  |");
        System.out.println ("| win. You can go first!                                                                   |");
        System.out.println (" ___________________________________________________________________________________________");
        System.out.println ("");

        PawsandFish ();

        System.out.println ("Finally, you won! You get to stay meowutside and pet me.");
        return score;

    }


    public int PawsandFish ()
    {
        System.out.println ("Welcome to Paws and Fish! Try to get 3 in a row");

        char a = ' ';
        char b = ' ';
        char c = ' ';
        char d = ' ';
        char e = ' ';
        char f = ' ';
        char g = ' ';
        char h = ' ';
        char i = ' ';
        boolean win = false;
        boolean win2 = false;
        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);


        //USER'S FIRST TURN

        System.out.println ("\nTurn 1: Player O");
        int x = IBIO.inputInt ("Which x value would you like? ");
        int y = IBIO.inputInt ("Which y value would you like? ");

        if (x == 1)
        {
            if (y == 2)
                d = 'O';
            else if (y == 1)
                a = 'O';
            else if (y == 3)
                g = 'O';
        }

        else if (x == 2)
        {
            if (y == 1)
                b = 'O';
            else if (y == 2)
                e = 'O';
            else if (y == 3)
                h = 'O';
        }


        else if (x == 3)
        {
            if (y == 1)
                c = 'O';
            else if (y == 2)
                f = 'O';
            else if (y == 3)
                i = 'O';
        }

        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

        //COMPUTER'S FIRST TURN (GOES IN A CORNER)

        System.out.println ("\nTurn 2: Player X");
        System.out.println ("Now it's my turn.");

        if (a == ' ')
            a = 'X';
        else if (i == ' ' && e == ' ')
            i = 'X';
        else if (g == ' ' && d == ' ')
            g = 'X';
        else if (c == ' ' && b == ' ')
            c = 'X';

        System.out.println ("\n    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

        //USER'S SECOND TURN

        System.out.println ("\nTurn 3: Player O");
        int x2 = IBIO.inputInt ("Which x value would you like? ");
        int y2 = IBIO.inputInt ("Which y value would you like? ");


        if (x2 == 1)
        {
            if (y2 == 2)
                d = 'O';
            else if (y2 == 1)
                a = 'O';
            else if (y2 == 3)
                g = 'O';
        }


        else if (x2 == 2)
        {
            if (y2 == 2)
                e = 'O';
            else if (y2 == 1)
                b = 'O';
            else if (y2 == 3)
                h = 'O';
        }


        else
        {
            if (y2 == 2)
                f = 'O';
            else if (y2 == 1)
                c = 'O';
            else if (y2 == 3)
                i = 'O';
        }


        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

        //COMPUTER'S SECOND TURN

        System.out.println ("\nTurn 4: Player X");
        System.out.println ("So close to victory >:D");

        //CONNECT THREE

        if (i == 'X' && a == 'X' && e == ' ')
        {
            e = 'X';
            win = true;
        }


        else if (g == 'X' && a == 'X' && d == ' ')
        {
            d = 'X';
            win = true;
        }


        else if (c == 'X' && a == 'X' && b == ' ')
        {
            b = 'X';
            win = true;
        }


        //VERTICAL BEH

        else if (b == 'O' && e == 'O')
            h = 'X';
        else if (b == 'O' && h == 'O')
            e = 'X';
        else if (e == 'O' && h == 'O')
            b = 'X';


            //VERTICAL CFI

        else if (c == 'O' && f == 'O')
            i = 'X';
        else if (c == 'O' && i == 'O')
            f = 'X';
        else if (f == 'O' && i == 'O')
            c = 'X';

            //HORIZONAL DEF

        else if (d == 'O' && e == 'O')
            f = 'X';
        else if (d == 'O' && f == 'O')
            e = 'X';
        else if (e == 'O' && f == 'O')
            d = 'X';

            //HORIZONTAL GHI

        else if (g == 'O' && h == 'O')
            i = 'X';
        else if (g == 'O' && i == 'O')
            h = 'X';
        else if (h == 'O' && i == 'O')
            g = 'X';

            //DIAGONAL GEC

        else if (g == 'O' && e == 'O')
            c = 'X';
        else if (g == 'O' && c == 'O')
            e = 'X';
        else if (e == 'O' && c == 'O')
            g = 'X';

            //OR MOVE TO FREE SPACE

        else if (c == ' ')
            c = 'X';
        else if (g == ' ')
            g = 'X';

        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);



        //USER'S THIRD TURN

        System.out.println ("\nTurn 5: Player O");
        int x3 = IBIO.inputInt ("Which x value would you like? ");
        int y3 = IBIO.inputInt ("Which y value would you like? ");

        if (x3 == 1)
        {
            if (y3 == 1)
                a = 'O';
            else if (y3 == 2)
                d = 'O';
            else if (y3 == 3)
                g = 'O';
        }


        else if (x3 == 2)
        {
            if (y3 == 1)
                b = 'O';
            else if (y3 == 2)
                e = 'O';
            else if (y3 == 3)
                h = 'O';
        }


        else if (x3 == 3)
        {
            if (y3 == 1)
                c = 'O';
            else if (y3 == 2)
                f = 'O';
            else if (y3 == 3)
                i = 'O';
        }

        //VERTICAL BEH

        if (b == 'O' && e == 'O' && h == 'O')
            win2 = true;

            //VERTICAL CFI

        else if (c == 'O' && f == 'O' && i == 'O')
            win2 = true;

            //HORIZONAL DEF

        else if (d == 'O' && e == 'O' && f == 'O')
            win2 = true;

            //HORIZONTAL GHI

        else if (g == 'O' && h == 'O' && i == 'O')
            win2 = true;

            //DIAGONAL GEC

        else if (g == 'O' && e == 'O' && c == 'O')
            win2 = true;

        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);



        //COMPUTER'S THIRD TURN
        if (win != true) {
            System.out.println ("\nTurn 6: Player: X");
            System.out.println ("\nI'll move here.\n");

            //THREE X'S IN A ROW

            //VERTICAL BEH

            if (b == 'X' && e == 'X' && h == 'X')
                win = true;

                //VERTICAL CFI

            else if (c == 'X' && f == 'X' && i == 'X')
                win = true;

                //HORIZONAL DEF

            else if (d == 'X' && e == 'X' && f == 'X')
                win = true;

                //HORIZONTAL GHI

            else if (g == 'X' && h == 'X' && i == 'X')
                win = true;

                //DIAGONAL GEC

            else if (g == 'X' && e == 'X' && c == 'X')
                win = true;
        }




        //TWO X'S IN A ROW

        //VERTICAL BEH

        if (b == 'X' && c == ' ')
        {
            c = 'X';
            win = true;
        }
        else if (c == 'X' && b == ' ')
        {
            b = 'X';
            win = true;
        }
        else if (b == 'X' && e == 'X')
        {
            h = 'X';
            win = true;
        }
        else if (b == 'X' && h == 'X')
        {
            e = 'X';
            win = true;
        }
        else if (e == 'X' && h == 'X')
        {
            b = 'X';
            win = true;
        }

        //VERTICAL CFI

        else if (c == 'X' && f == 'X')
        {
            i = 'X';
            win = true;
        }
        else if (c == 'X' && i == 'X')
        {
            f = 'X';
            win = true;
        }
        else if (f == 'X' && i == 'X')
        {
            c = 'X';
            win = true;
        }

        //HORIZONAL DEF

        else if (d == 'X' && e == 'X')
        {
            f = 'X';
            win = true;
        }
        else if (d == 'X' && f == 'X')
        {
            e = 'X';
            win = true;
        }
        else if (e == 'X' && f == 'X')
        {
            d = 'X';
            win = true;
        }

        //HORIZONTAL GHI

        else if (g == 'X' && h == 'X')
        {
            i = 'X';
            win = true;
        }
        else if (g == 'X' && i == 'X')
        {
            h = 'X';
            win = true;
        }
        else if (h == 'X' && i == 'X')
        {
            g = 'X';
            win = true;
        }

        //DIAGONAL GEC

        else if (g == 'X' && e == 'X')
        {
            c = 'X';
            win = true;
        }
        else if (g == 'X' && c == 'X')
        {
            e = 'X';
            win = true;
        }
        else if (e == 'X' && c == 'X')
        {
            g = 'X';
            win = true;
        }


        //BLOCKING O'S MOVES

        //VERTICAL BEH

        else if (b == 'O' && e == 'O')
            h = 'X';
        else if (b == 'O' && h == 'O')
            e = 'X';
        else if (e == 'O' && h == 'O')
            b = 'X';


            //VERTICAL CFI

        else if (c == 'O' && f == 'O')
            i = 'X';
        else if (c == 'O' && i == 'O')
            f = 'X';
        else if (f == 'O' && i == 'O')
            c = 'X';

            //HORIZONAL DEF

        else if (d == 'O' && e == 'O')
            f = 'X';
        else if (d == 'O' && f == 'O')
            e = 'X';
        else if (e == 'O' && f == 'O')
            d = 'X';

            //HORIZONTAL GHI

        else if (g == 'O' && h == 'O')
            i = 'X';
        else if (g == 'O' && i == 'O')
            h = 'X';
        else if (h == 'O' && i == 'O')
            g = 'X';

            //DIAGONAL GEC

        else if (g == 'O' && e == 'O')
            c = 'X';
        else if (g == 'O' && c == 'O')
            e = 'X';
        else if (e == 'O' && c == 'O')
            g = 'X';


            //FREE CORNER

        else if (g == ' ')
            g = 'X';

        else if (i == ' ')
            i = 'X';
        else if (c == ' ')
            c = 'X';
        else if (e == ' ')
            e = 'X';
        else if (d == ' ')
            d = 'X';
        else if (b == ' ')
            b = 'X';
        else if (f == ' ')
            f = 'X';
        else if (h == ' ')
            h = 'X';

        System.out.println ("    1     2     3");
        System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
        System.out.println ("    -  -  -  -  -");
        System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

        if (win != true)
        {

            //USER'S FOURTH TURN

            System.out.println ("\nTurn 7: Player O");
            int x4 = IBIO.inputInt ("Which x value would you like? ");
            int y4 = IBIO.inputInt ("Which y value would you like? ");


            if (x4 == 1)
            {
                if (y4 == 2)
                {
                    d = 'O';
                }
                else if (y4 == 3)
                {
                    g = 'O';
                }
            }
            else if (x4 == 2)
            {
                if (y4 == 1)
                {
                    b = 'O';
                }
                else if (y4 == 2)
                {
                    e = 'O';
                }
                else if (y4 == 3)
                {
                    h = 'O';
                }
            }
            else if (x4 == 3)
            {
                if (y4 == 1)
                {
                    c = 'O';
                }
                else if (y4 == 2)
                {
                    f = 'O';
                }
                else if (y4 == 3)
                {
                    i = 'O';
                }

            }

            //VERTICAL BEH

            if (b == 'O' && e == 'O' && h == 'O')
                win2 = true;

                //VERTICAL CFI

            else if (c == 'O' && f == 'O' && i == 'O')
                win2 = true;

                //HORIZONAL DEF

            else if (d == 'O' && e == 'O' && f == 'O')
                win2 = true;

                //HORIZONTAL GHI

            else if (g == 'O' && h == 'O' && i == 'O')
                win2 = true;

                //DIAGONAL GEC

            else if (g == 'O' && e == 'O' && c == 'O')
                win2 = true;

            System.out.println ("    1     2     3");
            System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("3   " + g + "  |  " + h + "  |  " + i);


            if (win != true) {
                //COMPUTER'S FOURTH TURN

                //THREE X'S IN A ROW

                //VERTICAL BEH

                if (b == 'X' && e == 'X' && h == 'X')
                    win = true;

                    //VERTICAL CFI

                else if (c == 'X' && f == 'X' && i == 'X')
                    win = true;

                    //HORIZONAL DEF

                else if (d == 'X' && e == 'X' && f == 'X')
                    win = true;

                    //HORIZONTAL GHI

                else if (g == 'X' && h == 'X' && i == 'X')
                    win = true;

                    //DIAGONAL GEC

                else if (g == 'X' && e == 'X' && c == 'X')
                    win = true;

                System.out.println ("    1     2     3");
                System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
                System.out.println ("    -  -  -  -  -");
                System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
                System.out.println ("    -  -  -  -  -");
                System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

                System.out.println ("\nTurn 8: Player X");
                System.out.println ("\nHere is my final move.");
                if (b == ' ')
                    b = 'X';
                else if (c == ' ')
                    c = 'X';
                else if (d == ' ')
                    d = 'X';
                else if (e == ' ')
                    e = 'X';
                else if (f == ' ')
                    f = 'X';
                else if (g == ' ')
                    g = 'X';
                else if (h == ' ')
                    h = 'X';
                else if (i == ' ')
                    i = 'X';

                    //THREE X'S IN A ROW

                    //VERTICAL BEH

                else if (b == 'X' && e == 'X' && h == 'X')
                    win = true;

                    //VERTICAL CFI

                else if (c == 'X' && f == 'X' && i == 'X')
                    win = true;

                    //HORIZONAL DEF

                else if (d == 'X' && e == 'X' && f == 'X')
                    win = true;

                    //HORIZONTAL GHI

                else if (g == 'X' && h == 'X' && i == 'X')
                    win = true;

                    //DIAGONAL GEC

                else if (g == 'X' && e == 'X' && c == 'X')
                    win = true;


            }System.out.println ("    1     2     3");
            System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("3   " + g + "  |  " + h + "  |  " + i);











            //USER'S FIFTH TURN

            System.out.println ("\nTurn 9: Player O");
            int x5 = IBIO.inputInt ("Which x value would you like? ");
            int y5 = IBIO.inputInt ("Which y value would you like? ");


            if (x5 == 1)
            {
                if (y5 == 2)
                {
                    d = 'O';
                }
                else if (y5 == 3)
                {
                    g = 'O';
                }
            }
            else if (x5 == 2)
            {
                if (y5 == 1)
                {
                    b = 'O';
                }
                else if (y5 == 2)
                {
                    e = 'O';
                }
                else if (y5 == 3)
                {
                    h = 'O';
                }
            }
            else if (x5 == 3)
            {
                if (y5 == 1)
                {
                    c = 'O';
                }
                else if (y5 == 2)
                {
                    f = 'O';
                }
                else if (y5 == 3)
                {
                    i = 'O';
                }

            }

            System.out.println ("    1     2     3");
            System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

            //THREE X'S IN A ROW

            //VERTICAL BEH

            if (b == 'X' && e == 'X' && h == 'X')
                win = true;

                //VERTICAL CFI

            else if (c == 'X' && f == 'X' && i == 'X')
                win = true;

                //HORIZONAL DEF

            else if (d == 'X' && e == 'X' && f == 'X')
                win = true;

                //HORIZONTAL GHI

            else if (g == 'X' && h == 'X' && i == 'X')
                win = true;

                //DIAGONAL GEC

            else if (g == 'X' && e == 'X' && c == 'X')
                win = true;

            System.out.println ("    1     2     3");
            System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("3   " + g + "  |  " + h + "  |  " + i);

            if (win != true) {
                //COMPUTER'S FIFTH TURN

                System.out.println ("\nTurn 10: Player X");
                System.out.println ("\nHere is my final move.");
                if (b == ' ')
                    b = 'X';
                else if (c == ' ')
                    c = 'X';
                else if (d == ' ')
                    d = 'X';
                else if (e == ' ')
                    e = 'X';
                else if (f == ' ')
                    f = 'X';
                else if (g == ' ')
                    g = 'X';
                else if (h == ' ')
                    h = 'X';
                else if (i == ' ')
                    i = 'X';

                    //THREE X'S IN A ROW

                    //VERTICAL BEH

                else if (b == 'X' && e == 'X' && h == 'X')
                    win = true;

                    //VERTICAL CFI

                else if (c == 'X' && f == 'X' && i == 'X')
                    win = true;

                    //HORIZONAL DEF

                else if (d == 'X' && e == 'X' && f == 'X')
                    win = true;

                    //HORIZONTAL GHI

                else if (g == 'X' && h == 'X' && i == 'X')
                    win = true;

                    //DIAGONAL GEC

                else if (g == 'X' && e == 'X' && c == 'X')
                    win = true;
            }
            System.out.println ("    1     2     3");
            System.out.println ("1   " + a + "  |  " + b + "  |  " + c);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("2   " + d + "  |  " + e + "  |  " + f);
            System.out.println ("    -  -  -  -  -");
            System.out.println ("3   " + g + "  |  " + h + "  |  " + i);
        }

        if (win == true && win2 == false) {
            System.out.println ("\nI won!");
            return 0;}
        else if (win2 == true) {
            System.out.println("\nWell done, you won!");
            score = score(score);
            return score;
        }
        else
            System.out.println ("\nAw, it was a tie.\n");
        return score;

    }






    public void HallwayArt() {
        System.out.println("'.                      |");
        System.out.println(" '.                    |       ___________________             ____________");
        System.out.println("   '.                  |      |  _______________  |           |.----------.|");
        System.out.println(".    '.                |      | |               | |           ||     |>   ||");
        System.out.println("|'.    '.              |      | |   ___   ___   | |           || O  /|    ||");
        System.out.println("|. '.    '.____________|      | |  |   | |   |  | |           ||   /_(    ||");
        System.out.println("|||.|     |            |      | |  |   | |   |  | |           || .___|__  ||");
        System.out.println("|||||     |            |      | |  |   | |   |  | |           ||~~\\____|~~||");
        System.out.println("|||||     |            |      | |  |   | |   |  | |           || ~  ~    ~||");
        System.out.println("|||||     |            |      | |  |   | |   |  | |           |:__________:|");
        System.out.println("|||||     |        *   |      | |  |   | |   |  | |           '------------'");
        System.out.println("|||||     |    *..'    |      | |  '---___---'__| |");
        System.out.println("|  '|     |     _:_    |      | |    |_____| |__= |");
        System.out.println("|. ()     |    (   )   |      | |   ___   ___ ()| |");
        System.out.println("|||||     |     ) (    |      | |  |   | |   |  | |");
        System.out.println("|||||     | ===========|      | |  |   | |   |  | |");
        System.out.println("|||||     |   | |    | |      | |  |   | |   |  | |");
        System.out.println("|||||     |   | |    | |      | |  |   | |   |  | |");
        System.out.println("|||||    _|___|_|____|_|      | |  |   | |   |  | |");
        System.out.println("|||:|--\"\" |___|_|____|_|      | |  '---' '---'  | |");
        System.out.println("\"|  _|..--\"'   '      ' |______| |               | |_____________________");
        System.out.println("-'\"'                   |______|_|_______________|_|_________________________");
    }

    public void MusicRoomArt() {

        System.out.println("");
        System.out.println("                 ,;,                     |" + "____________________________________");
        System.out.println("               #(|)#                     |" + "|\\                                    \\");
        System.out.println("               #|||#                     |"+ "| \\                                    \\");
        System.out.println("                |||                      |" + "|  \\____________________________________\\");
        System.out.println("                |||        /             |" + "|  |       __---_ _---__                |");
        System.out.println("                |||     /#/              |" + "|  |      |======|=====|                |");
        System.out.println("               _|||_  / /                |" + "|  |      |======|=====|                |");
        System.out.println("             .' ||| '/ /                 |" + "|  |  ____|__---_|_---_|______________  |");
        System.out.println("            /   ||| / /                  |" + "|  | |                                | |");
        System.out.println("            |   |||/ /|                  |" + "|   \\ \\                                \\ \\");
        System.out.println("            |_  ||/ /_|                  |" + "|  \\ ||\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\| |    ");
        System.out.println("            ,_)=|/|/ (                   |" + "|  |\\  ,--------------------------------  |");
        System.out.println("            )   /|/   (                  |" + "|  ||| |                               || |");
        System.out.println("           /   /|/|     \\                |" + "\\ ||| |           -  -                || |");
        System.out.println("          |   / /||      |               |" + " \\'|| |-----------\\\\-\\\\---------------|| |");
        System.out.println("      |  / /~~~/         |               |" + "   \\|_|            \"  \"               \\|_|");
        System.out.println("           \\/ / \\ /   /                  |");
        System.out.println("           /`/.__Y__.-'                  |" );
        System.out.println("          /#/    |                       |"  );
        System.out.println("                 |                       |" );
        System.out.println("                 !                       |"  );

    }


    // MUSICAT METHOD

    public int Musicat() {
        System.out.println("There is a cat on top of the piano!");
        System.out.println("\nIt seems to be meowing musically. On closer inspection, you notice that there is music");
        System.out.println("on top of the piano. It has lyrics...");
        char read = IBIO.inputChar("Read the lyrics? (y/n) ");
        if (read == 'y')
        {
            System.out.println("________________________________");
            System.out.println("| \u266A" + " Humans! Petting! Me!" + "\u266A      |");
            System.out.println("| I love writing notes!        |");
            System.out.println("| Music! Make music for me!    |");
            System.out.println("|               - Musicat \u266A    |");
            System.out.println("|______________________________|");
            System.out.println("\nThe message didn't seem to be helpful, but it seems like you have to complete the lyrics.");
        }
        System.out.println("Twinkle, twinkle, little... ");
        System.out.println("1) Potato");
        System.out.println("2) Star");
        System.out.println("3) Twinkle");
        int song = IBIO.inputInt("Which is the missing word? ");
        int c = 1;
        if (song == 2) {
            System.out.println("\nThe cat delightedly meows the rest of the song!");
            System.out.println("She quickly stamps her paw on the back of the sheet music and gives it to you.");
            score = score(score);
            return score;
        }
        else
            System.out.println("\nThat's the wrong answer. The cat looks sad and runs away.");

        char next = IBIO.inputChar("Go to Hallway (h), or return to the entrance (e)? ");
        if (next == 'h')
            RightHallway();
        else
            Entrance();
        return 0;
    }


}


