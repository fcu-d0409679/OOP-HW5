package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	
	private final String name;//final���A�A��ܤ@����l�ƴN������
	
	private int cp;
		
	public Pokemon(String name,int cp){
		
		this.name=name;
		
		this.cp=cp;
		
	}
	
	public void setCp() {
		this.cp=this.cp+500;
	 }

	
	public String getName() {
		
	    return name;
	}
	
	public int getCp() {
		
	    return cp;
	}


}
