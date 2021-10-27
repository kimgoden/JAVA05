package project06;

public class ex01main {
public static void main(String[] args) {
	ex01maincard card1 = new ex01maincard(3, false);
	ex01maincard card2 = new ex01maincard();

	System.out.println(card1.info());
	System.out.println(card2.info());
}
}

