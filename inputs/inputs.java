import java.util.Scanner; // importent for implmenting scanner object

class Inputs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // used for simpal user input
        // the 6 data types:  byte, short, int, long, float, and double. ordered from smallest to largest 
        System.out.println("enter num: ");
            // asighnment statment(variable = declration)
        double input1 = sc.nextDouble();
        System.out.println("enter another num: ");
        double input2 = sc.nextDouble();
        double permVar = 2.5;
        permVar = (input1 + input2) * 3.5;
        System.out.println(permVar);
        sc.close();
    }

}

// interview question one: what can the implmentation of scanner do for a program

// intervew question two: what are the 6 tpes of Data Types
