public Maze{
	public String[][] size;
	
	public Maze(size){
		size = new String[size][size];
	}

	public void manualInitialize(){
		
	}

	public void autoInitialize(){

	}

	public void setStart(int x, int y){
		size[x][y] = "S";
	}

	public void setEnd(int x, int y){
		size[x][y] = "E";
	}

	public void defaultInitialize(){
		size = new String[5][5];
		setStart(2,0);
		setEnd(0,2);
		size[1,2] = ".";
		size[2,2] = ".";
		size[3,2] = ".";
		size[4,2] = ".";
		size[2,1] = ".";
	}

	public void autoSolve(){
		
	}

	public String toString(){
		
	}

	public static void main(String[] args){
		
	}
}
