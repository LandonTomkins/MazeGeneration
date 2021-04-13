import java.util.*;
import java.io.*;

public class PracticeArray{
	//attributes
	private String[][] maze;
	private static final int SIZE = 10;

	//constructor
	public PracticeArray(){
		maze = new String[SIZE][SIZE];

	}

	public void add(String value){
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[0].length; j++){
				maze[i][j] = (value + maze[0].length) + value;
			}
		}
	}

	// function to display the array
	public void displayArray(String board[][]){
		System.out.println(Arrays.deepToString(board));
	}
}