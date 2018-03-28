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

	public void wraping(){
		wrap = new String[layout.length + 2][layout[0].length + 2];
		for(int x = 0; x < warp[0].length; x++){
			wrap[0][x] = "";
		}
		for(int x = 0; x < warp[warp.length - 1].length; x++){
			wrap[wrap.length - 1][x] = "";
		}
		for(int x = 0; x < warp.length; x++){
			wrap[x][0] = "";
		}
		for(int x = 0; x < warp.length; x++){
			wrap[x][wrap[x].length - 1] = "";
		}
		for(int x = 1; x < layout.length; x++){
			for(int y = 1; y < layout[x].length + 1; y++){
				if(layout[x][y] == null){z += " ";}else{z+= layout[x][y];}
			}
			z += System.lineSeparator();
		}		
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
