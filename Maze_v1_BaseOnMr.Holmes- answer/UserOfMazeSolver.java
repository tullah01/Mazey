


public class UserOfMazeSolver {


  


   public static void main(String[] commandLine)


       throws java.io.FileNotFoundException {







       Displayer displayer = null;


      


       // init displayer if command line arg for window height is present


       if( commandLine.length >= 4)


           displayer = new Displayer( Integer.parseInt( commandLine[3]));







       MazeSolver solver = new MazeSolver( displayer);







       Maze maze = new Maze( commandLine[0]


                           , Integer.parseInt( commandLine[1])


                           , Integer.parseInt( commandLine[2])


                           );


       System.out.println(


             "Boolean value of \"Found a path to treasure\": "


           + solver.solutionExists( maze));    }


}
