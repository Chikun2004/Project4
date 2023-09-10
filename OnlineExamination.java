import java.util.*;

public class OnlineExamination {
    public static void main(String[] args) {
        int ch, choice, id;
        String name;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter Roll no: ");
        id=sc.nextInt();
        System.out.println("\tWelcome " + name + " to NBI Online Examination\t");
        do {
            System.out.println("1.Take Exam");
            System.out.println("2.View Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            ch = sc.nextInt();
            switch(ch) {
                case 1: {
                    System.out.println("Select Programming Language:");
                    System.out.println("1.C \n2.Java \n3.C++");
                    System.out.println("Enter your choice:");
                    int sub = sc.nextInt();
                    System.out.println("There are 10 Questions in the Examination");
                    System.out.println("Each question consist of 4 option you have to choose correct answer");
                    System.out.println("To pass the exam you have to solve atleast 7 Questions Correctly!!!");
                    System.out.println("!!!Good Luck!!!");
                    if(sub==1) {
                        count=0;
                        System.out.println("Q.1.Who is the father of C language?");
                        System.out.println("a) Steve Jobs \n b) James Gosling \n c) Dennis Ritchie \n d) Rasmus Lerdorf");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.2.Which of the following is not a valid C variable name?");
                        System.out.println("a) int number; \n b) float rate; \n c) int variable_count; \n d) int $main;");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.3.All keywords in C are in ____________");
                        System.out.println("a) LowerCase letters \n b) UpperCase letters \n c) CamelCase letters \n d) None of the mentioned");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1) {
                            ++count;
                        }
                        System.out.println("Q.4.Which of the following is true for variable names in C?");
                        System.out.println("1.a) They can contain alphanumeric characters as well as special characters");
                        System.out.println("b) It is not an error to declare a variable to be one of the keywords(like goto, static)");
                        System.out.println("c) Variable names cannot start with a digit");
                        System.out.println("d) Variable can be of any length");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.5.Which is valid C expression?");
                        System.out.println("a) int my_num = 100,000;");
                        System.out.println("b) int my_num = 100000;");
                        System.out.println("c) int my num = 1000;");
                        System.out.println("d) int $my_num = 10000;");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.6.Which of the following cannot be a variable name in C?");
                        System.out.println("a) volatile \n b) true \n c) friend \n d) export");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==1) {
                            ++count;
                        }
                        System.out.println("Q.7.What is short int in C programming?");
                        System.out.println("a) The basic data type of C \n b) Qualifier \n c) Short is the qualifier and int is the basic data type \n d) All of the mentioned");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.8.Which of the following declaration is not supported by C language?");
                        System.out.println("a) String str; \n b) char *str; \n c) float str = 3e2; \n d) Both 'String str;' and 'float str = 3e2;'");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==1) {
                            ++count;
                        }
                        System.out.println("Q.9.Which keyword is used to prevent any changes in the variable within a C program?");
                        System.out.println("a) immutable \n b) mutable \n c) const \n d) volatile");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.10.What is the result of logical or relational expression in C?");
                        System.out.println("a) True or False \n b) 0 or 1 \n c) 0 if an expression is false and any positive number if an expression is true \n d) None of the mentioned");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();   
                        if(choice==2) {
                            ++count;
                        }
                    } else if(sub == 2) {
                        count=0;
                        System.out.println("Q.1.Who invented Java Programming?");
                        System.out.println("a) Guido van Rossum \n b) James Gosling \n c) Dennis Ritchie \n d) Bjarne Stroustrup");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.2.Which component is used to compile, debug and execute the java programs?");
                        System.out.println("a) JRE \n b) JIT \n c) JDK \n d) JVM");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.3.Which one of the following is not a Java feature?");
                        System.out.println("a) Object-oriented \n b) Use of pointers \n c) Portable \n d) Dynamic and Extensible");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.4.Which of these cannot be used for a variable name in Java?");
                        System.out.println("a) identifier & keyword \n b) identifier \n c) keyword \n d) none of the mentioned");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.5.What is the extension of java code files?");
                        System.out.println("a) .js \n b) .txt \n c) .class \n d) .java");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.6.Which environment variable is used to set the java path?");
                        System.out.println("a) MAVEN_Path \n b) JavaPATH \n c) JAVA \n d) JAVA_HOME");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.7.Which of the following is not an OOPS concept in Java?");
                        System.out.println("a) Polymorphism \n b) Inheritance \n c) Compilation \n d) Encapsulation");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.8.What is not the use of 'this' keyword in Java?");
                        System.out.println("a) Referring to the instance variable when a local variable has the same name \n b) Passing itself to the method of the same class \n c) Passing itself to another method \n d) Calling another constructor in constructor chaining");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.9.Which of the following is a type of polymorphism in Java Programming?");
                        System.out.println("a) Multiple polymorphism \n b) Compile time polymorphism \n c) Multilevel polymorphism \n d) Execution time polymorphism");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.10.What is the extension of compiled java classes?");
                        System.out.println("a) .txt \n b) .js \n c) .class \n d) .java");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                    } else {
                        count=0;
                        System.out.println("Q.1.Who invented C++?");
                        System.out.println("a) Dennis Ritchie \n b) Ken Thompson \n c) Brian Kernighan \n d) Bjarne Stroustrup");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.2.What is C++?");
                        System.out.println("a) C++ is an object oriented programming language \n b) C++ is a procedural programming language \n c) C++ supports both procedural and object oriented programming language \n d) C++ is a functional programming language");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.3.Which of the following is the correct syntax of including a user defined header files in C++?");
                        System.out.println("a) #include [userdefined] \n b) #include 'userdefined' \n c) #include <userdefined.h> \n d) #include <userdefined>");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2) {
                            ++count;
                        }
                        System.out.println("Q.4.Which of the following is used for comments in C++?");
                        System.out.println("a) /*comment*/ \n b) //comment*/ \n c) //comment \n d) both //comment or /*comment*/");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.5.Which of the following user-defined header file extension used in c++?");
                        System.out.println("a) hg \n b) cpp \n c) h \n d) hf");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.6.Which of the following is a correct identifier in C++?");
                        System.out.println("a) VAR_1234 \n b) $var_name \n c) 7VARNAME \n d) 7var_name");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1) {
                            ++count;
                        }
                        System.out.println("Q.7.Which of the following is not a type of Constructor in C++?");
                        System.out.println("a) Default constructor \n b) Parameterized constructor \n c) Copy constructor \n d) Friend constructor");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.8.Which of the following approach is used by C++?");
                        System.out.println("a) Left-right \n b) Right-left \n c) Bottom-up \n d) Top-down");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                        System.out.println("Q.9.Which of the following type is provided by C++ but not C?");
                        System.out.println("a) double \n b) float \n c) int \n d) bool");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4) {
                            ++count;
                        }
                        System.out.println("Q.10.By default, all the files in C++ are opened in _________ mode.");
                        System.out.println("a) Binary \n b) VTC \n c) Text \n d) ISCII");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3) {
                            ++count;
                        }
                    }
                    break;
                }
                case 2: {
                    if(count >= 7) {
                        System.out.println("\n\nCongrats  " + name + ", You scored " + count + " marks out of 10\n\n");
                    } else {
                        System.out.println("\n\nYour Score: " + count);
                        System.out.println("\n\nSorry you didn't qualify the exam, Please Retake the Examination!!\n\n");
                    }
                }
                case 3: {
                    System.out.println("\n\n*******Thank You for taking the Exam*******\n\n");
                    System.exit(0);
                }
            }
        } while(true);
    }
}