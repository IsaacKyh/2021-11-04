package kyh.textadventure;

import java.util.Scanner;

public class TextAdventureGame {

    public static class runGame {
        // starting value of everything
            static String dir = "";
            static int dagger;
            static int player;
            static int chest;
            static int monster;
            static int key;
            static int part;
            static int wall;
            static int keysFound = 0;
            static int DaggersFound = 0;
            static int chestsOpened = 0;
            static int chestsLeft = 3;
            static Scanner scan = new Scanner(System.in);

// this is the map the player will play in and the starting room is 0
            static int[][] map = new int[][]{
                    {1,1,1,1,1,1,1,1,1,1},
                    {1,4,6,2,2,4,2,2,5,1},
                    {1,0,3,2,2,2,2,2,2,1},
                    {1,2,5,4,2,2,2,5,6,1},
                    {1,2,3,3,4,5,5,3,2,1},
                    {1,2,2,2,2,3,2,2,2,1},
                    {1,3,2,5,2,2,3,2,2,1},
                    {1,4,4,2,6,2,2,2,2,1},
                    {1,1,1,1,1,1,1,1,1,1}};

            // where the player starts and how much life the player starts with
            static int x = map[1][3];
            static int y = map[0][0];
            static int playerPos = map[x][y];
            static int life = 3;

            static boolean isInGame = true;
// The greeting to the game and how you play it
            public static void enterGame() {
            System.out.println("Welcome the the game");
            System.out.println("Type, up, down, left, or right, to move around the map.");
            // the loop that checks that the game is playing
            while (isInGame) {
                move();
            }

        }
        // the movements (up. down, left and right)
            public static void move() {
//                System.out.println(dagger);
//                System.out.println(key);
                dir = scan.nextLine();
                switch (dir) {
                    case "up" -> {
                        x = x - 1;
                        playerPos = map[x][y];
                        map();
                        if(x < 1 ){
                            x = 1;
                        }
//                        System.out.println(x + "detta är x");
//                        System.out.println(y+"detta är y");
                    }
                    case "down" -> {
                        x = x + 1;
                        playerPos = map[x][y];
                        map();

                        if(x >= 8 ){
                            x--;
                        }
//                        System.out.println(x + "detta är x");
//                        System.out.println(y+"detta är y");
                    }
                    case "left" -> {
                        y = y - 1;
                        playerPos = map[x][y];
                        map();
                        if(y < 1 ){
                            y = 1;
                        }
//                        System.out.println(x + "detta är x");
//                        System.out.println(y+"detta är y");
                    }
                    case "right" -> {
                        y = y + 1;
                        playerPos = map[x][y];
                        map();
//                        if(y < map[y].length){
//                            y = 1;
//                        }
                        if(y >= 9 ){
                            y--;
                        }
//                        System.out.println(x + "detta är x");
//                        System.out.println(y+"detta är y");
                    }
                    case "quit" -> {
                        System.out.println("Ty for playing");
                        System.exit(1);

                    }
                }
        }

// this is what every number/room on the map means
            public static void map() {
            wall = 1;
            part = 2;
            monster = 3;
            chest = 4;
            key = 5;
            player = 0;
            dagger = 6;

// this is what happens then the player gets a specific room
            System.out.println(playerPos);
            if (playerPos == wall) {
                System.out.println("That's a wall. Can't move there.");
            }
            if (playerPos == part) {
                System.out.println("You move to a free part of the map");
            }
            if (playerPos == monster) {
                monsterEncounter();
            }
            if (playerPos == chest) {
                openChest();
            }
            if (playerPos == key) {
                findKey();
            }
            if (playerPos == player) {
                System.out.println("Starting Room");
                }
            if (playerPos == dagger) {
                findDagger();
            }

        }
        public static void findDagger() {
            System.out.println("Nice You picked up a dagger mby we can fight some monsters with this");
            DaggersFound += 1;
            map[x][y] = 2;
        }

            public static void monsterEncounter() {
                if (DaggersFound >= 1){
                    System.out.println("Wow! A MONSTER! you use your dagger and kills the monster");
                    System.out.println(">You get one more life but lose your dagger");

                    map[x][y] = 2;
                    life = life + 1;
                    DaggersFound -= 1;
                    System.out.println("now you have: " + life);
               }
            else if (dagger == 6 && life > 0) {
                System.out.println("Wow! A MONSTER! HE BEATS YOUR ASS.. -1 LIFES");
                life = life - 1;
                System.out.println("You have: " + life + " lives left! Don't die..");
            }
            else if (life < 0) {
                System.out.println("You have:NO LIFE , You encountered too many monsters. GAME OVER.");
                System.exit(1);
            }
        }
            public static void findKey() {
            System.out.println("Wow a key!");
            keysFound += 1;
            map[x][y] = 2;
        }

            public static void openChest() {
            System.out.println("Wow a chest!");
            if (keysFound >= 1) {
                chestsOpened += 1;
                int totalChestsFound = chestsLeft - chestsOpened;
                chestsLeft -= 1;
                System.out.println("You have opened a chest! You have " + totalChestsFound + " chests to go!");
                map[x][y] = 2;
                keysFound -= 1;
            }
            if (chestsLeft == 0) {
                System.out.println("YOU WIN!!!");
                System.exit(1);
            } else {
                System.out.println("No keys, no chests. Keep searching.");
            }
        }
    }
}

