package portfolio_test;

public class main {

	public static void main(String[] args) {
		Persona facu = new Persona("Facundo Sharry", 21, "Fullstack developer junior" , "Computer Science student at FaMAF-UNC", "Cordoba, Argentina", "(+54 9) 3547-563095", "facundo.sharry@gmail.com", "../assets/perfil3.png", null);
		System.out.println(facu.getName() + ' ' + facu.getAge());
	}
}
