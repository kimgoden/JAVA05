package project06;

public class CarMain4 {
public static void main(String[] args) {
	Car2 Car1 = new Car2(2000);
	System.out.println("Car1.company :" + Car1.company);
	System.out.println("Car1.price :" +Car1.price);
	System.out.println();
	
	Car2 Car2 = new Car2("½ÑÅ¸Æä");
	System.out.println("Car2.company :" + Car2.company);
	System.out.println("Car2.model : "+ Car2.model);
	System.out.println();
	
	Car2 Car3 = new Car2("¾Æ¹Ý¶¼","white");
	System.out.println("Car3.company :" + Car3.company);
	System.out.println("Car3.model : "+ Car3.model);
	System.out.println("Car3.color :" +Car3.color);
	System.out.println();
	
	Car2 Car4 = new Car2("Á¦³×½Ã½º","black",3000);
	System.out.println("Car4.company :" + Car4.company);
	System.out.println("Car4.model : "+ Car4.model);
	System.out.println("Car4.color :" +Car4.color);
	System.out.println("Car4.color :" +Car4.maxspeed);

}

}
