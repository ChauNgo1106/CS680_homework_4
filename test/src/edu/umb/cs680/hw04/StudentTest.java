package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void check_createOutStateStudent_by_creating_Student_prism() {

		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);

		String name_expected = "Prism";
		String US_address_expected = "24 Orkney road  #40 apt Brighton MA 02135";
		int yrs_in_state_expected = 5;
		StudentStatus status_expected = StudentStatus.OUTSTATE;

		assertTrue(prism instanceof Student);
		assertEquals(name_expected, prism.getName());
		assertEquals(US_address_expected, prism.getUsAddr());
		assertEquals(yrs_in_state_expected, prism.getYrsInState());
		assertEquals(status_expected, prism.getStatus());
	}

	@Test
	public void check_createIntlStudent_by_creating_Student_chaungo() {

		Student chaungo = Student.createIntlStudent("Ngo Bao Chau", "22 Orkney road  #42 apt Brighton MA 02135",
				123456789, "29 Dai Chi Dai Tam Soc Trang Viet Nam");

		String name_expected = "Ngo Bao Chau";
		String US_address_expected = "22 Orkney road  #42 apt Brighton MA 02135";
		int i_20_number_expected = 123456789;
		String foreign_address_expected = "29 Dai Chi Dai Tam Soc Trang Viet Nam";
		StudentStatus status_expected = StudentStatus.INTL;

		assertTrue(chaungo instanceof Student);
		assertEquals(name_expected, chaungo.getName());
		assertEquals(US_address_expected, chaungo.getUsAddr());
		assertEquals(i_20_number_expected, chaungo.getI20num());
		assertEquals(foreign_address_expected, chaungo.getForeignAddr());
		assertEquals(status_expected, chaungo.getStatus());

	}

	@Test
	public void check_createInStateStudent_by_creating_Student_tamnguyen() {

		Student tamnguyen = Student.createInStateStudent("Tam Nguyen", "22 Dorchester Ave, Boston, 02111");

		String name_expected = "Tam Nguyen";
		String US_address_expected = "22 Dorchester Ave, Boston, 02111";
		StudentStatus status_expected = StudentStatus.INSTATE;

		assertTrue(tamnguyen instanceof Student);
		assertEquals(name_expected, tamnguyen.getName());
		assertEquals(US_address_expected, tamnguyen.getUsAddr());
		assertEquals(status_expected, tamnguyen.getStatus());
	}

	// negative tests
	@Test
	public void check_error_when_creating_In_State_Student_object() {
		try {
			Student student1 = Student.createInStateStudent("", "");
		} catch (IllegalArgumentException ex) {
			assertEquals(ex.getMessage(), "Wrong credential information input!");
		}

	}

	@Test
	public void check_error_when_creating_Out_State_Student_object() {
		try {
			Student student1 = Student.createOutStateStudent("Chau Ngo", "", 5);
		} catch (IllegalArgumentException ex) {
			assertEquals(ex.getMessage(), "Wrong credential information input!");
		}

	}

	@Test
	public void check_error_when_creating_Intl_State_Student_object() {
		try {
			Student student1 = Student.createIntlStudent("", "", 1, "29 Dai Chi Dai Tam Soc Trang Viet Nam");
		} catch (IllegalArgumentException ex) {
			assertEquals(ex.getMessage(), "Wrong credential information input!");
		}

	}

	// testing getter methods make sure it works properly.
	@Test
	public void check_getTuition() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		float expected = 35075f;
		float result = prism.getTuition();
		assertEquals(expected, result);
	}
	@Test
	public void check_getName() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		String expected = "Prism";
		String result = prism.getName();
		assertEquals(expected, result);
	}
	@Test
	public void check_getStatus() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		StudentStatus expected = StudentStatus.OUTSTATE ;
		StudentStatus result = prism.getStatus();
		assertEquals(expected, result);
	}
	@Test
	public void check_getI20num() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		int expected = 0;
		int result = prism.getI20num();
		assertEquals(expected, result);
	}
	@Test
	public void check_getUsAddr() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		String expected = "24 Orkney road  #40 apt Brighton MA 02135";
		String result = prism.getUsAddr();
		assertEquals(expected, result);
	}
	@Test
	public void check_getYrsInState() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		int expected = 5;
		int result = prism.getYrsInState();
		assertEquals(expected, result);
	}
	@Test
	public void check_getForeignAddr() {
		Student prism = Student.createOutStateStudent("Prism", "24 Orkney road  #40 apt Brighton MA 02135", 5);
		assertTrue(prism.getForeignAddr() == null);
	}

}
