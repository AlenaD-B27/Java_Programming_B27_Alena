package day04_practice;

import java.sql.SQLOutput;

public class Employee {
    public static void main(String[] args) {

//        declare and assign these variables with the most appropriate datatypes:
//
//        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time
//
//    declare new variables and use concatenation from previous variables to set their values
//
//        - full name (first and last name)
//        - email (first name + employee id @ company name.com)
//        - benefits (salary, number of PTO and add "work from home")
//
//    create a summary of the information and print it. Be creative
//        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
        //======================================================================================

        String firstName = "Alena";
        String lastName = "Darazhei";
        String company1 = "Apple";
        String job = "SDET";
        char suite = 'A';
        int ID = 1234567;
        int PTO = 3;
        double salaryA = 170_000;
        boolean isFT = true;
        boolean isHome = true;

        System.out.println("Employment information for "+firstName+" "+lastName+": "+job+" for "+company1+", based in suite "+suite+". "+lastName+ " is full time: "+isFT+". "+ "Contact "+firstName+" "+lastName+" at "+firstName+ID+"@"+company1+".com. "+ "Current benefits include $"+salaryA+" a year, "+PTO+" PTO weeks and work from home.");

        System.out.println();

        String email = firstName+ID+"@"+company1+".com.";
        String fullName = firstName+" "+lastName;
        String benefits = "PTO "+PTO+ " weeks a year. "+"Work from home: "+isHome;
        String summary = "First and Last name:\t"+fullName+"\n"+"Hired as "+job+" at "+company1+"\n"+"assigned to suite "+suite+";\n"+"email:\t"+email+"\n"+"Salary - $"+salaryA+" a year + next benefits:\n"+benefits+"\nFull time:\t"+isFT;

        System.out.println("summary = " + summary);
        System.out.println();

//==================LET'S PLAY========================================//

        System.out.println("Previous job experience:\n");

        String company2 = "Bulldog";
        job = "GM";
        suite = '-';
        PTO = 2;
        double salaryB = 56_000;
        isFT = true;
        isHome = false;
        benefits = "PTO "+PTO+ " weeks a year. "+"Work from home: "+isHome;
        email = company2+"_"+firstName+"@yahoo.com.";


        summary = "First and Last name:\t"+fullName+"\n"+"Hired as "+job+" at "+company2+"\n"+"assigned to suite "+suite+";\n"+"email:\t"+email+"\n"+"Salary - $"+salaryB+" a year + next benefits:\n"+benefits+"\nFull time:\t"+isFT;

        String newSum = summary;

        System.out.println(newSum);
        System.out.println();

//===================================================================================
        System.out.println("Is salary at "+company1+" better than salary at "+company2+"?");
        boolean compare1to2 = salaryA>salaryB;
        System.out.println(compare1to2);
        System.out.println("Is salary at "+company2+" better than salary at "+company1+"?");
        boolean compare2to1 = salaryB>salaryA;
        System.out.println(compare2to1);












    }
}
