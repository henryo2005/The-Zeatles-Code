// Tile integer codes:
// 1 - space
// 2 - wall
// 3 - sitar tile
// 4 - drum sticks tile
// 5 - wings tile
// 6 - heal tile
// 7 - object
// 8 - single-door key
// 9 - blue key
// 10 - yellow key
// 11 - red key
// 12 - green key
// 13 - locked door (single-use)
// 14 - locked door (blue)
// 15 - locked door (yellow)
// 16 - locked door (red)
// 17 - locked door (green)
// 18 - zohn
// 19 - zaul
// 20 - zeorge
// 21 - zingo
// 22 - glasses item
// 23 - wings item
// 24 - sitar item
// 25 - drumsticks item
// 26 - attack type 2 attacked tile
// 101 - monster #1
// 102 - zeorge
// 103 - monster #2
// 104 - zingo
// 105 - zaul
// 201 - monster #1 attack
// 202 - zeorge attack
// 203 - monster #3 attack
// 204 - zingo attack
// 205 - zaul attack

// Environment integer codes:
// 1 - Outer Space
// 2 - Plains

// Player Facing integer codes:
// 1 - down
// 2 - right
// 3 - up
// 4 - left

// Icon integer codes
// 1 - sword
// 2 - chest

// Key integer codes
// 1 - single-door
// 2 - blue key
// 3 - yellow key
// 4 - red key
// 5 - green key

// Attack type integer codes
// 1 -normal (3x3)
// 2 - zeorge (all in horizontal)

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.*;

public class FinalGameCode
{
    // Create fonts
    public static Font gameOverFont=new Font("SansSerif",Font.PLAIN,100);
    public static Font textBoxFont=new Font("Monospaced",Font.PLAIN,40);
    public static Font defaultFont=new Font("SansSerif",Font.PLAIN,16);

    // Create text boxes "public static TextBox name=new TextBox("");"
    public static TextBox testTextBox=new TextBox("Hello. My name is Henry Cooper and I love to write text boxes. Namely, I like writing them to test if the text box class and method that I wrote work. I sure love text boxes a grand amount and would love if this attempt works as it is the first. Hopefully, by this point, this text is long enough to properly test my coding.");
    public static TextBox testBox2=new TextBox("Long ago, this book was written.");
    
    public static TextBox box1=new TextBox("Zaul: Hello, we are The Zeatles. We all live in a yellow submarine, but we have been locked out. Zohn: I hear you are a fan of our work. We need your help to get back in to the submarine. Zingo: We each have a special object that help to unlock the submarine. However, we all lost them. Zeorge: Can you find our things? Zaul said his bass was somewhere around here. Use the spacebar to interact with things and WASD to move.");
    public static TextBox noSitar=new TextBox("This is way too heavy to move with your bare hands.");
    public static TextBox yesSitar=new TextBox("Maybe Zeorge's sitar could blast this out of the way.");
    public static TextBox noSticks=new TextBox("This could be easily destroyed.");
    public static TextBox yesSticks=new TextBox("Perhaps Zingo's drumsticks could crack this into a million pieces.");
    public static TextBox noWings=new TextBox("You can't make it over this.");
    public static TextBox yesWings=new TextBox("Zaul's wings could probably get you over this obstacle.");
    public static TextBox pickUpGlasses=new TextBox("You got Zohn's glasses. You can now see how much health enemies have remaining!");
    public static TextBox pickUpWings=new TextBox("You got Zaul's wings! Use these with ] to fly over dangerous barriers.");
    public static TextBox pickUpSitar=new TextBox("You got Zeorge's Sitar. When played well, its sounds reverberate strongly. Hold down P and use WASD to move heavy objects.");
    public static TextBox pickUpSticks=new TextBox("You got Zingo's drumsticks. Use them correctly and you can bash all kinds of things. Press [ to break flimsy objects.");

    // Create story sequences
    public static ArrayList<StorySequence> sequenceList=new ArrayList<StorySequence>();

    public static StorySequence testSequence= new StorySequence(5,testTextBox,new int[][] {new int[] {8,4},new int[] {7,4},new int[] {6,4}},new int[][] {new int[] {8,1},new int[] {8,2}},new int[][] {new int[] {8,3},new int[] {8,4},new int[] {8,3}},new int[][] {new int[] {6,2}});
    
    public static StorySequence sequence1=new StorySequence(6,new TextBox("ZOHN: Hello, small one. Are you up for a challenge? Actually, don't answer that. Oh yeah, use the spacebar to progress my speech. You look like you appreciate good music. I see those headphones. I need your help. I'll explain more in a bit. Go north and then west. I'll meet you there. Remember, use space to interact and WASD to move."),new int[][] {new int[] {1,4},new int[] {2,4},new int[] {3,4},new int[] {4,4},new int[] {4,3}},null,null,null);
    public static StorySequence sequence2=new StorySequence(8,new TextBox("ZOHN: Oh, you made it. I have a little bit of a problem. ... Why should you help me? Don't you know who you are talking to?! You must not be from around here. I AM ZOHN LENNON! I am the purest, wisest, smartest, and humblest of Zaul's children. I am in charge of the land of submarines. I need your help. Some of my citizens have gone a little.. crazy. They are causing turmoil and attacking anyone who comes near them. You have my permission to eliminate them. Don't- don't question the morality. Just tell them I said so. Oh, and a word of advice, don't get close to them without a weapon. There should be one somewhere around here."),new int[][] {new int[] {1,2},new int[] {2,2},new int[] {3,2},new int[] {4,2},new int[] {5,2},new int[] {6,2},new int[] {6,3},new int[] {6,4}},null,null,null);
    public static StorySequence sequence3=new StorySequence(13,new TextBox("ZOHN: Hello, young one. Did you find a weapon? I also noticed a heal station a bit back, if you need that. How's it-  ZEORGE: ZOHN!!! I finally escaped that wretched submarine. You're dead. I will unleash my full-  ZOHN: No! Small one, I will weaken him, but he is stronger than me. It's up to you to defeat him. He will wreak havoc in the land of submarines if we let him roam free. GRUNT. GRAH. OUCH. YARGH. RAH. YAH. GROOF. ROOF ... HURNK. Ok, that's all I got. Good luck."),new int[][] {new int[] {5,3},new int[] {6,3},new int[] {7,3},new int[] {8,3},new int[] {8,3},new int[] {8,3}},null,new int[][] {new int[] {1,4},new int[] {1,4},new int[] {1,4},new int[] {1,4},new int[] {1,3},new int[] {2,3}},null);
    public static StorySequence sequence4=new StorySequence(15,new TextBox("ZOHN: You did it! Wow, it's crazy what can be done with a little help from your friend, the great Zohn Lennon! Uh- you can defeat your enemies, I mean. I'm afraid that if Zeorge was able to escape.. Zingo and even Zaul are probably soon to follow. Make sure to look out for them. Say, maybe they are responsible for the crazy citizens. Anyway, I'll catch you later."),new int[][] {new int[] {5,0},new int[] {5,1},new int[] {6,1},new int[] {7,1},new int[] {8,1}},null,null,null);
    public static StorySequence sequence5=new StorySequence(18,new TextBox("ZINGO: HA HA AAH HA HA HA! FREEEEEEEE-DOMMMMM.  ZAUL: Quiet. We need to blend in. The acid hasn't yet reached everyone. Zeorge won't pick up, either.  ZINGO: IS HE IN TROUBLE???  ZAUL: I don't know, Zingo.  ZINGO: I HOPE HE IS OKAY!  ZAUL: Yeah, me too. Anyway, let's keep moving. If Zohn finds out we broke the seal, he will try to stop us."),null,new int[][] {new int[] {5,3},new int[] {4,3},new int[] {3,3},new int[] {2,3},new int[] {1,3},new int[] {0,3}},null,new int[][] {new int[] {6,3},new int[] {5,3},new int[] {4,3},new int[] {3,3},new int[] {2,3},new int[] {1,3}});
    public static StorySequence sequence6=new StorySequence(21,new TextBox("ZOHN: How did you all escape that submarine? The seal held up for so long..  ZINGO: WE ESCAPED THAT SUBMARINE! THE SEAL DID NOT HOLD UP!  ZOHN: You are.. intolerable. Oh, small one! Hello. I just happened upon this wretched guy. I've weakened him a fair amount, but no one can weaken his incessant shouting.  ZINGO: DON'T CALL ME INSESCANT!! AHHHHH!!!  ZOHN: Ahhh! Good lu-"),new int[][] {new int[] {5,3},new int[] {4,3},new int[] {5,3},new int[] {4,3},new int[] {5,3},new int[] {6,3}},null,null,new int[][] {new int[] {4,3},new int[] {3,3},new int[] {4,3},new int[] {3,3},new int[] {4,3},new int[] {5,3}});
    public static StorySequence sequence7=new StorySequence(23,new TextBox("ZOHN: Zaul, you must let me out.  ZAUL: When will you understand, Zohn? You seriously hurt Zeorge and Zingo. That's not acceptable. You should have just joined us.  ZOHN: And terrorize everyone? I don't think so.  ZAUL: This is your last chance. Don't make me hurt you.  ZOHN: Zaul, it doesn't have to be this way-"),new int[][] {new int[] {5,3},new int[] {5,2},new int[] {6,2},new int[] {7,2},new int[] {7,3},new int[] {6,3},new int[] {5,3}},new int[][] {new int[] {2,1},new int[] {2,2},new int[] {2,3},new int[] {2,3},new int[] {4,3}},null,null);

    // Create reader tiles "public static ReaderTile reader5=new ReaderTile(1003,new TextBox(""));"
    public static ArrayList<ReaderTile> readerTileList=new ArrayList<ReaderTile>();

    public static ReaderTile testReader=new ReaderTile(1001,testBox2);

    public static ReaderTile reader1=new ReaderTile(1002,new TextBox("Long ago, in the land of submarines, Zaul McCartney was born. He wanted a band, so he bred with the local hipsters and created thousands of children."));
    public static ReaderTile reader2=new ReaderTile(1003,new TextBox("These children had great powers and were naturally dangerous to both each other and the locals of the land of submarines."));
    public static ReaderTile reader3=new ReaderTile(1004,new TextBox("Zaul paid little attention to his children and didn't know all of them. He acted like a celebrity, though no one else thought of him that way."));
    public static ReaderTile reader4=new ReaderTile(1005,new TextBox("Eventually, 2 of Zaul's children emerged as the strongest, so, alongside them, Zaul created the band. Zaul, Zingo, and Zeorge harnessed their powers with specially crafted tools."));
    public static ReaderTile reader5=new ReaderTile(1006,new TextBox("Over the next years, the three grew in power and corruption, terrorizing the land with their weaponized instruments. The band took out thousands. They even killed many of Zaul's other children."));
    public static ReaderTile reader6=new ReaderTile(1007,new TextBox("Eventually, a wise son of Zaul joined up with many of his brothers and sisters to reclaim power and order in the land of submarines. You may say he was a dreamer, but he was not the only one. With the help of hundreds of his siblings, he banished the band into the yellow submarine."));
    public static ReaderTile reader7=new ReaderTile(1008,new TextBox("Zohn Lennon, the wise son, placed a special lock on the submarine that could only be broken by the band members' weapons and Zohn's special glasses."));
    public static ReaderTile reader8=new ReaderTile(1009,new TextBox("The people praised Zohn for his leadership ability and strategy. They made him a leader, and for a while, the land of submarines was at peace."));

