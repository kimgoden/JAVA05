package project06;

public class Car2 {
//필드
	String company="현대자동차";
	String model;
	String color;
	int maxspeed;
	int price;
	Car2(int price) {  
		this.price = price;
	}
	Car2(String model) {
	    this.model = model;
}
	Car2(String model, String color) {
		this.model =model;
		this.color =color;
		
}
	Car2(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;  
	}
	
}