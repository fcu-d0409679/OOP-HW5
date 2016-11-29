package fcu.iecs.oop.pokemon;
import java.util.Random;//匯入此函式庫

public class GYM {
	
	
	public static void fight(Pokemon p1, Pokemon p2){
		
		Random size = new Random();
		int sp1,sp2;
		do{
		sp1=size.nextInt(2);//亂數產生0~9
		sp2=size.nextInt(1);//亂數產生0~9
		}while(sp1==sp2);
		
		if(sp1==0){
			System.out.println("Winner is ["+p1.getName()+"]");
			p1.setCp();
		}
		
		else{
			System.out.println("Winner is ["+p2.getName()+"]");
			p2.setCp();
		}
		
	}


}
