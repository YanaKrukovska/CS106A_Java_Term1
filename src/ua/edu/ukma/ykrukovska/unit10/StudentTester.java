package ua.edu.ukma.ykrukovska.unit10;

import acm.program.ConsoleProgram;
import ua.edu.ukma.ykrukovska.unit9.Student;

public class StudentTester extends ConsoleProgram {

    public void run() {

        ContractStudent contractStudent = new ContractStudent("Britney", "Spears", 30000, "December 20");
        contractStudent.setAge(20);
        contractStudent.setFaculty("FPRN");
        contractStudent.setSpeciality("International relationships");
        contractStudent.setYearOfStudying(2);

        Student budgetStudent = new Student("Justin", "Timberlake");
        budgetStudent.setAge(18);
        budgetStudent.setFaculty("FEN");
        budgetStudent.setSpeciality("Economy");
        budgetStudent.setYearOfStudying(1);

        println("Contract student: ");
        println(contractStudent.toString());
        println("");
        println("Budget student: ");
        println(budgetStudent.toString());

    }
}