    public static ReaderTile reader9=new ReaderTile(1010,new TextBox("Tip: The laws of space are sometimes funky in the land of submarines."));
    public static ReaderTile reader10=new ReaderTile(1011,new TextBox("Tip: With a weapon in hand, attack a monster in front of you using the apostrophe key (')."));
    public static ReaderTile reader11=new ReaderTile(1012,new TextBox("Tip: Every time you defeat an enemy, your max health has a chance of increasing."));
    public static ReaderTile reader12=new ReaderTile(1013,new TextBox("Tip: Press E to open the menu. There, you can switch equipped items and view your key counts. However, you may only access the menu if no enemies are in the room"));
    public static ReaderTile reader14=new ReaderTile(1015,new TextBox("Defeat your enemies to reveal the way."));
    public static ReaderTile reader15=new ReaderTile(1016,new TextBox("Tip: Bronze-colored keys open single doors elsewhere."));
    public static ReaderTile reader16=new ReaderTile(1017,new TextBox("Tip: Use your mouse in the menu to switch between weapons. The Swinger Sword hits all enemies around you for less damage than the Frontside would."));
    public static ReaderTile reader17=new ReaderTile(1018,new TextBox("DANGER!!! Do not come close to the yellow submarine! Definitely don't enter it! Whatever you do! -Z"));
    public static ReaderTile reader18=new ReaderTile(1019,new TextBox("Strong Frontside Sword"));
    public static ReaderTile reader19=new ReaderTile(1020,new TextBox("Strong Swinger Sword"));
    public static ReaderTile reader20=new ReaderTile(1021,new TextBox("Left: Revival Chamber. Right: Exit. Wrong: Stay."));

    // Create thread list
    public static ArrayList<Thread> threadList=new ArrayList<Thread>();

    // Create monster types
    public static ArrayList<Monster> monsterList=new ArrayList<Monster>();

    public static Monster testMonster=new Monster(2,5,1,1); // code: 101
    public static Monster zeorgeMonster=new Monster(3,50,2,2); // code 102
    public static Monster monster2=new Monster(1,5,4,1); // code 103
    public static Monster zingoMonster=new Monster(3,50,3,2); // code 104
    public static Monster zaulMonster=new Monster(5,50,4,2); // code 105
    public static Monster monster3=new Monster(4,10,2,1); // code 106

    // Create all items "public static Item name=new Item(spawn room code,spawn x,spawn y,icon code,name,attack power);"
    public static ArrayList<Item> itemList=new ArrayList<Item>();
    public static ArrayList<Item> myItems=new ArrayList<Item>();

    public static Item bone=new Item(32,1,1,1,"Strong Frontside Sword",6);
    public static Item leaf=new Item(32,1,4,2,"Strong Swinger Sword",2);

    public static Item stick=new Item(10,4,3,1,"Frontside Sword",3);
    public static Item woodenSword=new Item(24,4,2,2,"Swinger Sword",1);

    // Create all keys "public static Key name=new Key(type,spawn room code, spawn x, spawn y);" "public static Key name=new Key(type, spawn room code, spawn x, spawn y, door room code, door x, door y);"
    public static ArrayList<Key> keyList=new ArrayList<Key>();
    public static ArrayList<Key> myKeys=new ArrayList<Key>();
    public static ArrayList<Key> specialKeys=new ArrayList<Key>();

    public static Key testKey=new Key(1,2,4,1,1,7,0);
    public static Key testKey1=new Key(1,5,1,4,1,9,4);
    public static Key testKey2=new Key(2,1,2,4);
    public static Key testKey3=new Key(3,1,3,4);
    public static Key testKey4=new Key(4,1,4,4);
    public static Key testKey5=new Key(5,1,5,4);
    public static Key testKey6=new Key(2,1,6,4);

    public static Key key1=new Key(2,6,8,1);
    public static Key key2=new Key(3,14,1,4);
    public static Key key3=new Key(2,15,1,4);
    public static Key key4=new Key(3,17,8,4);
    public static Key key5=new Key(2,11,8,4);
    public static Key key6=new Key(3,22,2,2);
    public static Key key7=new Key(1,28,5,2,25,2,5);
    public static Key key8=new Key(1,31,4,3,24,9,2);
    public static Key key9=new Key(4,31,7,2);
    public static Key key10=new Key(4,30,8,1);
    public static Key key11=new Key(4,30,8,1);

    

    // Create all rooms "public static Room room7=new Room(code,north,east,south,west,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},environment);"
    public static ArrayList<Room> roomList=new ArrayList<Room>();

