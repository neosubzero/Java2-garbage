import java.util.*;
import java.io.Serializable;
import java.io.*;

/*****************************************************************
 * Game TUI:
 * 
 * Description:
 * 
 ***************************************************************/


public class GameTUI implements Serializable
{
	private Action action;
    private Config itsConfig;
    private Dungeon itsDungeon;

    public GameTUI (Config c, Dungeon d) {

        itsConfig = c;
        itsDungeon = d;
    }
	
    // this is the main loop - very little logic here in the TUI
    // but all the input and output should be controlled from here	
    public void run() {
        while (itsDungeon.getHero().getHealth() > 0)
        {
            //clear previous screen 
            StdDraw.clear();
            
            //draw the game world
            //drawScreen();
            itsDungeon.draw();

            String heroMenu = itsConfig.setupHeroText(itsDungeon.getHero());
            StdDraw.drawText(heroMenu);
            String monsterMenu = itsConfig.setupMonsterText(itsDungeon.getAdjacentMonsters());
            StdDraw.drawText(monsterMenu);
        
            //Get player's action from input
            String userInput = StdIn.readString();
            Action action = itsConfig.mapKeyToAction(userInput);
            
            //Execute player's action and Update game 
            itsDungeon.execute(action);
        }
        StdDraw.drawText("You died!\n");
    }//end run

    public void drawScreen() {
        // Draw game map!
        StdDraw.initGameMap(itsDungeon.getWidth(), itsDungeon.getHeight());
        drawDungeon();
        drawHero();
        drawMonsters();
        //Render display
        StdDraw.draw(); //change to call called render
    }

    public void drawDungeon() {
        Cell[][] map = itsDungeon.getMap();
        for (int i=0;i<itsDungeon.getWidth();i++) 
        {
             for (int j=0;j<itsDungeon.getHeight();j++)
             {
                   map[i][j].draw(itsConfig, i,j);
             }
        }
    }

    //Draw hero
    public void drawHero() {
        Cell[][] map = itsDungeon.getMap();
        Hero stanley = itsDungeon.getHero();
        Tile heroTile = map[stanley.getX()][stanley.getY()].getTile();  //Get background tile
        stanley.draw(heroTile);                                      //Draw hero ontop that background
    }

    //Draw monsters
    public void drawMonsters() {
        Cell[][] map = itsDungeon.getMap();
        ArrayList<Monster> monsters = itsDungeon.getMonsters();
        for (Monster creature: monsters)
        {
            Tile monsterTile = map[creature.getX()][creature.getY()].getTile();  //Get background tile  
            creature.draw(monsterTile);
        }
    }
	
	//Save game state
	public void saver() {
		try  
		{
			FileOutputStream fileOut = new FileOutputStream("SavedGame.dat");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(itsDungeon);
			objOut.close();
			fileOut.close();
			
		}
		catch (IOException e) {
			System.out.println("Could not create file");
		}
		catch (NoSuchElementException e) {
			
		} 
		catch (NullPointerException e) {
			
		}
	}
	
	//Load game state
	public void loader() {
		InputStream file;
		try
		{
			FileInputStream fileIn = new FileInputStream("SavedGame.dat");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			itsDungeon = (Dungeon)objIn.readObject();
			objIn.close();
			fileIn.close();
		}
		catch (IOException e) {
			System.out.println("Could not load file");
		}
		catch (NoSuchElementException e) {
			System.out.println("Saved file does not exist");
		}
		catch (ClassNotFoundException e) {
			
		}
		catch (NullPointerException e) {
			
		}
	}

    
}//end GameTUI
