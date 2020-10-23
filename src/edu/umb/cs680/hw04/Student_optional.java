package edu.umb.cs680.hw04;

public class Student_optional extends StudentFactory_optional {

	private float tuition;
	private String name;
	private int i20num;
	private String usAddr;
	private int yrsInState;
	private String foreignAddr;
	private StudentStatus status;

	protected Student_optional(float tuition, String name, int i20num, String usAddr, int yrsInState,
			String foreignAddr, StudentStatus status) {
		this.tuition = tuition;
		this.name = name;
		this.i20num = i20num;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.foreignAddr = foreignAddr;
		this.status = status;
	}

	// getter methods
	public float getTuition() {
		return this.tuition;
	}

	public String getName() {
		return this.name;
	}

	public StudentStatus getStatus() {
		return this.status;
	}

	public int getI20num() {
		return i20num;
	}

	public String getUsAddr() {
		return usAddr;
	}

	public int getYrsInState() {
		return yrsInState;
	}

	public String getForeignAddr() {
		return foreignAddr;
	}

	// main method
	public static void main(String[] args) {
		// chaungo
		System.out.println();
		System.out.println("************************************************************");
		System.out.println("********************THIS IS Student_optional CLASS*********");
		System.out.println("************************************************************");
		
		Student_optional chaungo = StudentFactory_optional.createIntlStudent("Ngo Bao Chau",
				"22 Orkney road  #42 apt Brighton MA 02135", 123456789, "29 Dai Chi Dai Tam Soc Trang Viet Nam");
		
		System.out.println("Student name is: " + chaungo.getName() + "\n" + "US address is : " + chaungo.getUsAddr()
				+ "\n" + "I-20 number is : " + chaungo.getI20num() + "\n" + "Foreign address is : "
				+ chaungo.getForeignAddr() + "\n" + "Student status is : " + chaungo.getStatus() + "\n" + "Tuition fee is: $" 
				+ chaungo.getTuition());

		System.out.println();

		// prism
		Student_optional prism = StudentFactory_optional.createOutStateStudent("Prism",
				"24 Orkney road  #40 apt Brighton MA 02135", 5);
		
		System.out.println("Student name is: " + prism.getName() + "\n" + "US address is : " + prism.getUsAddr() + "\n"
				+ "Number of years in MA state is : " + prism.getYrsInState() + "\n" + "Student status is : "
				+ prism.getStatus() + "\n" + "Tuition fee is: $" + prism.getTuition() );

		System.out.println();

		// tamnguyen
		Student_optional tamnguyen = StudentFactory_optional.createInStateStudent("Tam Nguyen",
				"22 Dorchester Ave, Boston, 02111");
		System.out.println("Student name is: " + tamnguyen.getName() + "\n" + "US address is : " + tamnguyen.getUsAddr()
				+ "\n" + "Student status is : " + tamnguyen.getStatus() + "\n" + "Tuition fee is: $" + tamnguyen.getTuition());

	}

}
