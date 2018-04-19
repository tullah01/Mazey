


   public MazeSolver( Displayer displayer) {


       this.displayer = displayer;


   }












   // list of ways to extend a candidate


   private final static int[] DIRECTIONS =  {


                                               Maze.EAST,


                                               Maze.NORTH,


                                               Maze.WEST,


                                               Maze.SOUTH,


                                            };












   /**


     @return the Boolean value of the statement


                There is a path from the explorer's current position in


                @maze to treasure.


     Modifies @maze.


    */


   public boolean solutionExists( Maze candidate) {







       // display maze, optionally


       if( displayer != null)


           displayer.atTopOfWindow( candidate


               + String.format(" %5d moves", displayCount++)


               + System.lineSeparator());







       // base cases


       if( candidate.explorerIsOnA() == Maze.WALL)     return false;


       if( candidate.explorerIsOnA() == Maze.TREASURE) return true;







       // recursive case: explorer is on a stepping stone


       Maze snapshot = new Maze( candidate);


       for( int look : DIRECTIONS) {


           candidate.dropA( Maze.WALL);  /* so recursive abstractions won't


              recursively check here, leading to an infinite recursion */







           candidate.go( look);


           if( solutionExists( candidate)) return true;







           /* No solution in that direction. Prepare to look in another


              direction. Cannot always go() back, because the explorer


              might have tried to step out of the maze.


            */


           candidate = new Maze( snapshot);


       }


       return false;


   }


}
