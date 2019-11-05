
/**
 * A program to calculate the TDEE of the user.
 *
 * Hallie Jenkins
 * October 14, 2019
 */
import java.util.Scanner;
public class TDEE
{
   public static void main(String [] args)
    {
        
        String Name;
        Scanner N = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        Name = N.next();
        
        String BMR;
        Scanner B = new Scanner(System.in);
        System.out.println("Enter your BMR: ");
        BMR = B.next();
        double bmr = Double.parseDouble(BMR);
        
        String Gender;
        Scanner G = new Scanner(System.in);
        System.out.println("Enter your Gender (M/F): ");       
        Gender = G.next();
        char genderinput = Gender.charAt(0);
        boolean M = genderinput == 'M';
        boolean m = genderinput == 'm';
        boolean F = genderinput == 'F';
        boolean f = genderinput == 'f';
        
        System.out.println();
        System.out.println("Activity level");
        System.out.println("[0] Resting (Sleeping, reclining)");
        System.out.println("[1] Sedentary (Minimal movement, mainly sitting/lying down)");
        System.out.println("[2] Light (Office work, sitting)");
        System.out.println("[3] Moderate (Light manual labor,  dancing, cycling, etc.)");
        System.out.println("[4] Very Active (Hard manual labor, team sports)");
        System.out.println("[5] Extremely Active (Heavy manual labor, full-time athlete)");
        System.out.println();
        System.out.println ("Select your activity level: ");        
        Scanner AL = new Scanner(System.in);
        String Menu = AL.next();
        int input = Integer.parseInt(Menu);
        
        System.out.println("Name: " + Name);
        System.out.println("BMR: " + BMR);
        System.out.println("Gender: " + Gender);
        System.out.println("Activity Level: " + input);        
        double TDEE;
        double af;
        

        if (input == 0)
        {        
            af = 1.0;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if (input == 1)
        {
            af = 1.3;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 2) && ((M)||(m)))
        {
            af = 1.6;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 2) && ((F)||(f)))
        {
            af = 1.5;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 3) && ((M)||(m)))
        {
            af = 1.7;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 3) && ((F)||(f)))
        {
            af = 1.6;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 4) && ((M)||(m)))
        {
            af = 2.1;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if((input == 4) && ((F)||(f)))
        {
            af = 1.9;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 5) && ((M)||(m)))
        {
            af = 2.4;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else if ((input == 5) && ((F)||(f)))
        {
            af = 2.2;
            System.out.println("Activity Factor: " + af);
            TDEE = bmr * af;
            System.out.println("TDEE: " + TDEE);
        }
        else
        {
            System.out.println ("Error");
        }            
            
        
        
    }
}
