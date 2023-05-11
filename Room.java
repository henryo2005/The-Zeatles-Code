import java.util.*;
public class Room
{
    public int code=0; // identification code for this room
    public int northCode=0; // id code for north room
    public int eastCode=0; // for east room
    public int southCode=0; // for south room
    public int westCode=0; // for west room
    public int[][] tiles=new int[10][6]; // 2d array of the tiles in the room
    public int[][] remainingMap=new int[][] {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
    public int[][] maxMap=new int[][] {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
    public int environment=0; // id code for the aesthetic environment of this code
    public ArrayList<Monster> monstersInRoom=new ArrayList<Monster>(); // list of monsters in room
    public ArrayList<Integer> healthOfMonsters=new ArrayList<Integer>(); // list of healths of monsters
    public boolean firstEntry=true;

    public Room(int roomCode, int northRoomCode, int eastRoomCode, int southRoomCode, int westRoomCode, int[][] tileLayout, int roomEnvironment)
    {
        code=roomCode;
        northCode=northRoomCode;
        eastCode=eastRoomCode;
        southCode=southRoomCode;
        westCode=westRoomCode;
        tiles=tileLayout;
        environment=roomEnvironment;
        updateMonsterList(false);
    }

    public int getCode()
    {
        return code;
    }

    public int getNorth()
    {
        return northCode;
    }

    public int getEast()
    {
        return eastCode;
    }

    public int getSouth()
    {
        return southCode;
    }

    public int getWest()
    {
        return westCode;
    }

    public int[][] getTiles()
    {
        return tiles;
    }

    public void setTile(int x, int y, int type) // set a given tile to a new type
    {
        tiles[x][y]=type;
    }

    public int getEnvironment()
    {
        return environment;
    }

    public ArrayList<Monster> getMonsters()
    {
        return monstersInRoom;
    }

    public void killMonster(int x, int y) // remove a monster at the given coordinates
    {
        int foundMonster=-1;
        for(int i=0;i<monstersInRoom.size();i++)
        {
            if(monstersInRoom.get(i).getX()==x&&monstersInRoom.get(i).getY()==y)
            {
                foundMonster=i;
            }
        }
        if(foundMonster!=-1)
        {
            while(FinalGameCode.checkMonsterAttack()){}
            monstersInRoom.remove(foundMonster);
            setTile(x,y,1);
            if(Math.random()>.5)
            {
                FinalGameCode.playerCurrentHealth++;
                FinalGameCode.playerMaxHealth++;
            }
            FinalGameCode.pauseThreads();
            FinalGameCode.switchMonsters();
            FinalGameCode.pauseThreads();
            Monster.startMoving();
            FinalGameCode.startMonsters();
            FinalGameCode.displayRoom();
        }
    }

    public void updateMonsterList(boolean preserveHealth) // change monster list with new coordinates
    {
        int monstersAdded=-1;
        int[][] tempTiles=tiles;
        if(preserveHealth) // if entering menu then save the healths
        {
            healthOfMonsters.clear();
            for(int i=0;i<10;i++)
            {
                for(int j=0;j<6;j++)
                {
                    if(tempTiles[i][j]>100&&tempTiles[i][j]<1000)
                    {
                        for(int k=0;k<monstersInRoom.size();k++)
                        {
                            if(monstersInRoom.get(k).getX()==i&&monstersInRoom.get(k).getY()==j)
                            {
                                healthOfMonsters.add(monstersInRoom.get(k).getRemainingHealth()); // set the healths in the arraylist
                            }
                        }
                    }
                }
            }
        }
        monstersInRoom.clear(); // reset list of monsters
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(tempTiles[i][j]==101) // if the tile indicates a monster 1, add to list and update coordinates
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getMonster1());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth) // set health to what it had been if menu opened
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
                if(tempTiles[i][j]==102) // zeorge
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getZeorgeMonster());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth)
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
                if(tempTiles[i][j]==103) // monster 2
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getMonster2());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth)
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
                if(tempTiles[i][j]==104) // zingo
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getZingoMonster());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth)
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
                if(tempTiles[i][j]==105) // zaul
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getZaulMonster());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth)
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
                if(tempTiles[i][j]==106) // monster 3
                {
                    monstersAdded++;
                    monstersInRoom.add(FinalGameCode.getMonster3());
                    monstersInRoom.get(monstersInRoom.size()-1).setCoords(i, j);
                    if(preserveHealth)
                    {
                        monstersInRoom.get(monstersInRoom.size()-1).setRemainingHealth(healthOfMonsters.get(monstersAdded));
                    }
                }
            }   
        }
    }
}