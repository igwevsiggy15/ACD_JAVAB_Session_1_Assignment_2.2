package assign2;

public class assign2 {

		public static void main(String[] args){

			int lines = 7;
			int sp = lines/2;
			int lt = 1;
			char[] list = {'z', 'a', 'b', 'c', 'd'};
			
			
			
			for(int i = 1; i <= lines; i++){
				
				//Spaces are here
				for(int j = 1; j <= sp; j++)
					System.out.print(" ");
				
				//Letters shown here
				int count =  1;
				for(int k = 1; k <= lt; k++){
					System.out.print(list[count]);
					if(k <= lt / 2){
						count++;
					}else{
						count--;
					}
				}
				
				System.out.println();
				
				//This is halfway point
				if(i <= lines / 2){
					//First Half
					sp -= 1;
					lt += 2;
				}else{
					//Last half
					sp += 1;
					lt -= 2;
				}
			}
			
			
			
		}
	}
