
//          c,_.--.,y
//            7 a.a(
//           (   ,_Y)
//           :  '---;
//       ___.'\.  - (
//     .'"""S,._'--'_2..,_
//     |    ':::::=:::::  \
//     .     f== ;-,---.' T
//      Y.   r,-,_/_      |
//      |:\___.---' '---./
//      |'`             )
//       \             ,
//       ':;,.________.;L
//       /  '---------' |
//       |              \
//       L---'-,--.-'--,-'
//        T    /   \   Y
//        |   Y    ,   |
//        |   \    (   |
//       (   )     \,_L
//       7-./      )  `,
//      /  _(      '._  \
//    '---'           '--'
//
//WHAT ARE YOU DOING IN MY SWAMP?
import java.util.Random; //used to find a random number for fib
import java.util.concurrent.TimeUnit; //used to pause program
import java.util.Scanner; //used to scan for input

public class TextBasedGame {
    public static void main(String[] args) {
        System.out.println("Please ensure your console is at its biggest size, as ASCII art may not load properly in smaller console sizes.");
        sleep(5000);
        introSequence();

    }
    public static void introSequence(){
        Scanner nameScanner = new Scanner(System.in);
        Scanner yesNoScanner = new Scanner(System.in);
        slowprint("You painfully open your eyes.");
        slowprint("Looking around, you see four walls of concrete");
        slowprint("The dirty tray from your last meal sits on the table near the corner");
        slowprint("How did I get here?");
        slowprint("Who am I?, you think to yourself");
        String name = nameScanner.nextLine();
        clear();
        slowprint("Your memory is a bit fogged up now, but all you know is that you need to get out of here.");
        slowprint("...");
        slowprint("Well, " + name + " are you ready?");
        String yesNo = yesNoScanner.nextLine();
        boolean randomBool = true;
        while (randomBool){
            if (yesNo.equalsIgnoreCase("yes")){
                slowprint("Then its time for...");
                fastprint("\n" + //prison escape asci art
                        "     _____        _____    ____          ______          _____  _____   ______              ______            ______        _____          ____        _____        ______\n" +
                        " ___|\\    \\   ___|\\    \\  |    |     ___|\\     \\    ____|\\    \\|\\    \\ |\\     \\         ___|\\     \\       ___|\\     \\   ___|\\    \\    ____|\\   \\   ___|\\    \\   ___|\\     \\\n" +
                        "|    |\\    \\ |    |\\    \\ |    |    |    |\\     \\  /     /\\    \\\\\\    \\| \\     \\       |     \\     \\     |    |\\     \\ /    /\\    \\  /    /\\    \\ |    |\\    \\ |     \\     \\\n" +
                        "|    | |    ||    | |    ||    |    |    |/____/| /     /  \\    \\\\|    \\  \\     |      |     ,_____/|    |    |/____/||    |  |    ||    |  |    ||    | |    ||     ,_____/|\n" +
                        "|    |/____/||    |/____/ |    | ___|    \\|   | ||     |    |    ||     \\  |    |      |     \\--'\\_|/ ___|    \\|   | ||    |  |____||    |__|    ||    |/____/||     \\--'\\_|/\n" +
                        "|    ||    |||    |\\    \\ |    ||    \\    \\___|/ |     |    |    ||      \\ |    |      |     /___/|  |    \\    \\___|/ |    |   ____ |    .--.    ||    ||    |||     /___/|\n" +
                        "|    ||____|/|    | |    ||    ||    |\\     \\    |\\     \\  /    /||    |\\ \\|    |      |     \\____|\\ |    |\\     \\    |    |  |    ||    |  |    ||    ||____|/|     \\____|\\\n" +
                        "|____|       |____| |____||____||\\ ___\\|_____|   | \\_____\\/____/ ||____||\\_____/|      |____ '     /||\\ ___\\|_____|   |\\ ___\\/    /||____|  |____||____|       |____ '     /|\n" +
                        "|    |       |    | |    ||    || |    |     |    \\ |    ||    | /|    |/ \\|   ||      |    /_____/ || |    |     |   | |   /____/ ||    |  |    ||    |       |    /_____/ |\n" +
                        "|____|       |____| |____||____| \\|____|_____|     \\|____||____|/ |____|   |___|/      |____|     | / \\|____|_____|    \\|___|    | /|____|  |____||____|       |____|     | /\n" +
                        "  \\(           \\(     )/    \\(      \\(    )/          \\(    )/      \\(       )/          \\( |_____|/     \\(    )/        \\( |____|/   \\(      )/    \\(           \\( |_____|/\n" +
                        "   '            '     '      '       '    '            '    '        '       '            '    )/         '    '          '   )/       '      '      '            '    )/\n" +
                        "                                                                                               '                              '                                        '\n" +
                        "      ");
                //i used % here ;-;
                sleep(20000%15000);
            }
            else if (yesNo.equalsIgnoreCase("no")){ //i was being creative with this feature, if no one stumbles upon it i will be sad sad sad which is bad bad bad
                slowprint("Uh, okay");
                slowprint("Wasn't expecting that one");
                slowprint("...");
                slowprint("Let's try that again but you say yes this time!");
                clear();
            }
            else {
                slowprint("That's not an option, try again");
            }

        }

    }
    public static void sleep(int n){ //wait n milleseconds before executing next command
        try {
            TimeUnit.MILLISECONDS.sleep(n);
        }
        catch (Exception e) {

        }

    }
    public static void day1(){
        //prison cell ASCII art
        fastprint("\\                                                                                      /\n" +
                " \\                                                                                    /\n" +
                "  \\                                                                                  /\n" +
                "   \\                                                                                /\n" +
                "    \\                                                                              /\n" +
                "     \\                                                                            /\n" +
                "      \\                                                                          /\n" +
                "       \\________________________________________________________________________/\n" +
                "       |                                                                        |\n" +
                "       |                                                                        |\n" +
                "       |                                                                        |\n" +
                "       |                                                                        |\n" +
                "       |                                                                        |\n" +
                "       |                                                                        |    /|\n" +
                "       |                                                                        |   / |\n" +
                "       |                           ___________________                          |  /  |\n" +
                "       |                          |                   |                         |  | /|\n" +
                "       |                          |                   |                         |  |/ |\n" +
                "       |                          |       _____       |                         |  |--|\n" +
                "       |                          |      |  |  |      |                         |  |\\ |\n" +
                "       |                          I      |__|__|      |                         |  | \\|\n" +
                "       |                          |                   |                         |  \\  |\n" +
                "       |                          |                   |                         |   \\ |\n" +
                "       |                          |                   |                         |    \\|\n" +
                "       |                          |                   |                         |\n" +
                "       |                          |                  _|                         |\n" +
                "       |                          |                 |#|                         |\n" +
                "       |                          |                   |                         |\n" +
                "       |                          |                   |                         |\n" +
                "       |                          |                   |                         |\n" +
                "       |                          |                   |                         |\n" +
                "       |                          |                   |            _____________|:\n" +
                "       |__________                I                   |           |\\             \\:\n" +
                "      /          /|               |                   |           \\ \\_____________\\:\n" +
                "     /          / /               |                   |            \\ \\             \\:\n" +
                "    /__________/ /                |                   |             \\ \\             \\:\n" +
                "    |___________|_________________|___________________|______________\\ \\             \\:\n" +
                "      /     | ||                                                      \\ \\             \\:\n" +
                "     /      |_|/                                                       \\ \\             \\:\n" +
                "    /                                                                   \\ \\             \\:\n" +
                "   /                                                                     \\ \\_____________\\:\n" +
                "  /                                                                       \\|_____________|\n" +
                "\n");
        sleep(5000);
        clear();
        slowprint("You stand up and look around the room");
        slowprint("As you approach the window, you notice one of the bars is loose. A day of chipping at it could break it off.");
        slowprint("But then you look at the door, the hinge is rusted and could be easily broken off. Maybe I can get out that way, you think to yourself.");
        boolean randomBool = true;
        Scanner windowDoorScanner = new Scanner(System.in);
        while (randomBool){
            slowprint("Which way do you want to go?");
            String windowOrDoor = windowDoorScanner.nextLine();
            if (windowOrDoor.equalsIgnoreCase("window")){
                clear();
                window();
            }
            else if (windowOrDoor.equalsIgnoreCase("door")){
                clear();
                door();
            }
            else{
                slowprint("That is not an option, try again.");
            }
        }
    }
    static boolean calledWindow;
    public static void window(){
        calledWindow = true;
        Scanner strikeOrNo = new Scanner(System.in);
        Scanner lieOrNo = new Scanner(System.in);
        slowprint("You take the spoon from the tray and approach the window.");
        slowprint("As you raise your arm to strike the window, you hear footsteps from down the hallway.");
        slowprint("Do you strike?");
        boolean randomBool = true;
        while (randomBool){
            String yesNo = strikeOrNo.nextLine();
            if (yesNo.equalsIgnoreCase("yes")){
                slowprint("The clink of metal resonates around the cell.");
                slowprint("Unfortunately for you, the footsteps you heard earlier were from the guard on duty.");
                slowprint("Hey, what are you doing?, the guard calls as he pokes his head around the corner");
                slowprint("Do you tell the truth?");
                while (randomBool){
                    String lieNo = lieOrNo.nextLine();
                    if (lieNo.equalsIgnoreCase("yes")){
                        slowprint("I-I-I was testing how strong this bar is, you stammer");
                        slowprint("The guard is taken aback by your honesty.");
                        slowprint("You're coming with me, the guard replies.");
                        clear();
                        isolation();

                    }
                    else if (lieNo.equalsIgnoreCase("no")){
                        slowprint("I-I was playing a song by tapping the bars, you stammer");
                        Random rand = new Random();
                        int fibTo = rand.nextInt(5, 8);
                        slowprint("You remember what Mr. Mangum taught you last year, and use the fibonacci sequence to create a glorious melody, pleasing to the ears. ");
                        fib(fibTo * 2);
                        slowprint("You continue your mathematical symphony, gracing the ears of all who are lucky enough to listen to you. ");
                        slowprint("You even ");
                        slowprint("The guard however, is not Andre and does not appreciate the beauty of mathematics and only hears you tapping on the bars randomly.");
                        slowprint("You're coming with me, the guard says");
                        clear();
                        isolation();
                    }
                    else{
                        slowprint("That is not an option, try again.");
                    }
                }
            }
            else if (yesNo.equalsIgnoreCase("no")){
                slowprint("You lower your hand as the footsteps near. Luckily, they belonged to a guard on duty.");
                slowprint("As he peers into the cell, you hide your spoon behind your back, awkwardly waving at him.");
                slowprint("Strangely, the guard waves back.");
                slowprint("You choose to wait for lights out to start working.");
                slowprint("As the light turns out, you begin to work. You work undisturbed through the night.");
                clear();
                day2Window();
            }
            else{
                slowprint("That is not an option, try again.");
            }
        }
    }
    static boolean calledDoor;
    public static void door(){
        calledDoor = true;
        slowprint("You step towards the door.");
        slowprint("The door itself is solid and sturdy, unlike your previous assessment.");
        slowprint("Then, you look at the lock.");
        slowprint("That looks easy enough pick, you think to yourself.");
        slowprint("You take the fork from the tray and approach the door.");
        slowprint("You easily bend the ancient prongs of the fork to form a rudimentary pick. As you kneel down to the lock to get a closer look, you hear footsteps from down the hallway.");
        boolean randomBool = true;
        while (randomBool){
            Scanner pickOrNo = new Scanner (System.in);
            slowprint("Do you insert the pick?");
            String yesNo = pickOrNo.nextLine();
            if (yesNo.equalsIgnoreCase("yes")){
                slowprint("You insert your pick into the lock. Unfortunately, the footsteps coming down the hall belong to a guard.");
                slowprint("You try to hide the pick behind your back, but you are too slow.");
                slowprint("The guard disappointingly peers down at your crouched figure.");
                slowprint("You're coming with me, the guard says.");
                clear();
                isolation();
            }
            else if (yesNo.equalsIgnoreCase("no")){
                slowprint("You hide the pick behind your back and pretend to look bored. Luckily for you, the footsteps coming down the hall came from a guard.");
                slowprint("He glances into your cell and keeps walking.");
                slowprint("You choose to wait until lights out to begin your work.");
                slowprint("As the lights go out, you begin to pick the lock. Going by only sound, it takes you what seems like an eternity, but eventually the lock clinks and opens.");
                slowprint("Even with all those lights outside, I don't think I'll find my way out, you think to yourself. As a result, you take a nap to get some rest.");
                clear();
                day2Door();
            }
            else {
                slowprint("That is not a valid option. Please try again.");
            }
        }
    }
    public static void isolation(){
        slowprint("The guard opens the cell door.");
        slowprint("I'll be taking you to solitary confinement, the guard says.");
        slowprint("The guard stops for a second to take his handcuffs off his belt. Your primal instincts give way, and all you can think about is escaping.");
        Scanner strikeNo = new Scanner(System.in);
        String yesNo = strikeNo.nextLine();
        boolean randomBool = true;
        while (randomBool){
            if (yesNo.equalsIgnoreCase("yes")){
                if (calledWindow){
                    slowprint("You clench the handle of your spoon tightly and raise your arm.");
                    slowprint("The guard notices you as the spoon comes down onto his face. He blocks it with his arm, sending it onto the floor.");
                    slowprint("In a rage, he pushes you off him and you fall to the floor, winded. He then proceeds to shoot you.");
                    slowprint("You feel no pain as the bullet shears through your skull, ending your futile attempt to escape.");
                    clear();
                    lose();
                }
                else if (calledDoor){
                    slowprint("You clench the handle of your fork tightly and raise your arm.");
                    slowprint("You bring your arm forward and throw the fork like a javelin. It arcs towards the guard's face, but he blocks it with his arm. The prongs slice through his shirt and into his flesh.");
                    slowprint("The guard clutches his bleeding arm, and you seize the opportunity to knock him down. You take his gun and run as fast as you can.");
                    clear();
                    hallway();

                }


            }
            else if (yesNo.equalsIgnoreCase("no")){
                slowprint("You hold back your feelings and let the guard handcuff you.");
                slowprint("He walks you through prison to solitary confinement.");
                if (calledDoor){
                    slowprint("The guard takes your fork from you.");
                }
                if(calledWindow){
                    slowprint("The guard takes your spoon from you.");
                }
                slowprint("The clang of the solid metal door echoes through the cold cell. You begin to shiver as the draught sets in.");
                slowprint("...");
                slowprint("As time passes");
                slowprint("you are slowly");
                slowprint("driven to");
                slowprint("insanity");
                slowprint("...");
                slowprint("To hold onto any semblance of your sanity, you start reading the fibonacci sequence... ");
                Random rand = new Random();
                int fibTo = rand.nextInt(5, 10);
                fib(fibTo/2);
                slowprint("Unfortunately you forget the sequence too.");
                slowprint("You scream in anguish, but it's no use. Nobody can hear your cries. You will be trapped...");
                sleep(2000);
                clear();
                lose();
            }
            else{
                slowprint("That is not a valid option. Please try again. ");
            }
        }



    }
    public static void day2Window(){
        slowprint("As beams of sunlight streak between the bars, you put the spoon away.");
        slowprint("You gather all the sheets in the room and form them into a makeshift rope.");
        slowprint("You reach up to the bar and pull it from the window easily.");
        slowprint("As you begin to lower the rope, you hear footsteps from down the hall. \"Another guard on patrol!\", you think to yourself.");
        slowprint("You have to make a decision quickly.");
        slowprint("Do you jump?");
        slowprint("Or do you wait?");
        Scanner scanner = new Scanner(System.in);
        String jumpOrWait = scanner.nextLine();
        if (jumpOrWait.equalsIgnoreCase("jump")){
            slowprint("You quickly tie the rope to one of the remaining bars. Then, you thrust yourself through the gap and begin to absail down the wall.");
            slowprint("After a few seconds, your hands begin to burn because of friction from the rope.");
            slowprint("Do you keep going?");
            slowprint("Or do you take a rest?");
            Scanner goingorrest = new Scanner(System.in);
            String goOrRest = goingorrest.nextLine();
            if (goOrRest.equalsIgnoreCase("keep going")){
                slowprint("Despite the burning sensation on your skin, you reach the ground.");
                slowprint("Luckily for you, the guard in the watch tower is pretty time.y. You make a break for the fence.");
                slowprint("The barbed wire on top of the fence'd be impossible to get over, even with a sheet,\" you think to yourself.");
                slowprint("But the fence itself doesn't look too strong.");
                slowprint("So you pull the tool from your pocket and use it to make a hole in the fence. You squirm through it and into freedom.");
                clear();
                win();
            }
            else if (goOrRest.equalsIgnoreCase("rest")){
                slowprint("You stop on a narrow ledge to rest your burnt hands.");
                slowprint("Unfortunately for you, the guard on duty peeks out from the window above you.");
                slowprint("He pulls out his pistol, and before you can react, he shoots you in the head. Your limp body drops to the floor below.");
                clear();
                lose();
            }
        }
        else if (jumpOrWait.equalsIgnoreCase("wait")){
            slowprint("You hide the missing bar under the bed, but before you can hide the rope the guard looks into your cell.");
            slowprint("Hey, what are you doing in there?\", the guard calls from outside.");
            slowprint("Before you can answer, he notices the rope on the bed.");
            slowprint("As the guard begins to unlock the door, you realise that it's too late. You grab the rope and bolt for the window.");
            slowprint("You fling yourself through the gap and pray that the rope caught onto the bars in the window.");
            slowprint("But it never did.");
            slowprint("Upon hitting the ground, you die instantly. A puddle of blood begins to form as the guard peeks out the window. He promptly vomits.");
            clear();
            lose();
        }
    }

