//provides the test mazes which will test the base case, minimum recrusive abstraction case, and a larger case
public class UserOfMazeSolver {
	private static Displayer displayer;

  public static void main( String[] commandLine)

	throws java.io.FileNotFoundException {

  	Maze maze = new Maze( commandLine[0], Integer.parseInt( commandLine[1]), Integer.parseInt( commandLine[2])
                            );

    int Length =  Integer.parseInt(commandLine[2]);
    //parses through the user input
    baseCase (maze, Length);
  }

private static void baseCase (Maze maze, int displayLength){

      MazeSolver.display(displayLength);

      System.out.println(MazeSolver.solver(maze));

    }
	}
