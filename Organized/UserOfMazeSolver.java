public class UserOfMazeSolver{
    private static Displayer displayer;

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();
        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());

        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
		        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
        System.out.println(MazeSolver.explore(maze));
		System.out.println(maze);
		
    }

}

