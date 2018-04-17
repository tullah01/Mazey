public class MazeSolver extends Maze{

public int traceSteps = 3;
	
	public MazeSolver{}

  public static String solve(Maze local){
    if(local.explorerIsOnA() != TREASURE){
      local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      branching(local);
      local.retrace();
      solve(local);
    }
    else{
      return local.toString() + System.lineSeparator() + "This Maze is explored!";
    }
      return local.toString();
  }
  
  public static int explorable(Maze local){
    if(local.explorerPosition.add(0,1) != null && 
      local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
      return EAST;
    }
    else if(local.explorerPosition.add(1,0) != null && 
      local.maze[local.explorerPosition.rank + 1][local.explorerPosition.file] != EXPLORED){  
      return NORTH;
    }
        else if(local.explorerPosition.add(0,-1) != null && 
       local.maze[local.explorerPosition.rank][local.explorerPosition.file - 1] != EXPLORED){
      return WEST;
    }
        else if(local.explorerPosition.add(-1,0) != null && 
       local.maze[local.explorerPosition.rank - 1][local.explorerPosition.file] != EXPLORED){
      return SOUTH;
    }
      else{
        return -1;
      }

}

public static void branching(Maze local){
    if(local.explorerPosition.wrap(1,0) != null && local.explorerPosition.wrap(0,1) != null ||
       local.explorerPosition.wrap(1,0) != null && local.explorerPosition.wrap(0,-1) != null ||
       local.explorerPosition.wrap(1,0) != null && local.explorerPosition.wrap(-1,0) != null ||
       local.explorerPosition.wrap(-1,0) != null && local.explorerPosition.wrap(0,1) != null ||
       local.explorerPosition.wrap(-1,0) != null && local.explorerPosition.wrap(0,-1) != null ||
       local.explorerPosition.wrap(0,1) != null && local.explorerPosition.wrap(0,-1) != null)
    {local.dropA(traceSteps);}
  }
   /* 
  public void retrace(){
    if(MazeSolver.explorable(this) != -1){go(MazeSolver.explorable(this));}
	  else{
	  	explorerPosition = new Vector(trace);
	  }
  }
  }
  */

}
