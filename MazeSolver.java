public class MazeSolver extends Maze{


  public static String solve(Maze local){
    if(local.explorerIsOnA() != TREASURE){
       local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      branching(local);
      retrace(local);
      solve(local);
    }
    else{
      return local.toString();
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
    if(local.copy.add(1,0) && copy.add(0,1) != null ||
       copy.add(1,0) && copy.add(0,-1) != null ||
       copy.add(1,0) && copy.add(-1,0) != null ||
       copy.add(-1,0) && copy.add(0,1) != null ||
       copy.add(-1,0) && copy.add(0,-1) != null ||
       copy.add(0,1) && copy.add(0,-1))
    {local.trace = new Vector(local.explorerPosition);}
  }
  
  public static void retrace(Maze local){
    if(direction != -1){go(explorable(local));}
	  else{
	  	local.explorerPosition = new Vector(local.trace);
	  }
  }
}
