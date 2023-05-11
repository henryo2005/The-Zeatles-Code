public class Item
{
    int spawnRoomCode=0; // code of room this item spawns in
    int spawnX=0; // x coordinate of this item in spawn room
    int spawnY=0; // y coordinate
    boolean obtained=false; // has the item been picked up
    int attackType=0; // identification number for attack type of item
    String title=""; // name of item
    int attackPower=0;

    public Item(int roomCode, int x, int y, int type, String titleOfItem, int attack)
    {
        spawnRoomCode=roomCode;
        spawnX=x;
        spawnY=y;
        attackType=type;
        title=titleOfItem;
        attackPower=attack;
    }
    
    public int getAttackType()
    {
        return attackType;
    }

    public boolean getObtained()
    {
        return obtained;
    }

    public int getRoomCode()
    {
        return spawnRoomCode;
    }

    public int getX()
    {
        return spawnX;
    }

    public int getY()
    {
        return spawnY;
    }

    public String getTitle()
    {
        return title;
    }
}
