public class Maze{
	public String[][] layout;
	
	public Maze(){
		this.defaultInitialize();
	}

	public Maze(int size){
		layout = new String[size][size];
	}

	public void manualInitialize(){
		
	}

	public void autoInitialize(){

	}

	public void setStart(int x, int y){
		layout[x][y] = "S";
	}

	public void setEnd(int x, int y){
		layout[x][y] = "E";
	}

	public void defaultInitialize(){
		layout = new String[5][5];
		setStart(2,0);
		setEnd(0,2);
		layout[1][2] = ".";
		layout[2][2] = ".";
		layout[3][2] = ".";
		layout[4][2] = ".";
		layout[2][1] = ".";
	}

	public void autoSolve(){
		
	}

	public String toString(){
		String z = "";		
		for(int x = 0; x < layout.length; x++){
			for(int y = 0; y < layout[x].length; y++){
				if(layout[x][y] == null){z += " ";}else{z+= layout[x][y];}
			}
			z += System.lineSeparator();
		}
		return z;
	}

	public static void main(String[] args){
		Maze example = new Maze();
		example.defaultInitialize();		
		System.out.println(example);
	}
}
