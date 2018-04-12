public class MazeSolver extends Maze{
  
  public static String solve(Maze local){
    if(local.explorerIsOnA() != TREASURE){
      branching(local);
      go(local);
      solve(local);
    }
    else{
      return local.toString();
    }
  }
  
  public static int explorable(Maze local){
    if(local[local.explorerPosition.rank][local.explorerPosition.file + 1] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
      local[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      return EAST;
    }
    else if(local[local.explorerPosition.rank - 1][local.explorerPosition.file] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
      local[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;    
      return NORTH;
    }
        else if(local[local.explorerPosition.rank][local.explorerPosition.file - 1] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
       local[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      return WEST;
    }
        else if(local[local.explorerPosition.rank + 1][local.explorerPosition.file] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != EXPLORED){
            local[local.explorerPosition.rank][local.explorerPosition.file] = EXPLORED;
      return SOUTH;
    }
      else{
        return -1;
      }
  }
  
  public static void branching(Maze local){
    if(local[local.explorerPosition.rank][local.explorerPosition.file + 1] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file - 1] != WALL ||
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != WALL && 
       local[local.explorerPosition.rank - 1][local.explorerPosition.file] != WALL ||
       local[local.explorerPosition.rank][local.explorerPosition.file + 1] != WALL && 
       local[local.explorerPosition.rank + 1][local.explorerPosition.file] != WALL ||
       local[local.explorerPosition.rank - 1][local.explorerPosition.file] != WALL && 
       local[local.explorerPosition.rank + 1][local.explorerPosition.file] != WALL ||
       local[local.explorerPosition.rank - 1][local.explorerPosition.file] != WALL && 
       local[local.explorerPosition.rank ][local.explorerPosition.file - 1] != WALL ||
       local[local.explorerPosition.rank + 1][local.explorerPosition.file] != WALL && 
       local[local.explorerPosition.rank][local.explorerPosition.file - 1] != WALL ||)
    {local[local.explorerPosition.rank][local.explorerPosition.file] = 7;}
  }
  
  public static void retrace(Maze local){
   
  }
}