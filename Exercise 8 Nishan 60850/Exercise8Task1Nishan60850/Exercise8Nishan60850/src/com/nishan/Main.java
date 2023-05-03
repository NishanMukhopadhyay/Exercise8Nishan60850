package com.nishan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Staff s= new Staff();
        s.initialize1();
        s.Nishan1_60850();

        double salary= s.salaryToPay(180,40);
        System.out.println("The amount salaries the employee receipt is "+ salary);
        double salaryForOverTime=s.salaryForOverTime(10,40);
        System.out.println("The amount of the overtime salary is "+ salaryForOverTime);
        int bonus= NishanSalary.bonusNishan(6);
        s.initialize();
        s.Nishan60850();
    }
}
interface NishanSalary {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate) {
        return 1;
    }

    static int bonusNishan(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}

class Staff extends Person implements NishanSalary {
    String Nishan60850_education;
    String Nishan60850_position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        Nishan60850_education = br.readLine();
        System.out.println("Enter your position");
        Nishan60850_position = br.readLine();
    }

    public void Nishan60850()
    {

        Nishan1_60850();
        System.out.println("Education :" + Nishan60850_education);
        System.out.println("Position :" + Nishan60850_position);
    }
    @Override
    public double salaryToPay(double hours, double rate){return  hours*rate;}
    @Override
    public double salaryForOverTime(double overtime, double rate){return  overtime*(1.5*rate);};
}
