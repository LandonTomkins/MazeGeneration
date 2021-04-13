public class testArray{
	public static void main(String[] args){

	}

	public static void testDisplay(){
		PracticeArray board = new PracticeArray();
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				board.add("[]");
			}
		}
		board.displayArray(board);
	}
}