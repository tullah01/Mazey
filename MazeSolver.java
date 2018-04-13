public class MazeSolver extends Maze{


  public static String solve(Maze local){
    if(local.explorerIsOnA() != TREASURE){
      branching(local);
      explorable(local);
      solve(local);
    }
    else{
      return local.toString();
    }
	return local.toString();
  }
  
  public static int explorable(Maze local){
    if(local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != WALL && 
       local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
      local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      return EAST;
    }
    else if(local.maze[local.explorerPosition.rank - 1][local.explorerPosition.file] != WALL && 
       local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
      local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;    
      return NORTH;
    }
        else if(local.maze[local.explorerPosition.rank][local.explorerPosition.file - 1] != WALL && 
       local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
       local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      return WEST;
    }
        else if(local.maze[local.explorerPosition.rank + 1][local.explorerPosition.file] != WALL && 
       local.maze[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
            local.maze[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
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
    {local.trace;}
  }
  
  public static void retrace(Maze local){
   
  }
}
