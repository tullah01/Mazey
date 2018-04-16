public class MazeSolver extends Maze{

	int whatever;

	public MazeSolver(){
		whatever = 1;
	}

	public static String solve(Maze local){
		return "1";
	}

	public static int explore(Maze local){
		local.go(EAST);
		
		if(local.explorerIsOnA() == WALL || local.explorerIsOnA() == 3){
			local.go(WEST);
			local.go(NORTH);
			if(local.explorerIsOnA() == WALL || local.explorerIsOnA() == 3){
				local.go(SOUTH);
				local.go(WEST);
				if(local.explorerIsOnA() == WALL || local.explorerIsOnA() == 3){
					local.go(EAST);
					local.go(SOUTH);
					if(local.explorerIsOnA() == WALL || local.explorerIsOnA() == 3){
						return -1;
					}
					else{
						local.dropA(3);
					}
				}else{
					local.dropA(3);
				}
			}else{
				local.dropA(3);
			}		
		}else{
			local.dropA(3);
		}
		return 1;
	}
}
