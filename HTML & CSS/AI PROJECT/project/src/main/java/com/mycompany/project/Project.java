
package com.mycompany.project;

import java.util.Scanner;

public class Project {
            static String car,houses,funiture;
            static int option;
   
                        static void welcoming(){
                System.out.println("Welcome To The Easy Search Page");
                System.out.println("We Have Affordable Products But Our Products Are Limitted.");
                System.out.println("We Have Different Cars, Houses, And Furniture.");
                decisionCapture();
            }
    static void decisionCapture(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 To Search About Cars Or 2 To Search About Houses Or 3 To Search About Funiture:");        
        option=s.nextInt();
        if(option==1){
            System.out.println("Affordable Options Cars: Press 1 for Volkswagen, or 2 for Hyundai, or 3 for Audi");
           option = s.nextInt();
        }
        else if(option==2){
            System.out.println("Options Of Houses: Press 4 for Mansion, 5 for RDP House, 6 for Condominium");
            option = s.nextInt();
        }
        else if(option==3){
            System.out.println("Options On Funiture: Press 7 for Three Seater Couch, 8 for Oval Table, 9 for Platform Bed");
            option = s.nextInt();
        }
        else{
            System.out.println("Please Try again Searching Following The Instructions");
            decisionCapture();
        }
       
    }
    static void outcomeCapture(){
        Scanner s = new Scanner (System.in);
        switch(option){
            case 1:
                System.out.println("This Company Is A German Manufacturing Company Producing Quality,Stylish Vehicles.");
                System.out.println("One Of its Affiordable Cars Is The Polo Car ranging at R200 000 to R500 000");
                System.out.println("Enter 1 If You Still Want To See Other Products Or 2 To Exit.");
                option = s.nextInt();
                if(option == 1){
                decisionCapture();
                }
                else if(option == 2){
                    System.out.println("You Have Existed Our System. Thank You For Visting Easy Search Page.");
                     System.exit(0);
                }
                else{
                        System.out.println("You've Entered Wrong Didgit Please Try Again.");
                        outcomeCapture();
                        }
                break;
            case 2:
                System.out.println("This Company Is A South Korean Automotive Manufacturer most dependable brands.");
                System.out.println("One Of Its Affordable Cars suggesed is the Hyundai i10 ranging at R150 000 to R400 000");
                decisionCapture();
                break;
            case 3:
                System.out.println("This Company is a German Automotive Manufacturer of luxury vehicles.");
                System.out.println("One Of its affordable cars suggestions is the Audi A3 hatchback ranging at R300 000 to R900 000 ");
                decisionCapture();
                break;
            case 4:
                System.out.println("A Mansion Is A bulding Function That Is Normally Bigger Than A Normal House Having Atleast "
                        + "4-6 bedrooms.");
                System.out.println("It comes with additinal extra space with a range price of  R2 million to as far as R15 million");
                decisionCapture();
                break;
            case 5:
                System.out.println("Reconstruction and development programme houses are subsidised houses provided by the "
                        + "government through an agreement");
                System.out.println("These houses are still avialable without buying them but having to fit in with certain "
                        + "requirments to get one as a citizin");
                decisionCapture();
                break;
            case 6:
                System.out.println("A condomminium bulding is an ownership home whereby a bulding is seperated into multiple units.");
                System.out.println("Depending on the bilding it can have 1-5 bedrooms and ranging at R500 000 to as far as R5 million");
                decisionCapture();
                break;
            case 7:
                System.out.println("This is a sofa that has three seats that allows 3 people to only sit on it.");
                System.out.println("It can be found in various furniture shops ranging at R600 to R4000 depending "
                        + "on the material and size.");
                decisionCapture();
                break;
            case 8:
                System.out.println("The oval table is a round table and a rectangular table used for putting items it can "
                        + "handle for your home.");
                System.out.println("It creates a illusion of more space and rangings at a price of R800 to R7000 depending on the size");
                decisionCapture();
                break;
            case 9:
                System.out.println("This bed is a well known bed for its comfort with a low frame that holds the mattress up.");
                System.out.println("They can provide enough support with a price range of R1500 to 15000");
                decisionCapture();
                break;            
            default:
                System.out.println("Please Try again Searching Following The Instructions");
                outcomeCapture();
        }
           
    }
    public static void main(String[] args) {
        welcoming();
        decisionCapture();
        outcomeCapture();
    }
}
