public class StorySequence
{
    public int code=0;
    public int[][] zohnCoords=null;
    public int[][] zaulCoords=null;
    public int[][] zeorgeCoords=null;
    public int[][] zingoCoords=null;
    public TextBox text=null;

    public StorySequence(int roomCode, TextBox textBox, int[][] zohnsCoords, int[][] zaulsCoords, int[][] zeorgesCoords, int[][] zingosCoords)
    {
        code=roomCode;
        text=textBox;
        zohnCoords=zohnsCoords;
        zaulCoords=zaulsCoords;
        zeorgeCoords=zeorgesCoords;
        zingoCoords=zingosCoords;
    }

    public void go()
    {
        if(zohnCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zohnCoords[0][0],zohnCoords[0][1],18);
        }
        if(zaulCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zaulCoords[0][0],zaulCoords[0][1],19);
        }
        if(zeorgeCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zeorgeCoords[0][0],zeorgeCoords[0][1],20);
        }
        if(zingoCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zingoCoords[0][0],zingoCoords[0][1],21);
        }
        FinalGameCode.displayRoom();
        int moveCount=1;
        while((zohnCoords!=null&&zohnCoords.length>moveCount)||(zaulCoords!=null&&zaulCoords.length>moveCount)||(zeorgeCoords!=null&&zeorgeCoords.length>moveCount)||(zingoCoords!=null&&zingoCoords.length>moveCount))
        {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if(zohnCoords!=null)
            {
                if(zohnCoords.length>moveCount)
                {
                    FinalGameCode.currentRoom.setTile(zohnCoords[moveCount][0],zohnCoords[moveCount][1],18);
                    if((!(zohnCoords[moveCount-1][0]==zohnCoords[moveCount][0]&&zohnCoords[moveCount-1][1]==zohnCoords[moveCount][1]))&&FinalGameCode.currentRoom.getTiles()[zohnCoords[moveCount-1][0]][zohnCoords[moveCount-1][1]]!=19&&FinalGameCode.currentRoom.getTiles()[zohnCoords[moveCount-1][0]][zohnCoords[moveCount-1][1]]!=20&&FinalGameCode.currentRoom.getTiles()[zohnCoords[moveCount-1][0]][zohnCoords[moveCount-1][1]]!=21)
                    {
                        FinalGameCode.currentRoom.setTile(zohnCoords[moveCount-1][0],zohnCoords[moveCount-1][1],1);
                    }
                }
            }
            if(zaulCoords!=null)
            {
                if(zaulCoords.length>moveCount)
                {
                    FinalGameCode.currentRoom.setTile(zaulCoords[moveCount][0],zaulCoords[moveCount][1],19);
                    if((!(zaulCoords[moveCount-1][0]==zaulCoords[moveCount][0]&&zaulCoords[moveCount-1][1]==zaulCoords[moveCount][1]))&&FinalGameCode.currentRoom.getTiles()[zaulCoords[moveCount-1][0]][zaulCoords[moveCount-1][1]]!=18&&FinalGameCode.currentRoom.getTiles()[zaulCoords[moveCount-1][0]][zaulCoords[moveCount-1][1]]!=20&&FinalGameCode.currentRoom.getTiles()[zaulCoords[moveCount-1][0]][zaulCoords[moveCount-1][1]]!=21)
                    {
                        FinalGameCode.currentRoom.setTile(zaulCoords[moveCount-1][0],zaulCoords[moveCount-1][1],1);
                    }
                }
            }
            if(zeorgeCoords!=null)
            {
                if(zeorgeCoords.length>moveCount)
                {
                    FinalGameCode.currentRoom.setTile(zeorgeCoords[moveCount][0],zeorgeCoords[moveCount][1],20);
                    if((!(zeorgeCoords[moveCount-1][0]==zeorgeCoords[moveCount][0]&&zeorgeCoords[moveCount-1][1]==zeorgeCoords[moveCount][1]))&&FinalGameCode.currentRoom.getTiles()[zeorgeCoords[moveCount-1][0]][zeorgeCoords[moveCount-1][1]]!=18&&FinalGameCode.currentRoom.getTiles()[zeorgeCoords[moveCount-1][0]][zeorgeCoords[moveCount-1][1]]!=19&&FinalGameCode.currentRoom.getTiles()[zeorgeCoords[moveCount-1][0]][zeorgeCoords[moveCount-1][1]]!=21)
                    {
                        FinalGameCode.currentRoom.setTile(zeorgeCoords[moveCount-1][0],zeorgeCoords[moveCount-1][1],1);
                    }
                }
            }
            if(zingoCoords!=null)
            {
                if(zingoCoords.length>moveCount)
                {
                    FinalGameCode.currentRoom.setTile(zingoCoords[moveCount][0],zingoCoords[moveCount][1],21);
                    if((!(zingoCoords[moveCount-1][0]==zingoCoords[moveCount][0]&&zingoCoords[moveCount-1][1]==zingoCoords[moveCount][1]))&&FinalGameCode.currentRoom.getTiles()[zingoCoords[moveCount-1][0]][zingoCoords[moveCount-1][1]]!=18&&FinalGameCode.currentRoom.getTiles()[zingoCoords[moveCount-1][0]][zingoCoords[moveCount-1][1]]!=19&&FinalGameCode.currentRoom.getTiles()[zingoCoords[moveCount-1][0]][zingoCoords[moveCount-1][1]]!=20)
                    {
                        FinalGameCode.currentRoom.setTile(zingoCoords[moveCount-1][0],zingoCoords[moveCount-1][1],1);
                    }
                }
            }
            FinalGameCode.displayRoom();
            moveCount++;
        }
        FinalGameCode.runTextBox(text,true);
        if(zohnCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zohnCoords[zohnCoords.length-1][0],zohnCoords[zohnCoords.length-1][1],1);
        }
        if(zaulCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zaulCoords[zaulCoords.length-1][0],zaulCoords[zaulCoords.length-1][1],1);
        }
        if(zeorgeCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zeorgeCoords[zeorgeCoords.length-1][0],zeorgeCoords[zeorgeCoords.length-1][1],1);
        }
        if(zingoCoords!=null)
        {
            FinalGameCode.currentRoom.setTile(zingoCoords[zingoCoords.length-1][0],zingoCoords[zingoCoords.length-1][1],1);
        }
        FinalGameCode.displayRoom();
    }
}