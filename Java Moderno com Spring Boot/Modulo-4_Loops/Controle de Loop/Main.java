public class Main {
	public static void main(String[] args) {

		for(int index=0; index < 10; index +=1) {
			if(index ==5) {
				break; //Sai do loop quando index for igual a 5
			}
			 System.out.println(index);
		}

		for(int index = 0; index <10; index+=1) {
            if(index ==5) {
			continue; //Pula a itera¸ão quando index2 for igual a 5
		}
		    System.out.println(index);
		}
	}
}
