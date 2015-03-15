public class Calculo {

	private int num1;
	private int num2;

	public Calculo() {
		this.num1 = 7;
		this.num2 = -1;
	}

	public int SomaDobrada() {

		if (num1 == num2) {

			return (num1 + num2) * 2;
		} else if ((num1 < 1) || (num2 < 1)) {
			return -1;
		}

		return num1 + num2;
	}
}