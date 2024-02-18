import java.util.Scanner;

public class javapractice {
    public static void main(String[] args) {
        System.out.println("Do you prefer a small dog or a large dog?");
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        if(a.equals("Small")){
            System.out.println("Are you willing to adopt a high maintenance dog?");
            String b = scn.nextLine();
            if(b.equals("Yes")){
                System.out.println("Pug or Chihuahua");

            }
            else if(b.equals("No")){
                System.out.println("Indian");
            }
        }
        else if(a.equals("Large")){
            System.out.println("Do you want a guard dog?");
            String c = scn.nextLine();
            if(c.equals("Yes")){
                System.out.println("Do you stay in cold climate?");
                String d = scn.nextLine();
                if(d.equals("Yes")){
                    System.out.println("Husky");
                }
                else if(d.equals("No")){
                    System.out.println("Doberman or German shepherd");
                }
            else if(c.equals("No")){
                System.out.println("Saint Bernard");
            }
            }
        }
        else if(a.equals("No")){
            System.out.println("Thank you:)");
        }
        }
        
    }