    public static Room testRoom=new Room(1,5,4,3,2,new int[][] {{2,2,1,2,2,2},{2,1,1,1,1,1},{2,1,1,1,9,2},{2,1,1,1,10,2},{2,1,1,101,11,2},{2,1,1,1,12,2},{2,1,1,1,9,2},{13,1,1,1,7,2},{2,1,1,1,1,2},{2,2,2,2,13,2}},1);
    public static Room testRoomWest=new Room(2,0,1,0,0,new int[][] {{2,2,2,2,2,2},{2,7,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,7,2},{2,8,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,1,2,2,2}},1);
    public static Room testRoomSouth=new Room(3,1,0,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,14,15,16,17,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,13},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room testRoomEast=new Room(4,0,0,0,1,new int[][] {{2,2,2,2,1,2},{2,1,1,7,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1001,1,2},{2,1,1,101,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room testRoomNorth=new Room(5,0,0,1,0,new int[][] {{2,2,2,2,2,2},{1,1,1,1,8,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);

    public static Room room6=new Room(6,7,23,24,14,new int[][] {{2,2,2,3,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,1},{4,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,1},{2,9,1,1,1,2},{2,2,1,2,2,2}},1);
    public static Room room7=new Room(7,32,0,6,8,new int[][] {{2,2,2,2,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{1,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1002,2},{2,2,2,2,2,2},{1,3,4,1,5,1},{2,1,2,2,2,1018},{2,2,2,2,2,2}},1);
    public static Room room8=new Room(8,0,7,10,9,new int[][] {{2,2,1,2,2,2},{2,1,1,1,1003,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{1,101,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,1,2}},1);
    public static Room room9=new Room(9,0,8,0,11,new int[][] {{2,1,2,2,2,2},{2,1,1,1,1013,2},{2,1,1,1,1,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,101,2},{2,2,1,2,2,2}},1);
    public static Room room10=new Room(10,8,0,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,7,1,2},{2,1,1,1011,1,1},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1004,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room11=new Room(11,12,9,0,13,new int[][] {{2,2,2,1,2,2},{2,1,1,1,101,2},{2,1,2,2,1,2},{2,1,1,1,1,2},{2,2,1,1012,2,2},{2,2,1,1,1,1},{2,1,101,2,2,2},{2,1,2,1,1,1},{2,1,2,1,9,2},{2,1,2,2,2,2}},1);
    public static Room room12=new Room(12,0,0,11,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1005,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,6,1,2},{1,1,1,1,1,2},{2,1,1,1,1,2},{4,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room13=new Room(13,0,11,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,1,2,2}},1);
    public static Room room14=new Room(14,0,6,17,15,new int[][] {{2,1,2,2,2,2},{2,1,2,1,10,2},{2,1,2,101,1,2},{2,1,2,2,3,2},{2,1,1,103,1,2},{2,1,1,1,1,2},{1,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,1,2,2}},1);
    public static Room room15=new Room(15,0,14,16,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,10,2},{2,103,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,101,2},{1,1,1,1,1,2},{2,1,103,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1006,2},{2,1,2,2,2,2}},1);
    public static Room room16=new Room(16,15,17,0,0,new int[][] {{2,2,2,2,2,2},{2,1007,101,1,1,2},{2,1,1,101,1,2},{2,1,101,1,1,2},{2,1,1,101,1,2},{2,1,1,1,1,1},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,1,2,2}},1);
    public static Room room17=new Room(17,14,0,18,16,new int[][] {{2,2,2,1,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,6,1,2},{2,1,1,1,1,2},{2,1,1,1,1,3},{2,1,2,1,3,2},{1,1,2,2,10,2},{2,2,2,2,2,2}},1);
    public static Room room18=new Room(18,17,19,0,20,new int[][] {{2,2,2,1,2,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,103,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,1},{2,4,2,2,2,2}},1);
    // demo ending
    //public static Room room19=new Room(19,0,0,0,18,new int[][] {{2,1,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,22,1,1,1,2},{2,23,1,1014,1,2},{2,1,1,1,1,2},{2,1,1,5,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    // not demo
    public static Room room19=new Room(19,29,30,0,18,new int[][] {{2,1,2,2,2,2},{2,1,1,1,1,2},{2,1,106,1,1,2},{2,1,1,1,1,2},{2,1,1,103,1,2},{2,1,1,1,1,2},{2,1,1,1,1,1},{2,1,1,103,1,2},{2,1008,1,1,1,2},{2,2,1,2,2,2}},1);
    public static Room room20=new Room(20,22,18,21,22,new int[][] {{2,2,2,2,1,2},{2,1,1,1,1,1},{2,1,103,1,1,2},{2,1,1,1,103,2},{2,1,1,1,1,2},{1,1,1,103,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,1,2,2}},1);
    public static Room room21=new Room(21,20,0,0,0,new int[][] {{2,2,2,2,2,2},{2,11,1,5,1,2},{2,5,5,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,1},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room22=new Room(22,0,20,20,0,new int[][] {{2,2,2,2,2,2},{3,1,1,1,1,2},{2,1010,10,2,1,2},{2,2,2,2,3,2},{2,2,2,1,1,2},{2,1,1,1,1,2},{2,3,2,2,2,2},{2,1,1,2,2,2},{2,1,1,1,1,2},{2,2,2,2,1,2}},1);
    public static Room room23=new Room(23,0,0,25,6,new int[][] {{2,2,4,2,2,2},{2,1,1,1,1,2},{1,1,1,1,1,2},{2,5,5,5,5,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room24=new Room(24,6,25,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,7,1,1,1},{2,1,1017,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,13,2,2,2}},1);
    public static Room room25=new Room(25,23,27,26,24,new int[][] {{2,2,1,2,2,2},{1,1,1,1,1,2},{2,1,103,1,1,13},{2,1,1,1,1,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,1,1,106,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,1,2,2}},1);
    public static Room room26=new Room(26,25,28,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,1},{2,1,106,1,1,2},{2,1,1,1,1,2},{2,1,106,1,1,2},{2,1,1,106,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,103,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room27=new Room(27,0,0,28,25,new int[][] {{2,2,2,1,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1015,1,1,2},{2,1,1,6,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{1,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room28=new Room(28,27,0,0,26,new int[][] {{2,2,2,1,2,2},{2,1,1,103,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,103,2},{2,1,8,1,1,2},{2,1,106,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,4},{2,2,2,2,2,2}},1);
    public static Room room29=new Room(29,0,31,19,0,new int[][] {{2,2,2,2,2,2},{2,1,1,103,1009,2},{2,1,1,1,1,2},{2,1,103,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{1,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,1,2}},1);
    public static Room room30=new Room(30,31,0,0,19,new int[][] {{2,2,1,2,2,2},{2,1,1,1,1,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,101,1,1,2},{2,1,1,1,1,2},{2,1,103,1,1,2},{2,1,1,1,1,2},{2,11,1,1,5,1},{2,2,2,2,2,2}},1);
    public static Room room31=new Room(31,0,0,30,29,new int[][] {{2,2,2,2,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,106,1016,1,2},{2,1,1,8,1,2},{2,1,1,1,1,2},{2,5,5,1,1,2},{2,1,11,5,1,2},{1,1,1,5,1,2},{2,2,2,2,2,2}},1);
    public static Room room32=new Room(32,33,0,7,0,new int[][] {{2,2,2,2,2,2},{2,7,2,2,7,2},{2,16,2,2,16,2},{2,15,2,2,15,2},{2,14,1019,1020,14,2},{2,1,1,1,1,1},{2,5,2,2,2,2},{1,1,14,15,16,2},{2,1,2,2,6,2},{2,2,2,2,2,2}},1);
    public static Room room33=new Room(33,0,34,32,35,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{1,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room34=new Room(34,0,0,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);
    public static Room room35=new Room(35,0,0,0,0,new int[][] {{2,2,2,2,2,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,1,1,1,1,2},{2,2,2,2,2,2}},1);

    // Create global variables
    public static Room currentRoom=null;
    public static Item currentItem=null;
    public static Key currentKey=null;
    public static int facingDirection=1;
    public static int playerX=1;
    public static int playerY=1;
    public static int playerMaxHealth=10;
    public static int playerCurrentHealth=10;
    public static boolean alive=true;
    public static boolean attacking=false;
    public static boolean sitar=false;
    public static boolean drumSticks=false;
    public static boolean glasses=false;
    public static boolean wings=false;
    public static boolean usingSitar=false;
    public static boolean usingSticks=false;
    public static boolean usingWingsUp=false;
    public static boolean usingWingsDown=false;
    public static ReaderTile reader13=new ReaderTile(1014,new TextBox("haha"));
    public static int killed=0;

    public static void main(String[] args) // main thread
    {
        roomList.add(testRoom);
        roomList.add(testRoomNorth);
        roomList.add(testRoomSouth);
        roomList.add(testRoomEast);
        roomList.add(testRoomWest);

        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
        roomList.add(room11);
        roomList.add(room12);
        roomList.add(room13);
        roomList.add(room14);
        roomList.add(room15);
        roomList.add(room16);
        roomList.add(room17);
        roomList.add(room18);
        roomList.add(room19);
        roomList.add(room20);
        roomList.add(room21);
        roomList.add(room22);
        roomList.add(room23);
        roomList.add(room24);
        roomList.add(room25);
        roomList.add(room26);
        roomList.add(room27);
        roomList.add(room28);
        roomList.add(room29);
        roomList.add(room30);
        roomList.add(room31);
        roomList.add(room32);
        roomList.add(room33);
        roomList.add(room34);
        roomList.add(room35);


        itemList.add(woodenSword);
        itemList.add(bone);
        itemList.add(stick);
        itemList.add(leaf);


        keyList.add(testKey);
        keyList.add(testKey1);
        keyList.add(testKey2);
        keyList.add(testKey3);
        keyList.add(testKey4);
        keyList.add(testKey5);
        keyList.add(testKey6);

        keyList.add(key1);
        keyList.add(key2);
        keyList.add(key3);
        keyList.add(key4);
        keyList.add(key5);
        keyList.add(key6);
        keyList.add(key7);
        keyList.add(key8);
        keyList.add(key9);
        keyList.add(key10);
        keyList.add(key11);


        sequenceList.add(testSequence);
        sequenceList.add(sequence1);
        sequenceList.add(sequence2);
        sequenceList.add(sequence3);
        sequenceList.add(sequence4);
        sequenceList.add(sequence5);
        sequenceList.add(sequence6);
        sequenceList.add(sequence7);


        readerTileList.add(testReader);
        readerTileList.add(reader1);
        readerTileList.add(reader2);
        readerTileList.add(reader3);
        readerTileList.add(reader4);
        readerTileList.add(reader5);
        readerTileList.add(reader6);
        readerTileList.add(reader7);
        readerTileList.add(reader8);
        readerTileList.add(reader9);
        readerTileList.add(reader10);
        readerTileList.add(reader11);
        readerTileList.add(reader12);
        readerTileList.add(reader13);
        readerTileList.add(reader14);
        readerTileList.add(reader15);
        readerTileList.add(reader16);
        readerTileList.add(reader17);
        readerTileList.add(reader18);
        readerTileList.add(reader19);
        readerTileList.add(reader20);


        for(Key key:keyList)
        {
            key.setupKey();
        }

        setUpScreen();
        setCurrentRoom(6);
        switchMonsters();
        startMonsters();
        displayRoom();
        checkStorySequence();
        checkSpecialEntry();
        takeInput();
    }

    public static void setUpScreen() // initial screen setup
    {
        StdDraw.setCanvasSize(1280,768);
        StdDraw.setXscale(0,1280);
        StdDraw.setYscale(0,768);
        StdDraw.enableDoubleBuffering();
    }

    public static void takeInput() // wait for a key to be pressed and react to it
    {
        while(alive)
        {
            if(StdDraw.isKeyPressed(0x57)) // W (move up)
            {
                while(StdDraw.isKeyPressed(0x57)){}
                if(facingDirection==3) // if facing up
                {
                    if(playerY<5) // move normally within the room
                    {
                        if(currentRoom.getTiles()[playerX][playerY+1]==1) // move if the space is open
                        {
                            playerY++;
                            displayRoom();
                        }
                    }
                    else // if at top of room, move up to next room
                    {
                        pauseThreads();
                        while(checkMonsterAttack()) {}
                        try
                        {
                            Thread.sleep(50);
                        }
                        catch(Exception e) {
                            System.out.println(e);
                        }
                        currentRoom.updateMonsterList(false);
                        setCurrentRoom(currentRoom.getNorth());
                        playerY=0;
                        if(currentRoom.getTiles()[playerX][playerY]==3||currentRoom.getTiles()[playerX][playerY]==4)
                        {
                            displayRoom();
                            if(currentRoom.getTiles()[playerX][playerY]==3)
                            {
                                drawTile(playerX,playerY,3,1);
                            }
                            else
                            {
                                drawTile(playerX,playerY,4,1);
                            }
                            StdDraw.show();
                            try
                            {
                                Thread.sleep(1000);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            setCurrentRoom(currentRoom.getSouth());
                            playerY=5;
                        }
                        switchMonsters();
                        displayRoom();
                        checkStorySequence();
                        checkSpecialEntry();
                        startMonsters();
                    }
                }
                else // turn to face up if not already
                {
                    facingDirection=3;
                    displayRoom();
                }
            }

            if(StdDraw.isKeyPressed(0x41)) // A (move left)
            {
                while(StdDraw.isKeyPressed(0x41)){}
                if(facingDirection==4) // if facing left
                {
                    if(playerX>0) // if not on the left edge of screen, move within room
                    {
                        if(currentRoom.getTiles()[playerX-1][playerY]==1) // if the space is open, move
                        {
                            playerX--;
                            displayRoom();
                        }
                    }
                    else // if on left edge, load room to the left
                    {
                        pauseThreads();
                        while(checkMonsterAttack()) {}
                        try
                        {
                            Thread.sleep(50);
                        }
                        catch(Exception e) {
                            System.out.println(e);
                        }
                        currentRoom.updateMonsterList(false);
                        setCurrentRoom(currentRoom.getWest());
                        playerX=9;
                        if(currentRoom.getTiles()[playerX][playerY]==3||currentRoom.getTiles()[playerX][playerY]==4)
                        {
                            displayRoom();if(currentRoom.getTiles()[playerX][playerY]==3)
                            if(currentRoom.getTiles()[playerX][playerY]==3)
                            {
                                drawTile(playerX,playerY,3,1);
                            }
                            else
                            {
                                drawTile(playerX,playerY,4,1);
                            }
                            StdDraw.show();
                            try
                            {
                                Thread.sleep(1000);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            setCurrentRoom(currentRoom.getEast());
                            playerX=0;
                        }
                        switchMonsters();
                        displayRoom();
                        checkStorySequence();
                        checkSpecialEntry();
                        startMonsters();
                    }
                }
                else // turn left if not already
                {
                    facingDirection=4;
                    displayRoom();
                }
            }

            if(StdDraw.isKeyPressed(0x53)) // S (move down)
            {
                while(StdDraw.isKeyPressed(0x53)){}
                if(facingDirection==1) // if facing down, move down
                {
                    if(playerY>0) // if not on bottom edge of screen, move normally within room
                    {
                        if(currentRoom.getTiles()[playerX][playerY-1]==1) // if space is open, move there
                        {
                            playerY--;
                            displayRoom();
                        }
                    }
                    else // if on bottom edge, load room below
                    {
                        pauseThreads();
                        while(checkMonsterAttack()) {}
                        try
                        {
                            Thread.sleep(50);
                        }
                        catch(Exception e) {
                            System.out.println(e);
                        }
                        currentRoom.updateMonsterList(false);
                        setCurrentRoom(currentRoom.getSouth());
                        playerY=5;
                        if(currentRoom.getTiles()[playerX][playerY]==3||currentRoom.getTiles()[playerX][playerY]==4)
                        {
                            displayRoom();
                            if(currentRoom.getTiles()[playerX][playerY]==3)
                            {
                                drawTile(playerX,playerY,3,1);
                            }
                            else
                            {
                                drawTile(playerX,playerY,4,1);
                            }
                            StdDraw.show();
                            try
                            {
                                Thread.sleep(1000);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            setCurrentRoom(currentRoom.getNorth());
                            playerY=0;
                        }
                        switchMonsters();
                        displayRoom();
                        checkStorySequence();
                        checkSpecialEntry();
                        startMonsters();
                    }
                }
                else // face downward if not already
                {
                    facingDirection=1;
                    displayRoom();
                }
            }

            if(StdDraw.isKeyPressed(0x44)) // D (move right)
            {
                while(StdDraw.isKeyPressed(0x44)){}
                if(facingDirection==2) // if facing right
                {
                    if(playerX<9) // if not on right edge of screen
                    {
                        if(currentRoom.getTiles()[playerX+1][playerY]==1) // if space is open, move
                        {
                            playerX++;
                            displayRoom();
                        }
                    }
                    else // if on right edge of screen, go to the right room
                    {
                        pauseThreads();
                        while(checkMonsterAttack()) {}
                        try
                        {
                            Thread.sleep(50);
                        }
                        catch(Exception e) {
                            System.out.println(e);
                        }
                        currentRoom.updateMonsterList(false);
                        setCurrentRoom(currentRoom.getEast());
                        playerX=0;
                        if(currentRoom.getTiles()[playerX][playerY]==3||currentRoom.getTiles()[playerX][playerY]==4)
                        {
                            displayRoom();
                            if(currentRoom.getTiles()[playerX][playerY]==3)
                            {
                                drawTile(playerX,playerY,3,1);
                            }
                            else
                            {
                                drawTile(playerX,playerY,4,1);
                            }
                            StdDraw.show();
                            try
                            {
                                Thread.sleep(1000);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            setCurrentRoom(currentRoom.getWest());
                            playerX=9;
                        }
                        switchMonsters();
                        displayRoom();
                        checkStorySequence();
                        checkSpecialEntry();
                        startMonsters();
                    }
                }
                else // turn right if not already
                {
                    facingDirection=2;
                    displayRoom();
                }
            }

            if(StdDraw.isKeyPressed(0x20)) // SPACE (interact)
            {
                while(StdDraw.isKeyPressed(0x20)) {}
                while(checkMonsterAttack()) {}
                try
                {
                    Thread.sleep(400);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
                if(facingDirection==1) // if facing down, interact down
                {
                    if(playerY>0) // cannot interact outside of the screen
                    {
                        interact(playerX,playerY-1);
                    }
                }
                if(facingDirection==2) // if facing right
                {
                    if(playerX<9)
                    {
                        interact(playerX+1,playerY);
                    }
                }
                if(facingDirection==3) // if facing up
                {
                    if(playerY<5)
                    {
                        interact(playerX,playerY+1);
                    }
                }
                if(facingDirection==4) // if facing left
                {
                    if(playerX>0)
                    {
                        interact(playerX-1,playerY);
                    }
                }
            }

            if(StdDraw.isKeyPressed(0x45)&&currentRoom.getMonsters().size()==0) // E (open menu)
            {
                while(StdDraw.isKeyPressed(0x45)) {}
                determineSpecials(); // make a new list of special keys to display on the menu
                pauseThreads(); // ensure threads are ready for cancellation
                while(checkMonsterAttack()) {}
                try
                {
                    Thread.sleep(1100);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
                currentRoom.updateMonsterList(true); // save this rooms monsters
                switchMonsters(); // ready threads with monsters
                menu(); // run the menu
                displayRoom(); // show room
                startMonsters(); // begin monster movement
            }

            if(StdDraw.isKeyPressed(0xDE)) // ' (attack)
            {
                while(StdDraw.isKeyPressed(0xDE)) {}
                attack();
            }

            if(StdDraw.isKeyPressed(0x50)&&sitar) // P (use sitar)
            {
                useSitar();
            }
            
            if(StdDraw.isKeyPressed(0x5B)&&drumSticks) // [ (use drumsticks)
            {
                while(StdDraw.isKeyPressed(0x5B)) {}
                useDrumSticks();
            }
            
            if(StdDraw.isKeyPressed(0x5D)&&wings) // ] (use wings)
            {
                while(StdDraw.isKeyPressed(0x5D)) {}
                useWings();
            }
        }
        death();
    }

    public static void useSitar()
    {
        usingSitar=true;
        displayRoom();
        while(StdDraw.isKeyPressed(0x50))
        {
            if(facingDirection==1&&playerY>0&&currentRoom.getTiles()[playerX][playerY-1]==3) // if facing down toward an object that the sitar can be used on
            {
                if(StdDraw.isKeyPressed(0x57)) // W (move up)
                {
                    while(StdDraw.isKeyPressed(0x57)) {}
                    if(playerY<5&&currentRoom.getTiles()[playerX][playerY+1]==1)
                    {
                        currentRoom.setTile(playerX,playerY-1,1);
                        currentRoom.setTile(playerX,playerY,3);
                        playerY++;
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x41)) // A (move left)
                {
                    while(StdDraw.isKeyPressed(0x41)) {}
                    if(playerX>0&&currentRoom.getTiles()[playerX-1][playerY-1]==1)
                    {
                        currentRoom.setTile(playerX,playerY-1,1);
                        currentRoom.setTile(playerX-1,playerY-1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x53)) // S (move down)
                {
                    while(StdDraw.isKeyPressed(0x53)) {}
                    if(playerY>1&&currentRoom.getTiles()[playerX][playerY-2]==1)
                    {
                        currentRoom.setTile(playerX,playerY-1,1);
                        currentRoom.setTile(playerX,playerY-2,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x44)) // D (move right)
                {
                    while(StdDraw.isKeyPressed(0x44)) {}
                    if(playerX<9&&currentRoom.getTiles()[playerX+1][playerY-1]==1)
                    {
                        currentRoom.setTile(playerX,playerY-1,1);
                        currentRoom.setTile(playerX+1,playerY-1,3);
                        displayRoom();
                    }
                }
            }
            if(facingDirection==2&&playerX<9&&currentRoom.getTiles()[playerX+1][playerY]==3) // if facing right toward an object that the sitar can be used on
            {
                if(StdDraw.isKeyPressed(0x57)) // W (move up)
                {
                    while(StdDraw.isKeyPressed(0x57)) {}
                    if(playerY<5&&currentRoom.getTiles()[playerX+1][playerY+1]==1)
                    {
                        currentRoom.setTile(playerX+1,playerY,1);
                        currentRoom.setTile(playerX+1,playerY+1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x41)) // A (move left)
                {
                    while(StdDraw.isKeyPressed(0x41)) {}
                    if(playerX>0&&currentRoom.getTiles()[playerX-1][playerY]==1)
                    {
                        currentRoom.setTile(playerX+1,playerY,1);
                        currentRoom.setTile(playerX,playerY,3);
                        playerX--;
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x53)) // S (move down)
                {
                    while(StdDraw.isKeyPressed(0x53)) {}
                    if(playerY>0&&currentRoom.getTiles()[playerX+1][playerY-1]==1)
                    {
                        currentRoom.setTile(playerX+1,playerY,1);
                        currentRoom.setTile(playerX+1,playerY-1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x44)) // D (move right)
                {
                    while(StdDraw.isKeyPressed(0x44)) {}
                    if(playerX<8&&currentRoom.getTiles()[playerX+2][playerY]==1)
                    {
                        currentRoom.setTile(playerX+1,playerY,1);
                        currentRoom.setTile(playerX+2,playerY,3);
                        displayRoom();
                    }
                }
            }
            if(facingDirection==3&&playerY<9&&currentRoom.getTiles()[playerX][playerY+1]==3) // if facing up toward an object that the sitar can be used on
            {
                if(StdDraw.isKeyPressed(0x57)) // W (move up)
                {
                    while(StdDraw.isKeyPressed(0x57)) {}
                    if(playerY<4&&currentRoom.getTiles()[playerX][playerY+2]==1)
                    {
                        currentRoom.setTile(playerX,playerY+1,1);
                        currentRoom.setTile(playerX,playerY+2,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x41)) // A (move left)
                {
                    while(StdDraw.isKeyPressed(0x41)) {}
                    if(playerX>0&&currentRoom.getTiles()[playerX-1][playerY+1]==1)
                    {
                        currentRoom.setTile(playerX,playerY+1,1);
                        currentRoom.setTile(playerX-1,playerY+1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x53)) // S (move down)
                {
                    while(StdDraw.isKeyPressed(0x53)) {}
                    if(playerY>0&&currentRoom.getTiles()[playerX][playerY-1]==1)
                    {
                        currentRoom.setTile(playerX,playerY+1,1);
                        currentRoom.setTile(playerX,playerY,3);
                        playerY--;
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x44)) // D (move right)
                {
                    while(StdDraw.isKeyPressed(0x44)) {}
                    if(playerX<9&&currentRoom.getTiles()[playerX+1][playerY+1]==1)
                    {
                        currentRoom.setTile(playerX,playerY+1,1);
                        currentRoom.setTile(playerX+1,playerY+1,3);
                        displayRoom();
                    }
                }
            }
            if(facingDirection==4&&playerX>0&&currentRoom.getTiles()[playerX-1][playerY]==3) // if facing left toward an object that the sitar can be used on
            {
                if(StdDraw.isKeyPressed(0x57)) // W (move up)
                {
                    while(StdDraw.isKeyPressed(0x57)) {}
                    if(playerY<5&&currentRoom.getTiles()[playerX-1][playerY+1]==1)
                    {
                        currentRoom.setTile(playerX-1,playerY,1);
                        currentRoom.setTile(playerX-1,playerY+1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x41)) // A (move left)
                {
                    while(StdDraw.isKeyPressed(0x41)) {}
                    if(playerX>1&&currentRoom.getTiles()[playerX-2][playerY]==1)
                    {
                        currentRoom.setTile(playerX-1,playerY,1);
                        currentRoom.setTile(playerX-2,playerY,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x53)) // S (move down)
                {
                    while(StdDraw.isKeyPressed(0x53)) {}
                    if(playerY>0&&currentRoom.getTiles()[playerX-1][playerY-1]==1)
                    {
                        currentRoom.setTile(playerX-1,playerY,1);
                        currentRoom.setTile(playerX-1,playerY-1,3);
                        displayRoom();
                    }
                }
                if(StdDraw.isKeyPressed(0x44)) // D (move right)
                {
                    while(StdDraw.isKeyPressed(0x44)) {}
                    if(playerX<9&&currentRoom.getTiles()[playerX+1][playerY]==1)
                    {
                        currentRoom.setTile(playerX-1,playerY,1);
                        currentRoom.setTile(playerX,playerY,3);
                        playerX++;
                        displayRoom();
                    }
                }
            }
        }
        usingSitar=false;
        displayRoom();
    }

    public static void useDrumSticks()
    {
        usingSticks=true;
        displayRoom();
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        if(facingDirection==1&&playerY>0&&currentRoom.getTiles()[playerX][playerY-1]==4) // if facing down towards a drum stick able tile
        {
            currentRoom.setTile(playerX,playerY-1,1);
        }
        if(facingDirection==2&&playerX<9&&currentRoom.getTiles()[playerX+1][playerY]==4) // if facing right towards a drum stick able tile
        {
            currentRoom.setTile(playerX+1,playerY,1);
        }
        if(facingDirection==3&&playerY<5&&currentRoom.getTiles()[playerX][playerY+1]==4) // if facing up towards a drum stick able tile
        {
            currentRoom.setTile(playerX,playerY+1,1);
        }
        if(facingDirection==4&&playerX>0&&currentRoom.getTiles()[playerX-1][playerY]==4) // if facing left towards a drum stick able tile
        {
            currentRoom.setTile(playerX-1,playerY,1);
        }
        usingSticks=false;
        displayRoom();
    }

    public static void useWings()
    {
        usingWingsUp=true;
        displayRoom();
        try
        {
            Thread.sleep(250);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        if(facingDirection==1&&playerY>1&&currentRoom.getTiles()[playerX][playerY-1]==5&&currentRoom.getTiles()[playerX][playerY-2]==1) // if facing down towards a wings able tile
        {
            playerY--;
            usingWingsDown=true;
            usingWingsUp=false;
            displayRoom();
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            playerY--;
            usingWingsDown=false;
            usingWingsUp=true;
            displayRoom();
        }
        if(facingDirection==2&&playerX<8&&currentRoom.getTiles()[playerX+1][playerY]==5&&currentRoom.getTiles()[playerX+2][playerY]==1) // if facing right towards a wings able tile
        {
            playerX++;
            usingWingsDown=true;
            usingWingsUp=false;
            displayRoom();
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            playerX++;
            usingWingsDown=false;
            usingWingsUp=true;
            displayRoom();
        }
        if(facingDirection==3&&playerY<4&&currentRoom.getTiles()[playerX][playerY+1]==5&&currentRoom.getTiles()[playerX][playerY+2]==1) // if facing up towards a wings able tile
        {
            playerY++;
            usingWingsDown=true;
            usingWingsUp=false;
            displayRoom();
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            playerY++;
            usingWingsDown=false;
            usingWingsUp=true;
            displayRoom();
        }
        if(facingDirection==4&&playerX>1&&currentRoom.getTiles()[playerX-1][playerY]==5&&currentRoom.getTiles()[playerX-2][playerY]==1) // if facing left towards a wings able tile
        {
            playerX--;
            usingWingsDown=true;
            usingWingsUp=false;
            displayRoom();
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            playerX--;
            usingWingsDown=false;
            usingWingsUp=true;
            displayRoom();
        }
        try
        {
            Thread.sleep(250);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        usingWingsUp=false;
        displayRoom();
    }

    public static void checkStorySequence()
    {
        if(currentRoom.firstEntry)
        {
            for(int i=0;i<sequenceList.size();i++)
            {
                if(sequenceList.get(i).code==currentRoom.getCode())
                {
                    sequenceList.get(i).go();
                }
            }
        }
    }

    public static void checkSpecialEntry()
    {
        if(currentRoom.firstEntry)
        {
            currentRoom.firstEntry=false;
            if(currentRoom.getCode()==13)
            {
                playerX--;
                currentRoom.setTile(2,3,102);
                currentRoom.setTile(9,3,3);
                currentRoom.updateMonsterList(false);
                switchMonsters();
                currentRoom.getMonsters().get(0).remainingHealth=10;
                displayRoom();
                runTextBox(new TextBox("ZEORGE: HA HA HA. Zohn really trusts a child he barely knows to defeat me. I'm sorry you had to be a victim of his foolishness."),true);
            }
            if(currentRoom.getCode()==21)
            {
                playerY--;
                currentRoom.setTile(5,3,104);
                currentRoom.setTile(5,5,4);
                currentRoom.updateMonsterList(false);
                switchMonsters();
                currentRoom.getMonsters().get(0).remainingHealth=20;
                displayRoom();
                runTextBox(new TextBox("ZINGO: SILENCE, ZOHN! YOU ARE BEING INCANDESCENT!!! FACE ME OR DIE!!!"),true);
            }
            if(currentRoom.getCode()==23)
            {
                currentRoom.setTile(5,3,22);
                currentRoom.setTile(4,3,105);
                currentRoom.updateMonsterList(false);
                switchMonsters();
                displayRoom();
                runTextBox(new TextBox("Yes, it does."),true);
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                playerX=4;
                playerY=1;
                displayRoom();
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                runTextBox(new TextBox("You hurt my friends. Now I'll hurt you."),true);
            }
            if(currentRoom.getCode()==32)
            {
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                runTextBox(new TextBox("RUMBLE RUMBLE RUMBLE"),true);
                displayRoom();
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                playerY++;
                currentRoom.getTiles()[7][0]=2;
                displayRoom();
            }
            if(currentRoom.getCode()==33)
            {
                try
                {
                    Thread.sleep(1500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                runTextBox(new TextBox("ZAUL: I told you not to come here."),true);
                try
                {
                    Thread.sleep(1500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                currentRoom.setTile(5,3,105);
                displayRoom();
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                currentRoom.setTile(2,2,102);
                displayRoom();
                try
                {
                    Thread.sleep(750);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                currentRoom.setTile(7,2,104);
                displayRoom();
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                currentRoom.updateMonsterList(false);
                switchMonsters();
                runTextBox(new TextBox("ZAUL: Nothing can stop us now."),true);
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                playerY++;
                currentRoom.setTile(5,0,2);
                displayRoom();
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            if(currentRoom.getCode()==34)
            {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(0,0,2000,2000);
                StdDraw.show();
                runTextBox(new TextBox("You leave the submarine without looking back. You return to wherever you came from, before you encountered Zohn. Who is right, who is wrong, and who is to say? Zohn will remain trapped in that sub for the rest of his death.                                              Thank you for playing. Thanks to Amir Khatib for helping with the graphics."),false);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(0,0,2000,2000);
                StdDraw.show();
                while(true) {}
            }
            if(currentRoom.getCode()==35)
            {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(0,0,2000,2000);
                StdDraw.show();
                runTextBox(new TextBox("You revive Zohn and you both leave the submarine. Zohn desires people to lead since they all, well, passed on. In some manner or another, the two of you bear many more children, and Zohn assumes leadership, just as   his father once did. Have you really won?    Thank you for playing. Thanks to Amir Khatib for helping with the graphics."),false);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(0,0,2000,2000);
                StdDraw.show();
                while(true) {}
            }
        }
        /*if(currentRoom.getCode()==19)
        {
            reader13=new ReaderTile(1014,new TextBox("Congrats, you reached the end of the demo. I am probably a bit over halfway done. The final two key items are on the ground. Your current completion is "+killed+"/21 enemies defeated and "+(countKeys(2)+countKeys(3))+"/6 keys."));
            readerTileList.set(13,reader13);     DEMO
        }*/
    }

    public static void checkSpecialDeath(int x, int y)
    {
        if(currentRoom.getCode()==13)
        {
            runTextBox(new TextBox("ZEORGE: NO! I can't anymore. How- you're lucky it was two against one. It doesn't matter. We have escaped the yellow submarine. Zohn's power surge has run its course. We will reclaim power and everyone will once again listen to our music, whether they like it or not."),false);
            currentRoom.setTile(x,y,24);
        }
        if(currentRoom.getCode()==21)
        {
            runTextBox(new TextBox("ZINGO: HOW. HOW THIS HAS HAPPENED. CHEATER!!! YOU BEAT ME, NO FAIR! I WILL TELL ZAUL."),false);
            currentRoom.setTile(x,y,25);
        }
        if(currentRoom.getCode()==26&&currentRoom.getMonsters().size()==0)
        {
            currentRoom.setTile(9,3,1);
        }
        if(currentRoom.getCode()==23)
        {
            runTextBox(new TextBox("ZAUL: Ugh, I didn't expect this. You've hurt me, but you're too late. All my children have been shown the truth. They've all taken LSD and will follow my every word. I must go to the yellow submarine."),false);
            currentRoom.setTile(x,y,23);
        }
        if(currentRoom.getCode()==33&&currentRoom.getMonsters().size()==2)
        {
            runTextBox(new TextBox("???: You can do this. Allow my help."),false);
            playerCurrentHealth=playerMaxHealth;
        }
        if(currentRoom.getCode()==33&&currentRoom.getMonsters().size()==1)
        {
            runTextBox(new TextBox("ZOHN: Defeat him, small one. For my sake."),false);
        }
        if(currentRoom.getCode()==33&&currentRoom.getMonsters().size()==0)
        {
            runTextBox(new TextBox("ZAUL: That's enough. We concede.  ZEORGE: But Zaul-  ZAUL: Who really is the victor? Zohn supposedly leads this land, but he enlisted someone to murder his own people. "+(killed-6)+" out of the 41 affected were killed. Just think about that. Is that impressive? Or isn't it? I'd say.. not."),false);
            if(playerX==3&&playerY==3)
            {
                currentRoom.setTile(5,3,18);
            }
            else
            {
                currentRoom.setTile(3,3,18);
            }
            if(playerX==4&&playerY==2)
            {
                currentRoom.setTile(5,2,1021);
            }
            else
            {
                currentRoom.setTile(4,2,1021);
            }
            currentRoom.setTile(0,2,1);
            currentRoom.setTile(9,2,1);
            displayRoom();
            runTextBox(new TextBox("ZOHN: Well, you're dead! And thanks to this small one, I'm not! Haha! Now, small one, the room to the left will allow you to fully revive me, as I deserve!"),false);
        }
    }

    public static void attack() // attack the square in front of the player
    {
        attacking=true; // change animation to attacking
        displayRoom();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        attacking=false;
        if(currentItem!=null&&currentItem.attackType==1)
        {
            if(facingDirection==1)
            {
                if(playerY>1)
                {
                    if(currentRoom.getTiles()[playerX][playerY-1]>100&&currentRoom.getTiles()[playerX][playerY-1]<1000)
                    {
                        damageMonster(playerX,playerY-1);
                    }
                }
            }
            if(facingDirection==2)
            {
                if(playerX<8)
                {
                    if(currentRoom.getTiles()[playerX+1][playerY]>100&&currentRoom.getTiles()[playerX+1][playerY]<1000)
                    {
                        damageMonster(playerX+1,playerY);
                    }
                }
            }
            if(facingDirection==3)
            {
                if(playerY<4)
                {
                    if(currentRoom.getTiles()[playerX][playerY+1]>100&&currentRoom.getTiles()[playerX][playerY+1]<1000)
                    {
                        damageMonster(playerX,playerY+1);
                    }
                }
            }
            if(facingDirection==4)
            {
                if(playerX>1)
                {
                    if(currentRoom.getTiles()[playerX-1][playerY]>100&&currentRoom.getTiles()[playerX-1][playerY]<1000)
                    {
                        damageMonster(playerX-1,playerY);
                    }
                }
            }
        }
        if(currentItem!=null&&currentItem.attackType==2)
        {
            if(playerX>1)
            {
                if(playerY<4&&currentRoom.getTiles()[playerX-1][playerY+1]>100&&currentRoom.getTiles()[playerX-1][playerY+1]<1000)
                {
                    damageMonster(playerX-1,playerY+1);
                }
                if(currentRoom.getTiles()[playerX-1][playerY]>100&&currentRoom.getTiles()[playerX-1][playerY]<1000)
                {
                    damageMonster(playerX-1,playerY);
                }
                if(playerY>1&&currentRoom.getTiles()[playerX-1][playerY-1]>100&&currentRoom.getTiles()[playerX-1][playerY-1]<1000)
                {
                    damageMonster(playerX-1,playerY-1);
                }
            }
            if(playerX<8)
            {
                if(playerY<4&&currentRoom.getTiles()[playerX+1][playerY+1]>100&&currentRoom.getTiles()[playerX+1][playerY+1]<1000)
                {
                    damageMonster(playerX+1,playerY+1);
                }
                if(currentRoom.getTiles()[playerX+1][playerY]>100&&currentRoom.getTiles()[playerX+1][playerY]<1000)
                {
                    damageMonster(playerX+1,playerY);
                }
                if(playerY>1&&currentRoom.getTiles()[playerX+1][playerY-1]>100&&currentRoom.getTiles()[playerX+1][playerY-1]<1000)
                {
                    damageMonster(playerX+1,playerY-1);
                }
            }
            if(playerY<4&&currentRoom.getTiles()[playerX][playerY+1]>100&&currentRoom.getTiles()[playerX][playerY+1]<1000)
            {
                damageMonster(playerX,playerY+1);
            }
            if(playerY>1&&currentRoom.getTiles()[playerX][playerY-1]>100&&currentRoom.getTiles()[playerX][playerY-1]<1000)
            {
                damageMonster(playerX,playerY-1);
            }
        }
        displayRoom();
    }

    public static void damageMonster(int x, int y) // deal damage to the monster at the specified coordinates
    {
        int foundMonster=-1;
        for(int i=0;i<currentRoom.getMonsters().size();i++)
        {
            if(currentRoom.getMonsters().get(i).getX()==x&&currentRoom.getMonsters().get(i).getY()==y)
            {
                foundMonster=i;
            }
        }
        if(foundMonster!=-1)
        {
            if(currentItem!=null)
            {
                currentRoom.getMonsters().get(foundMonster).setRemainingHealth(currentRoom.getMonsters().get(foundMonster).getRemainingHealth()-currentItem.attackPower);
                currentRoom.remainingMap[x][y]=currentRoom.remainingMap[x][y]-1;
            }
            else
            {
                if(takeHit(1)<1)
                {
                    alive=false;
                }
            }
            if(currentRoom.getMonsters().get(foundMonster).getRemainingHealth()<=0)
            {
                currentRoom.killMonster(x, y);
                killed++;
                currentRoom.setTile(x,y,1);
                checkSpecialDeath(x,y);
            }
        }
    }

    public static void death() // show game over screen
    {
        pauseThreads();
        switchMonsters();
        pauseThreads();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(640,384,640,384);
        StdDraw.setFont(gameOverFont);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(640,384,"GAME OVER");
        StdDraw.show();
    }

    public static void pauseThreads() // stop while loops so threads are ready for interruption
    {
        Monster.stopMoving();
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }*/
    }

    public static int takeHit(int damage) // removes an amount of health from the player and returns the remaining health
    {
        playerCurrentHealth-=damage;
        return playerCurrentHealth;
    }

    public static void interact(int interactX, int interactY) // attempt to interact with a given tile
    {
        boolean acquiredItem=false;
        boolean acquiredKey=false;
        Key usedKey=null;
        if(currentRoom.getTiles()[interactX][interactY]==7) // picking up object
        {
            for(Item item:itemList)
            {
                if(item.getRoomCode()==currentRoom.getCode()) // if item is at the spot we are attempting to interact with
                {
                    if(item.getX()==interactX&&item.getY()==interactY) // then add to my items and update space to empty
                    {
                        acquiredItem=true;
                        myItems.add(item);
                        currentRoom.setTile(interactX, interactY,1);
                        if(myItems.size()==1) // equip if first item found
                        {
                            currentItem=item;
                        }
                    }
                }
            }
            if(acquiredItem) // move from item list (so it isn't picked up again)
            {
                itemList.remove(myItems.get(myItems.size()-1));
                displayRoom();
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==22) // picking up glasses
        {
            currentRoom.setTile(interactX,interactY,1);
            glasses=true;
            displayRoom();
            runTextBox(pickUpGlasses,false);
        }
        if(currentRoom.getTiles()[interactX][interactY]==23) // picking up wings
        {
            currentRoom.setTile(interactX,interactY,1);
            wings=true;
            displayRoom();
            runTextBox(pickUpWings,false);
        }
        if(currentRoom.getTiles()[interactX][interactY]==24) // picking up sitar
        {
            currentRoom.setTile(interactX,interactY,1);
            sitar=true;
            displayRoom();
            runTextBox(pickUpSitar,false);
        }
        if(currentRoom.getTiles()[interactX][interactY]==25) // picking up drumsticks
        {
            currentRoom.setTile(interactX,interactY,1);
            drumSticks=true;
            displayRoom();
            runTextBox(pickUpSticks,false);
        }
        if(currentRoom.getTiles()[interactX][interactY]==3) // interacting with sitar tile
        {
            if(sitar)
            {
                runTextBox(yesSitar,false);
            }
            else
            {
                runTextBox(noSitar,false);
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==4) // drum sticks tile
        {
            if(drumSticks)
            {
                runTextBox(yesSticks,false);
            }
            else
            {
                runTextBox(noSticks,false);
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==5) // wings tile
        {
            if(wings)
            {
                runTextBox(yesWings,false);
            }
            else
            {
                runTextBox(noWings,false);
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]>=8&&currentRoom.getTiles()[interactX][interactY]<=12) // picking up a key
        {
            for(Key key:keyList)
            {
                if(key.getSpawnRoomCode()==currentRoom.getCode()) // if key is in spot
                {
                    if(key.getSpawnX()==interactX&&key.getSpawnY()==interactY) // then add to my keys and set space to empty
                    {
                        acquiredKey=true;
                        myKeys.add(key);
                        currentRoom.setTile(interactX, interactY,1);
                        if(key.getType()==1)
                        {
                            currentKey=key;
                        }
                    }
                }
            }
            if(acquiredKey) // remove from key list
            {
                keyList.remove(myKeys.get(myKeys.size()-1));
                displayRoom();
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==13) // unlocking a special door
        {
            for(Key key:myKeys)
            {
                if(key.getType()==1) // special door
                {
                    if(key.getDoorCode()[0]==currentRoom.getCode()) // if key is the right one for this door
                    {
                        if(interactX==key.getDoorX()[0]&&interactY==key.getDoorY()[0])
                        {
                            usedKey=key;
                            getRoom(key.getDoorCode()[0]).setTile(key.getDoorX()[0],key.getDoorY()[0],1); // set the doors to a space
                            getRoom(key.getDoorCode()[1]).setTile(key.getDoorX()[1],key.getDoorY()[1],1);
                        }
                    }
                    if(key.getDoorCode()[1]==currentRoom.getCode()) // check other side of the door
                    {
                        if(interactX==key.getDoorX()[1]&&interactY==key.getDoorY()[1])
                        {
                            usedKey=key;
                            getRoom(key.getDoorCode()[0]).setTile(key.getDoorX()[0],key.getDoorY()[0],1);
                            getRoom(key.getDoorCode()[1]).setTile(key.getDoorX()[1],key.getDoorY()[1],1);
                        }
                    }
                }
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==14) // unlocking a blue door
        {
            for(Key key:myKeys)
            {
                if(key.getType()==2) // if the key is blue, it can unlock the door
                {
                    usedKey=key;
                    currentRoom.setTile(interactX,interactY,1); // set door to space
                    if(interactX==0) // check for position of door and set next room over to space
                    {
                        getRoom(currentRoom.getWest()).setTile(9,interactY,1);
                    }
                    if(interactX==9)
                    {
                        getRoom(currentRoom.getEast()).setTile(0,interactY,1);
                    }
                    if(interactY==0)
                    {
                        getRoom(currentRoom.getSouth()).setTile(interactX,5,1);
                    }
                    if(interactY==5)
                    {
                        getRoom(currentRoom.getNorth()).setTile(interactX,0,1);
                    }
                }
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==15) // unlocking a yellow door
        {
            for(Key key:myKeys)
            {
                if(key.getType()==3)
                {
                    usedKey=key;
                    currentRoom.setTile(interactX,interactY,1); // set door to space 
                    if(interactX==0) // check for position of door and set next room over to space
                    {
                        getRoom(currentRoom.getWest()).setTile(9,interactY,1);
                    }
                    if(interactX==9)
                    {
                        getRoom(currentRoom.getEast()).setTile(0,interactY,1);
                    }
                    if(interactY==0)
                    {
                        getRoom(currentRoom.getSouth()).setTile(interactX,5,1);
                    }
                    if(interactY==5)
                    {
                        getRoom(currentRoom.getNorth()).setTile(interactX,0,1);
                    }
                }
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==16) // unlocking a red door
        {
            for(Key key:myKeys)
            {
                if(key.getType()==4)
                {
                    usedKey=key;
                    currentRoom.setTile(interactX,interactY,1); 
                    if(interactX==0)
                    {
                        getRoom(currentRoom.getWest()).setTile(9,interactY,1);
                    }
                    if(interactX==9)
                    {
                        getRoom(currentRoom.getEast()).setTile(0,interactY,1);
                    }
                    if(interactY==0)
                    {
                        getRoom(currentRoom.getSouth()).setTile(interactX,5,1);
                    }
                    if(interactY==5)
                    {
                        getRoom(currentRoom.getNorth()).setTile(interactX,0,1);
                    }
                }
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==17) // unlocking a green door
        {
            for(Key key:myKeys)
            {
                if(key.getType()==5)
                {
                    usedKey=key;
                    currentRoom.setTile(interactX,interactY,1); 
                    if(interactX==0)
                    {
                        getRoom(currentRoom.getWest()).setTile(9,interactY,1);
                    }
                    if(interactX==9)
                    {
                        getRoom(currentRoom.getEast()).setTile(0,interactY,1);
                    }
                    if(interactY==0)
                    {
                        getRoom(currentRoom.getSouth()).setTile(interactX,5,1);
                    }
                    if(interactY==5)
                    {
                        getRoom(currentRoom.getNorth()).setTile(interactX,0,1);
                    }
                }
            }
        }
        if(usedKey!=null) // if a key was used
        {
            if(myKeys.size()==1) // clear so no key appears on menu
            {
                currentKey=null;
            }
            myKeys.remove(usedKey); // use the key
            displayRoom();
        }
        for(int i=0;i<readerTileList.size();i++) // check all reader tiles
        {
            if(currentRoom.getTiles()[interactX][interactY]==readerTileList.get(i).code) // if this is a certain reader tile, display the text box
            {
                runTextBox(readerTileList.get(i).text,false);
            }
        }
        if(currentRoom.getTiles()[interactX][interactY]==6) // if heal tile
        {
            playerCurrentHealth=playerMaxHealth;
            displayRoom();
        }
    }

    public static void menu() // bring up and allow interaction with the menu
    {
        boolean stayInMenu=true;
        displayMenu();
        while(stayInMenu)
        {
            while(mouseInPolygon(new double[] {1173.3333,1237.3333,1173.3333}, new double[] {138.6667,128,117.3333})) // click on right item arrow
            {
                StdDraw.frame.setCursor(new Cursor(12)); // change cursor to hand
                if(StdDraw.isMousePressed())
                {
                    while(StdDraw.isMousePressed()) {}
                    if(myItems.size()>0) // if there are any items to display
                    {
                        if(!(myItems.get(myItems.size()-1)==currentItem)) // if not at the end of the list of items, switch to the next
                        {
                            currentItem=myItems.get(myItems.indexOf(currentItem)+1);
                            displayMenu();
                        }
                    }
                }

                if(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) // allow departure from menu when hovering over
                {
                    while(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) {}
                    stayInMenu=false;
                    break;
                }
            }

            while(mouseInPolygon(new double[] {768,832,832},new double[] {128,138.6667,117.3333})) // click on left item arrow
            {
                StdDraw.frame.setCursor(new Cursor(12)); // change cursor
                if(StdDraw.isMousePressed())
                {
                    while(StdDraw.isMousePressed()) {}
                    if(myItems.size()>0) // if items are in the list
                    {
                        if(!(myItems.get(0)==currentItem)) // if not at beginning of list
                        {
                            currentItem=myItems.get(myItems.indexOf(currentItem)-1);
                            displayMenu();
                        }
                    }
                }

                if(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) // allow leave
                {
                    while(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) {}
                    stayInMenu=false;
                    break;
                }
            }

            while(mouseInPolygon(new double[] {1173.3333,1237.3333,1173.3333},new double[] {480,469.3333,458.6667})) // click on right key arrow
            {
                StdDraw.frame.setCursor(new Cursor(12)); // change cursor
                if(StdDraw.isMousePressed())
                {
                    while(StdDraw.isMousePressed()) {}
                    if(specialKeys.size()>0) // if there are any special keys
                    {
                        if(!(specialKeys.indexOf(currentKey)==specialKeys.size()-1)) // if not at end of special key list
                        {
                            currentKey=specialKeys.get(specialKeys.indexOf(currentKey)+1); // move to next key
                            displayMenu();
                        }
                    }
                }
            }

            while(mouseInPolygon(new double[] {768,832,832},new double[] {469.3333,480,458.6667})) // click on left key arrow
            {
                StdDraw.frame.setCursor(new Cursor(12)); // change cursor
                if(StdDraw.isMousePressed())
                {
                    while(StdDraw.isMousePressed()) {}
                    if(specialKeys.size()>0) // if there are any special keys
                    {
                        if(!(specialKeys.indexOf(currentKey)==0)) // if not at beginning of special key list
                        {
                            currentKey=specialKeys.get(specialKeys.indexOf(currentKey)-1); // move to previous key
                            displayMenu();
                        }
                    }
                }
            }

            if(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) // E / ESCAPE (leave menu)
            {
                while(StdDraw.isKeyPressed(0x1B)||StdDraw.isKeyPressed(0x45)) {}
                stayInMenu=false;
            }

            if(!(StdDraw.frame.getCursor()==Cursor.getDefaultCursor())) // switch back to normal cursor if not on special button
            {
                StdDraw.frame.setCursor(Cursor.getDefaultCursor());
            }
        }
    }
 
    public static void displayMenu() // draw the menu
    {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(640,384,640,384);
        // item display box
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledPolygon(new double[] {1173.3333,1237.3333,1173.3333},new double[] {138.6667,128,117.3333});
        StdDraw.filledPolygon(new double[] {768,832,832},new double[] {128,138.6667,117.3333});
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(.005);
        StdDraw.rectangle(1002.6667,128,149.3333,42.6667);
        StdDraw.rectangle(1002.6667,277.3333,64,64); 
        try
        { // display things if there is an item picked up
            StdDraw.setFont(defaultFont);
            StdDraw.text(1002.6667,128,currentItem.getTitle());
            drawItem(7.3333,1.6667);
        } catch(Exception e) // display no items if none 
        {
            StdDraw.setFont(defaultFont);
            StdDraw.text(1002.6667,277.3333,"No weapons yet!");
            StdDraw.show();
        }

        // key display box
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledPolygon(new double[] {1173.3333,1237.3333,1173.3333},new double[] {480,469.3333,458.6667});
        StdDraw.filledPolygon(new double[] {768,832,832},new double[] {469.3333,480,458.6667});
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(.005);
        StdDraw.rectangle(1002.6667,469.3333,149.3333,42.6667);
        StdDraw.rectangle(1002.6667,618.6667,64,64);
        try
        { // display special key if there is one
            StdDraw.setFont(defaultFont);
            StdDraw.text(1002.6667,469.3333,"This key unlocks a door in "+identifyEnvironment(getRoom(currentKey.getDoorCode()[0]).getEnvironment()));
            // DRAW KEY ICON IN BOX
        } catch(Exception e)
        {
            StdDraw.setFont(defaultFont);
            StdDraw.text(1002.6667,618.6667,"No special keys!");
            StdDraw.show();
        }
        drawKey(StdDraw.BLUE,897.7778,654.2222);
        drawKey(StdDraw.YELLOW,897.7778,568.8889);
        drawKey(StdDraw.RED,1106.1111,611.5556);
        
        // counts of colored keys
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(defaultFont);
        StdDraw.text(897.7778,620,"x"+countKeys(2));
        StdDraw.text(897.7778,534.6667,"x"+countKeys(3));
        StdDraw.text(1106.1111,577.3333,"x"+countKeys(4));
        StdDraw.show();

        // dev
        StdDraw.setFont(new Font("SansSerif",Font.PLAIN,30));
        StdDraw.text(384,128,"Health: "+playerCurrentHealth+"/"+playerMaxHealth);
        if(currentItem==null)
        {
            StdDraw.text(384,90,"Attack: 0");
        }
        else
        {
            StdDraw.text(384,90,"Attack: "+currentItem.attackPower);
        }
        StdDraw.picture(384,450,"playerinventory.png",260.43,450);
        if(sitar)
        {
            StdDraw.picture(128,512,"sitarinventory.png",100,100);
        }
        else
        {
            StdDraw.picture(128,512,"sitarsilhoutte.png",100,100);
        }
        if(drumSticks)
        {
            StdDraw.picture(640,512,"druminventory.png",100,100);
        }
        else
        {
            StdDraw.picture(640,512,"drumsilhoutte.png",100,100);
        }
        if(glasses)
        {
            StdDraw.picture(128,128,"glassesinventory.png",100,100);
        }
        else
        {
            StdDraw.picture(128,128,"glassessilhoutte.png",100,100);
        }
        if(wings)
        {
            StdDraw.picture(640,128,"wingsinventory.png",100,100);
        }
        else
        {
            StdDraw.picture(640,128,"wingssilhoutte.png",100,100);
        }
        StdDraw.show();
    }

    public static void drawKey(Color color, double x, double y) // draw a key of a certain color at a certain spot
    {
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(.01); // 897.7 654.2
        StdDraw.circle(x-19.5556,y,10.6667);
        StdDraw.setPenRadius(.005);
        StdDraw.filledPolygon(new double[] {x-9.8889,x-9.8889,x+26.6667,x+26.6667,x+23.1111,x+17.7778,x+12.4444,x+12.4444,x+9.8889,x+9.8889,x+5.3333,x+1.7778,x-1.7778},new double[] {y+4.8889,y-3.5556,y-3.5556,y+3.8889,y+3.8889,y+.3333,y+3.8889,y+7.7778,y+7.7778,y+3.8889,y+3.8889,y+7.7778,y+3.8889});
        StdDraw.filledCircle(x+26.6667,y,3.5556);
        StdDraw.show();
    }

    public static void determineSpecials() // redefine the list of special keys for displaying on menu
    {
        specialKeys.clear();
        for(Key key:myKeys)
        {
            if(key.getType()==1) // if special type, add to list
            {
                specialKeys.add(key);
            }
        }
    }

    public static int countKeys(int type) // count the amount of a certain type of key for diplaying on menu
    {
        int count=0;
        for(Key key:myKeys)
        {
            if(key.getType()==type)
            {
                count++;
            }
        }
        return count;
    }

    public static void displayRoom() // draw the new room/state of the room
    {
        for(int i=0;i<10;i++) // draw each tile in the room
        {
            for(int j=0;j<6;j++)
            {
                drawTile(i,j,currentRoom.getTiles()[i][j],currentRoom.getEnvironment());
            }
        }
        for(Item item:itemList) // draw items
        {
            if(item.getRoomCode()==currentRoom.getCode()&&!item.getObtained())
            {
                drawItem(item.getX(),item.getY());
            }
        }
        drawPlayer(playerX,playerY,facingDirection); // generate player on screen
        StdDraw.show();
    }

    public static void displayMonsterHealth(int x, int y)
    {
        int remainingHealth=currentRoom.remainingMap[x][y];
        int totalHealth=currentRoom.maxMap[x][y];
        if(remainingHealth<totalHealth)
        {
            double percentage=(double)remainingHealth/(double)totalHealth;
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledRectangle(64+128*x,120+128*y,32,4);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(32*(1+percentage)+128*x,120+128*y,32*percentage,4);
        }
    }

    public static void drawTile(int x, int y, int type, int environment) // draw one of the 60 tiles on the screen
    {
        if(type==101) // monster 1
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monster.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==201) // monster 1 attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monsterattack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==102) // zeorge
        {
            StdDraw.picture( 64+128*x, 64+128*y, "harrison.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==202) // zeorge attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "harrisonattack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==26) // zeorge attacked tile
        {
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.filledRectangle(64+128*x,64+128*y,64,64);
        }
        if(type==103) // monster 2
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monster2.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==203) // monster 2 attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monster2attack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==104) // zingo
        {
            StdDraw.picture( 64+128*x, 64+128*y, "starr.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==204) // zingo attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "starrattack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==105) // zaul
        {
            StdDraw.picture( 64+128*x, 64+128*y, "mccartney.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==205) // zaul attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "mccartneyattack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==106) // monster 3
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monster3.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==206) // monster 3 attacking
        {
            StdDraw.picture( 64+128*x, 64+128*y, "monster3attack.png", 128, 128);
            if(glasses)
            {
                displayMonsterHealth(x,y);
            }
        }
        if(type==22) // glasses item
        {
            StdDraw.picture( 64+128*x, 64+128*y, "glasses.png", 128, 128);
        }
        if(type==23) // wings item
        {
            StdDraw.picture( 64+128*x, 64+128*y, "wings.png", 128, 128);
        }
        if(type==24) // sitar item
        {
            StdDraw.picture( 64+128*x, 64+128*y, "sitar.png", 128, 128);
        }
        if(type==25) // drum sticks item
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(64+128*x,64+128*y,64,64);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.setFont(defaultFont);
            StdDraw.text(64+128*x,64+128*y,"these are the drum sticks");
        }
        if(type==18) // zohn
        {
            StdDraw.picture( 64+128*x, 64+128*y, "lennon.png", 128, 128);
        }
        if(type==19) // zaul
        {
            StdDraw.picture( 64+128*x, 64+128*y, "mccartney.png", 128, 128);
        }
        if(type==20) // zeorge
        {
            StdDraw.picture( 64+128*x, 64+128*y, "harrison.png", 128, 128);
        }
        if(type==21) // zingo
        {
            StdDraw.picture( 64+128*x, 64+128*y, "starr.png", 128, 128);
        }
        if(type==6) // heal tile
        {
            StdDraw.picture( 64+128*x, 64+128*y, "healflower.png", 128, 128);
        }
        if(environment==1) // plains
        {
            if(type==1||(type>6&&type<13)) // open space/background of item
            {
                /*StdDraw.setPenColor(StdDraw.CYAN);
                StdDraw.filledRectangle(64+128*x,64+128*y,64,64);*/
                StdDraw.picture( 64+128*x, 64+128*y, "grass.png", 128, 128);
            }
            if(type==2) // wall
            {
                /*StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(64+128*x,64+128*y,64,64);*/
                StdDraw.picture( 64+128*x, 64+128*y, "stone wall.png", 128, 128);
            }
            if(type>1000) // reader tiles
            {
                StdDraw.picture( 64+128*x, 64+128*y, "sign.png", 128, 128);
            }
            if(type==3) // sitar (moveable) tile
            {
                StdDraw.picture( 64+128*x, 64+128*y, "stone.png", 128, 128);
            }
            if(type==4) // drum sticks (breakable) tile
            {
                StdDraw.picture( 64+128*x, 64+128*y, "egg.png", 128, 128);
            }
            if(type==5) // wings (hoppable) tile
            {
                StdDraw.picture( 64+128*x, 64+128*y, "trap.png", 128, 128);
            }
        }
        if(type==8) // one time use key
        {
            drawKey(StdDraw.ORANGE,64+128*x,64+128*y);    
        }
        if(type==9) // blue key
        {
            drawKey(StdDraw.BLUE,64+128*x,64+128*y);
        }
        if(type==10) // yellow key
        {
            drawKey(StdDraw.YELLOW,64+128*x,64+128*y);
        }
        if(type==11) // red key
        {
            drawKey(StdDraw.RED,64+128*x,64+128*y);
        }
        if(type==12) // green key
        {
            drawKey(StdDraw.GREEN,64+128*x,64+128*y);
        }
        if(type==13) // locked special door
        {
            StdDraw.picture( 64+128*x, 64+128*y, "speciallock.png", 128, 128);
        }
        if(type==14) // locked blue door
        {
            StdDraw.picture( 64+128*x, 64+128*y, "bluelock.png", 128, 128);
        }
        if(type==15) // locked yellow door
        {
            StdDraw.picture( 64+128*x, 64+128*y, "yellowlock.png", 128, 128);
        }
        if(type==16) // locked red door
        {
            StdDraw.picture( 64+128*x, 64+128*y, "redlock.png", 128, 128);
        }
        if(type==17) // locked green door
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(64+128*x,64+128*y,64,64);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.setFont(defaultFont);
            StdDraw.text(64+128*x,64+128*y,"this is a locked green door");
        }
    }

    public static void drawItem(double x, double y) // draw the icon for an item on screen
    {
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.filledRectangle(64+128*x,20+128*y,8,12);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledRectangle(64+128*x,40+128*y,24,8);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledPolygon((new double[] {48+128*x,48+128*x,64+128*x,80+128*x,80+128*x}),(new double[] {48+128*y,96+128*y,112+128*y,96+128*y,48+128*y}));
        StdDraw.show();
    }

    public static void drawPlayer(int x, int y, int facing) // draw the player model on a specific tile
    {
        if(attacking) // if the player is swinging weapon
        {
            if(facing==1) // attacking down
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontsword.png", 128, 128);
            }
            if(facing==2) // attacking right
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightsword.png", 128, 128);
            }
            if(facing==3) // attacking up
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backsword.png", 128, 128);
            }
            if(facing==4) // attacking left
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftsword.png", 128, 128);
            }
        }
        else if(usingSitar) // if using sitar
        {
            if(facing==1) // sitar down
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontsitar.png", 128, 128);
            }
            if(facing==2) // sitar right
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightsitar.png", 128, 128);
            }
            if(facing==3) // sitar up
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backsitar.png", 128, 128);
            }
            if(facing==4) // sitar left
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftsitar.png", 128, 128);
            }
        }
        else if(usingSticks) // if using drumsticks
        {
            if(facing==1)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontdrum.png", 128, 128);
            }
            if(facing==2)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightdrum.png", 128, 128);
            }
            if(facing==3)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backdrum.png", 128, 128);
            }
            if(facing==4)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftdrum.png", 128, 128);
            }
        }
        else if(usingWingsUp) // if using wings up
        {
            if(facing==1)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontwingup.png", 128, 128);
            }
            if(facing==2)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightwingup.png", 128, 128);
            }
            if(facing==3)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backwingup.png", 128, 128);
            }
            if(facing==4)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftwingup.png", 128, 128);
            }
        }
        else if(usingWingsDown) // if using wings down
        {
            if(facing==1)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontwingdown.png", 128, 128);
            }
            if(facing==2)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightwingdown.png", 128, 128);
            }
            if(facing==3)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backwingdown.png", 128, 128);
            }
            if(facing==4)
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftwingdown.png", 128, 128);
            }
        }
        else // if player is normal
        {
            if(facing==1) // player facing forward
            {
                StdDraw.picture( 64+128*x, 64+128*y, "frontplayer.png", 128, 128);
            }
            if(facing==2) // facing right
            {
                StdDraw.picture( 64+128*x, 64+128*y, "rightplayer.png", 128, 128);
            }
            if(facing==3) // facing backwards player
            {
                StdDraw.picture( 64+128*x, 64+128*y, "backplayer.png", 128, 128);
            }
            if(facing==4) // left
            {
                StdDraw.picture( 64+128*x, 64+128*y, "leftplayer.png", 128, 128);
            }
        }
        if(playerCurrentHealth<playerMaxHealth&&playerCurrentHealth>-1) // display health bar if damage has been taken
        {
            double percentage=(double)playerCurrentHealth/(double)playerMaxHealth;
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledRectangle(64+128*x,120+128*y,32,4);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(32*(1+percentage)+128*x,120+128*y,32*percentage,4);
        }
    }

    public static void setCurrentRoom(int key) // sets the current room to the room corresponding with the entered key
    {
        for(int i=0;i<roomList.size();i++)
        {
            if(roomList.get(i).getCode()==key) // if the code is correct
            {
                currentRoom=roomList.get(i); // set the new room
            }
        }
    }

    public static Room getRoom(int code) // returns a room when given its code
    {
        for(int i=0;i<roomList.size();i++)
        {
            if(roomList.get(i).getCode()==code) // if code matches up
            {
                return roomList.get(i);
            }
        }
        return testRoom; // should never be accessed
    }

    public static Monster getMonster1() // repeat with other monsters once made
    {
        Monster monster=new Monster(testMonster.attack,testMonster.maxHealth,testMonster.movementSpeed,testMonster.attackType);
        return monster; // REPLACE WITH ACTUAL MONSTER 1
    }

    public static Monster getZeorgeMonster()
    {
        Monster monster=new Monster(zeorgeMonster.attack,zeorgeMonster.maxHealth,zeorgeMonster.movementSpeed,zeorgeMonster.attackType);
        return monster;
    }

    public static Monster getMonster2()
    {
        Monster monster=new Monster(monster2.attack,monster2.maxHealth,monster2.movementSpeed,monster2.attackType);
        return monster;
    }

    public static Monster getZingoMonster()
    {
        Monster monster=new Monster(zingoMonster.attack,zingoMonster.maxHealth,zingoMonster.movementSpeed,zingoMonster.attackType);
        return monster;
    }

    public static Monster getZaulMonster()
    {
        Monster monster=new Monster(zaulMonster.attack,zaulMonster.maxHealth,zaulMonster.movementSpeed,zaulMonster.attackType);
        return monster;
    }

    public static Monster getMonster3()
    {
        Monster monster=new Monster(monster3.attack,monster3.maxHealth,monster3.movementSpeed,monster3.attackType);
        return monster;
    }

    public static void switchMonsters() // switch to the next room's monsters
    {
        for(int i=0;i<threadList.size();i++)
        {
            threadList.get(i).interrupt();
        }
        threadList.clear();
        for(int i=0;i<currentRoom.getMonsters().size();i++)
        {
            threadList.add(new Thread(currentRoom.getMonsters().get(i)));
        }
        Monster.startMoving();
    }

    public static void startMonsters() // start threads
    {
        for(int i=0;i<threadList.size();i++)
        {
            if(!threadList.get(i).isAlive())
            {
                threadList.get(i).start();
            }
        }
    }

    public static String identifyEnvironment(int environmentCode) // returns an environment name via String for its code
    {
        if(environmentCode==1)
        {
            return "The Land of Submarines";
        }
        return "abc";
    }

    public static boolean checkMonsterAttack()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(currentRoom.getTiles()[i][j]>200&&currentRoom.getTiles()[i][j]<300)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void runTextBox(TextBox box, boolean sequence)
    {
        if(!sequence)
        {
            pauseThreads();
            switchMonsters();
        }
        StdDraw.setFont(textBoxFont);
        StdDraw.setPenRadius(.01);
        for(int i=0;i<box.getList().size();i++)
        {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(640,149.3333,597.3333,106.6667);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.rectangle(640,149.3333,597.3333,106.6667);
            StdDraw.text(640,215.4444,box.getList().get(i)[0]);
            if(box.getList().get(i)[1]!=null)
            {
                StdDraw.text(640,149.3333,box.getList().get(i)[1]);
            }
            if(box.getList().get(i)[2]!=null)
            {
                StdDraw.text(640,83.2222,box.getList().get(i)[2]);
            }
            StdDraw.show();
            while(!StdDraw.isKeyPressed(0x20)) {}
            while(StdDraw.isKeyPressed(0x20)) {}
        }
        displayRoom();
        if(!sequence)
        {
            startMonsters();
        }
    }

    public static boolean mouseInPolygon(double[] xCoordinates, double[] yCoordinates) // determine if the mouse is inside of a polygon with given x and y values
    {
        int numCrosses=0;
        double slope=0;
        double leftX=0;
        double rightX=0;
        double leftY=0;
        double rightY=0;
        boolean undefined=false;
        double firstX=0;
        double firstY=0;
        double secondX=0;
        double secondY=0;
        for(int i=0;i<xCoordinates.length;i++)
        {
            if(i==xCoordinates.length-1) // if the last coordinate in the list, set first coordiantes in list to second set
            {
                firstX=xCoordinates[i];
                firstY=yCoordinates[i];
                secondX=xCoordinates[0];
                secondY=yCoordinates[0];
            }
            else // set pairs of coordinates
            {
                firstX=xCoordinates[i];
                firstY=yCoordinates[i];
                secondX=xCoordinates[i+1];
                secondY=yCoordinates[i+1];
            }
            undefined=false;
            if(firstX<secondX) // determine which x coordinate is farthest to the left
            {
                leftX=firstX;
                leftY=firstY;
                rightX=secondX;
                rightY=secondY;
            }
            else if(secondX<firstX)
            {
                leftX=secondX;
                leftY=secondY;
                rightX=firstX;
                rightY=firstY;
            }
            else // if even, undefined slope
            {
                undefined=true;
            }
            if((leftX<=StdDraw.mouseX()&&rightX>=StdDraw.mouseX())&&!undefined) // if mouse is between the vertical lines through the x's
            {
                slope=(leftY-rightY)/(leftX-rightX); // determine slope of line between points
                if(leftY+(StdDraw.mouseX()-leftX)*slope>=StdDraw.mouseY()) // if the mouse's y is below or on the line, count as its vertical line crossing the point's line
                {
                    numCrosses++;
                }
            }
        }
        if(numCrosses%2==1) // if it crosses an odd number of times, it is inside the shape
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}