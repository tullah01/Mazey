


public class UserOfMazeSolver {


  


   public static void main(String[] commandLine){

        Displayer displayer = null;
try{
        if( commandLine.length >= 4)


        displayer = new Displayer( Integer.parseInt( commandLine[3]));

       MazeSolver solver = new MazeSolver( displayer);

       Maze maze = new Maze( commandLine[0]


                           , Integer.parseInt( commandLine[1])


                           , Integer.parseInt( commandLine[2])


                           );
}
  catch(java.io.FileNotFoundException haha){
       System.out.println("JVM can't detect the file, try again.");
       System.exit();
  }
       System.out.println(


             "Boolean value of \"Found a path to treasure\": "


           + solver.solutionExists( maze));    }

   


}
