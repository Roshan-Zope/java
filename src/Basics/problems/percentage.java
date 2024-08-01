//calculating percentage of 5 subjects
package Basics;

public class percentage {
    public static void main(String[] args) {
        double x1 = 90; //physics
        double x2 = 91; //chemistry
        double x3 = 92; //maths
        double x4 = 93; //english
        double x5 = 94; //history
        double percentage = ((x1+x2+x3+x4+x5)/500)*100;
        System.out.println(percentage);
    }
}
