package Banking;
public class FirstBank {
	public static void main(String[] args) {
		
		Account tim = new Account("Tim Startler", "A00001");
		
		Account beyonce = new Account("Beyonce", "B00002");
		beyonce.showMenu();
	}
}
