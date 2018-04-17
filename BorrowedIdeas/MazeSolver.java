//maze solver solves the mazes provided by UserOfMazeSolver
public class MazeSolver{
  private static final int[] directions= {Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};
  private static Displayer displayer;

  public static void display(int l){
    displayer = new Displayer(l);
}
public static boolean solver(Maze solvethis){
    //base case
    if (solvethis.explorerIsOnA() == Maze.WALL){
	
      return false;
    }
    //base case
    else if (solvethis.explorerIsOnA() == Maze.TREASURE){
	
        return true;
      }
    
    else
	
    //recrusive abstraction
    for(int direction:directions){
       //checks each of the directions by alternating between the four
	
       solvethis.dropA(Maze.3);  //makes sure that the explorer doesn't go back the same way.
       
       Maze snapshot = new Maze(solvethis); // takes a picture for the explorer to return to, just in case it steps outside the maze
       
       solvethis.go(direction);//moves the explorer
       
       if (solver(solvethis)==false){
	   
         //recursive backtracking
	   solvethis = new Maze(snapshot);} //resets the maze to its previous form
       
       else
	   
          return true;}
    
        return false;
      }

    }
