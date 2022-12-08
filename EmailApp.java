
public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("Dan", "Clavio");
		em1.setAlternateEmail("dnclv@gmail.com");
		System.out.println(em1.showInfo());
	}

}