    public static void day2Door(){
        slowprint("You wake up before dawn and look at the window.");
        slowprint("Quietly, you open the door and sneak down the hallway.");
        slowprint("As you leave the building and enter the main confine, you spot the guard on duty.");
        slowprint("Luckily for you, he hasn't noticed you yet.");
        slowprint("Do you run for the fence?");
        slowprint("Or do you lurk in the shadows?");
        Scanner runLurk = new Scanner(System.in);
        String runOrLurk = runLurk.nextLine();
        if (runOrLurk.equalsIgnoreCase("run")){
            slowprint("You make a dash for the fence. Surprisingly, you make it without getting spotted.");
            slowprint("The barbed wire on top of the fence'd be impossible to get over, even with a sheet,\" you think to yourself.");
            slowprint("But the fence itself doesn't look too strong.");
            slowprint("So you pull the tool from your pocket and use it to make a hole in the fence. You squirm through it and into freedom.");
            clear();
            win();
        }
        else if (runOrLurk.equalsIgnoreCase("lurk")){
            slowprint("Slowly, you sneak through shadows and between buildings.");
            slowprint("You find yourself at the end of your cover. So you make a run for the fence.");
            slowprint("Unfortunately for you, the guard on duty spots you. Behind you, you hear the violent trill of the alarm.");
            slowprint("You make it to the fence. But before you can do anything, a guard approaches you with his pistol drawn.");
            slowprint("You see a blinding flash, and then nothing. The bullet pierced your skull, killing you instantly.");
            clear();
            lose();
        }
    }
    public static void hallway(){
        slowprint("You sprint for the door at the end of the hallway.");
        slowprint("At the end of the hallway is another door. You shoot the lock and it swings open.");
        slowprint("As you exit the building and enter the main prison confine, alarm bells go off. In a panic, you pull out your gun.");
        slowprint("A sniper shoots you in the head, killing you instantly.");
        clear();
        lose();

    }
    public static void win(){
        slowprint("You Win!");
        sleep(5000);
        System.exit(0);

    }
    public static void lose(){
        slowprint("You lose :C");
        sleep(5000);
        System.exit(0);

    }
    //method to clear the console
    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    //method to fastprint, used for printing large amounts of ASCII art
    public static void fastprint(String output) {
        for (int i = 0; i<output.length(); i = i + 1) { //i used + operator
            char c = output.charAt(i);
            System.out.print(c);
            sleep(5);
        }
    }
    //method to slowprint, used for most normal dialogue
    public static void slowprint(String output) {
        for (int i = 0; i<output.length(); i = i -(-1)) { //i used - operator
            char c = output.charAt(i);
            System.out.print(c);
            sleep(30);
        }
        System.out.println("");
        System.out.println("");
        //i want an empty line between each line of text hence this

    }
    public static void fib(int n) //prints out a string of every fib number up to n (inclusive)
    {
        int f[] = new int[n + 1];
        int i;
        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
            for (i = 2; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        System.out.print(f.toString());
    }


}
