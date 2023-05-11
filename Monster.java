public class Monster implements Runnable
{
    public static boolean keepMoving=true;
    public static boolean alwaysTrue=true;

    public void run() // method when thread is started
    {
        while(alwaysTrue) // alwasy stay in until thread is interrupted
        {
            while(keepMoving) // boolean to start and stop monster movement before thread interruption
            {
                try
                { // wait a time between movements based upon movement speed
                    Thread.sleep(3000/movementSpeed+(int)(300*Math.random()));
                } catch(InterruptedException ie)
                {
                    alwaysTrue=false;
                    break;
                }
                moveMonster();
                attackAttempt();
            }
        }
        alwaysTrue=true;
    }

    public int attack=0; // monster's attack power
    public int maxHealth=0; // maximum health
    public int remainingHealth=0;
    public int movementSpeed=0;
    public int xTile=0; // current position on screen
    public int yTile=0;
    public int attackType=0;
    public Monster(int attackValue, int healthValue, int movementSpeedValue, int attackTypeValue)
    {
        attack=attackValue;
        maxHealth=healthValue;
        remainingHealth=healthValue;
        movementSpeed=movementSpeedValue;
        attackType=attackTypeValue;
    }

    public void moveMonster() // moves the monster on the screen
    {
        int monsterCode=0;
        double randomMovement=Math.random();
        if(randomMovement<.25)
        {
            if(FinalGameCode.currentRoom.getTiles()[xTile][yTile+1]==1&&yTile<4&&!(xTile==FinalGameCode.playerX&&yTile+1==FinalGameCode.playerY))
            {
                monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile];
                FinalGameCode.currentRoom.setTile(xTile,yTile,1);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=0;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=0;
                yTile++;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=remainingHealth;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=maxHealth;
            }
        }
        if(randomMovement>=.25&&randomMovement<.5)
        {
            if(FinalGameCode.currentRoom.getTiles()[xTile+1][yTile]==1&&xTile<8&&!(xTile+1==FinalGameCode.playerX&&yTile==FinalGameCode.playerY))
            {
                monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile];
                FinalGameCode.currentRoom.setTile(xTile,yTile,1);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=0;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=0;
                xTile++;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=remainingHealth;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=maxHealth;
            }
        }
        if(randomMovement>=.5&&randomMovement<.75)
        {
            if(FinalGameCode.currentRoom.getTiles()[xTile][yTile-1]==1&&yTile>1&&!(xTile==FinalGameCode.playerX&&yTile-1==FinalGameCode.playerY))
            {
                monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile];
                FinalGameCode.currentRoom.setTile(xTile,yTile,1);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=0;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=0;
                yTile--;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=remainingHealth;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=maxHealth;
            }
        }
        if(randomMovement>=.75)
        {
            if(FinalGameCode.currentRoom.getTiles()[xTile-1][yTile]==1&&xTile>1&&!(xTile-1==FinalGameCode.playerX&&yTile==FinalGameCode.playerY))
            {
                monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile];
                FinalGameCode.currentRoom.setTile(xTile,yTile,1);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=0;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=0;
                xTile--;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode);
                FinalGameCode.currentRoom.remainingMap[xTile][yTile]=remainingHealth;
                FinalGameCode.currentRoom.maxMap[xTile][yTile]=maxHealth;
            }
        }
        FinalGameCode.displayRoom();
    }

    public void attackAttempt()
    {
        if(attackType==1&&xTile<=FinalGameCode.playerX+1&&xTile>=FinalGameCode.playerX-1&&yTile<=FinalGameCode.playerY+1&&yTile>=FinalGameCode.playerY-1) // if player is in range of this monster
        {
            if(Math.random()>.5) // 50% chance to attack
            {
                int monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile]+100;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode); // change monster to attack sprite
                FinalGameCode.displayRoom();
                try {
                    Thread.sleep(1000); // hold sprite for time
                } catch (InterruptedException e) {
                    System.out.println(e);
                    FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode-100);
                    Thread.currentThread().interrupt();
                }
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode-100);
                FinalGameCode.displayRoom();
                if(xTile<=FinalGameCode.playerX+1&&xTile>=FinalGameCode.playerX-1&&yTile<=FinalGameCode.playerY+1&&yTile>=FinalGameCode.playerY-1)
                {
                    int playerHealth=FinalGameCode.takeHit(attack);
                    if(playerHealth<1) // hit the player and if out of health, dead
                    {
                        FinalGameCode.alive=false;
                    }
                }
                FinalGameCode.displayRoom();
            }
        }
        if(attackType==2&&(xTile==FinalGameCode.playerX||yTile==FinalGameCode.playerY))
        {
            if(Math.random()>.25)
            {
                int monsterCode=FinalGameCode.currentRoom.getTiles()[xTile][yTile]+100;
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode);
                FinalGameCode.displayRoom();
                try {
                    Thread.sleep(1000); // hold sprite for time
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
                for(int i=0;i<10;i++)
                {
                    FinalGameCode.drawTile(i,yTile,26,0);
                }
                for(int i=0;i<6;i++)
                {
                    FinalGameCode.drawTile(xTile,i,26,0);
                }
                if(xTile==FinalGameCode.playerX||yTile==FinalGameCode.playerY)
                {
                    int playerHealth=FinalGameCode.takeHit(attack);
                    if(playerHealth<1)
                    {
                        FinalGameCode.alive=false;
                    }
                }
                StdDraw.show();
                try {
                    Thread.sleep(200); // hold sprite for time
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
                FinalGameCode.currentRoom.setTile(xTile,yTile,monsterCode-100);
                FinalGameCode.displayRoom();
            }
        }
    }

    public int getX()
    {
        return xTile;
    }

    public int getY()
    {
        return yTile;
    }

    public void setCoords(int x, int y) // set coordinates of the monster
    {
        xTile=x;
        yTile=y;
    }

    public static void stopMoving() // stop thread's while loop which moves the monster
    {
        keepMoving=false;
    }

    public static void startMoving() // restart while loop
    {
        keepMoving=true;
    }

    public int getRemainingHealth()
    {
        return remainingHealth;
    }
    public void setRemainingHealth(int health) // set health
    {
        remainingHealth=health;
    }
}
