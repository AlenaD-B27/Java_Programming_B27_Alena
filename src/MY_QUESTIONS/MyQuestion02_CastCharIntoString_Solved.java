package MY_QUESTIONS;

public class MyQuestion02_CastCharIntoString_Solved {
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
                String company = "apple";
                String job = "SDET";
                char suite = 'A';
                int ID = 1234567;
                int PTO = 3;
                double salary = 170_000;
                boolean isFT = true;
                boolean isHome = true;

                System.out.println("Employment information for "+firstName+" "+lastName+": "+job+" for "+company+", based in suite "+suite+". "+lastName+ " is full time: "+isFT+". "+ "Contact "+firstName+" "+lastName+" at "+firstName+ID+"@"+company+".com. "+ "Current benefits include $"+salary+" a year, "+PTO+" PTO weeks and work from home.");

                System.out.println();

                String email = firstName+ID+"@"+company+".com.";
                String fullName = firstName+" "+lastName;
                String benefits = "PTO "+PTO+ " weeks a year. "+"Work from home: "+isHome;
                String summary = "First and Last name:\t"+fullName+"\n"+"Hired as "+job+" at "+company+"\n"+"assigned to suite "+suite+";\n"+"email:\t"+email+"\n"+"Salary - $"+salary+" a year + next benefits:\n"+benefits+"\nFull time:\t"+isFT;

                System.out.println("summary = " + summary);
                System.out.println();

//==================LET'S PLAY========================================//

                System.out.println("Previous job experience:\n");

                company = "Bulldog";
                job = "GM";

//        char suite1 = (String) suite;
//        suite = "N/A";

                //  Is casting just for primitive types?

                PTO = 2;
                salary = 56_000;
                isFT = true;
                isHome = false;
        benefits = "PTO "+PTO+ " weeks a year. "+"Work from home: "+isHome;


                summary = "First and Last name:\t"+fullName+"\n"+"Hired as "+job+" at "+company+"\n"+"assigned to suite "+suite+";\n"+"email:\t"+email+"\n"+"Salary - $"+salary+" a year + next benefits:\n"+benefits+"\nFull time:\t"+isFT;

                String newSum = summary;

                System.out.println(newSum);

/** ANSWER: Exactly. You will learn methods and it is possible with method
 *
 */







            }
        }






