// interact with locked doors to make unlock doors and remove one key, scroller on menu to view all keys, find on ground like items
import java.util.*;

public class Key
{
    public int type=0; // type of key i.e. special or blue, yellow etc.
    public int spawnRoom=0; // code of room the key spawns in
    public int x=0; // place it spawns on the screen
    public int y=0;
    public int door1Room=0; // room code for one of the doors if a special key
    public int door1X=0; // coords for first door
    public int door1Y=0;
    public int door2Room=0; // second if special
    public int door2X=0; // coords for second
    public int door2Y=0;
    public static ArrayList<int[]> blueDoors=new ArrayList<int[]>(); // list of blue doors (door 1 room code, door 1 x, door 1 y, door 2 room code, door 2 x, door 2 y)
    public static ArrayList<int[]> yellowDoors=new ArrayList<int[]>(); // yellow
    public static ArrayList<int[]> redDoors=new ArrayList<int[]>(); // red
    public static ArrayList<int[]> greenDoors=new ArrayList<int[]>(); // green

    public Key(int keyType, int spawnRoomCode, int spawnX, int spawnY) // constructor for colored doors
    {
        type=keyType;
        spawnRoom=spawnRoomCode;
        x=spawnX;
        y=spawnY;
    }

    public Key(int keyType, int spawnRoomCode, int spawnX, int spawnY, int doorRoomCode, int xOfDoor, int yOfDoor) // constructor for special doors
    {
        type=keyType;
        spawnRoom=spawnRoomCode;
        x=spawnX;
        y=spawnY;
        door1Room=doorRoomCode;
        door1X=xOfDoor;
        door1Y=yOfDoor;
    }

    public void setupKey() // align doors
    {
        if(door1X==0) // if door is on the left of the room, set west room's corresponding door to the door 2
        {
            door2Room=FinalGameCode.getRoom(door1Room).getWest();
            door2X=9;
            door2Y=door1Y;
        }
        if(door1X==9) // right -> east
        {
            door2Room=FinalGameCode.getRoom(door1Room).getEast();
            door2X=0;
            door2Y=door1Y;
        }
        if(door1Y==0) // bottom -> south
        {
            door2Room=FinalGameCode.getRoom(door1Room).getSouth();
            door2X=door1X;
            door2Y=5;
        }
        if(door1Y==5) // top -> north
        {
            door2Room=FinalGameCode.getRoom(door1Room).getNorth();
            door2X=door1X;
            door2Y=0;
        }
    }

    public int getSpawnRoomCode()
    {
        return spawnRoom;
    }

    public int getSpawnX()
    {
        return x;
    }

    public int getSpawnY()
    {
        return y;
    }

    public int getType()
    {
        return type;
    }

    public int[] getDoorCode()
    {
        return new int[] {door1Room,door2Room};
    }

    public int[] getDoorX()
    {
        return new int[] {door1X,door2X};
    }
    
    public int[] getDoorY()
    {
        return new int[] {door1Y,door2Y};
    }
}