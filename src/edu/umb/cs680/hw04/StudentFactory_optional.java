package edu.umb.cs680.hw04;

import edu.umb.cs680.hw04.Student_optional;

public class StudentFactory_optional {

	StudentFactory_optional() {
	};

	// static factory methods
	public static Student_optional createInStateStudent(String name, String usAddr) {
		return new Student_optional(35075f, name, 0, usAddr, 0, null, StudentStatus.OUTSTATE);
	}

	public static Student_optional createOutStateStudent(String name, String usAddr, int yrsInState) {
		return new Student_optional(14613f, name, 0, usAddr, yrsInState, null, StudentStatus.INSTATE);
	}

	public static Student_optional createIntlStudent(String name, String usAddr, int i20num, String foreignAddr) {
		return new Student_optional(35075f, name, i20num, usAddr, 0, foreignAddr, StudentStatus.INTL);
	}

}
