/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pet.simulator;
import java.util.*;
/**
 *
 * @author Clark
 */
public class PETSIMULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

   
    while(true){
    System.out.println("===WELCOME TO PET SIMULATOR!!==== \n");
    System.out.println("Choose a pet you want! \n [a] Cat \n [b] Dog \n [q] Quit");
    char letter = scan.nextLine().charAt(0);

    while (letter != 'a'&& letter != 'b' && letter != 'q'){
        System.out.println("Sorry there are only 2 choices. \nPlease choose wisely!");
        break;}
    
   if (letter == 'a'){
        petCat();
    }
    else if(letter == 'b'){
        petDog();
    }
    if(letter == 'q'){
        System.out.println("THANKS FOR PLAYING!");
        break;
    }

    }}
    public static void petCat(){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("You successfully choose a cat!\n Give your cat a Name!");
        String nameCat = scan2.nextLine();
        System.out.println("\nYou named your pet cat " + nameCat + "!");
        StatsandActionsCat();

    }
    public static void petDog(){
        Scanner scan3 = new Scanner(System.in);
        System.out.println("You successfully choose a dog!\n Give your dog a Name!");
         String nameDog = scan3.nextLine();
        System.out.println("\nYou named your pet dog " + nameDog + "!");
        StatsandActionsDog();

    }   
    public static void StatsandActionsCat(){
        Scanner scan4 = new Scanner (System.in);
        int hunger  = 10;
        int energy = 10;
        int social = 10;
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);
        
        while(true){
            System.out.println("What do you want to do with your pet");
        System.out.println("Choose an action you want! \n [p] Play \n [e] Eat \n [q] quit");
        char action = scan4.nextLine().charAt(0);

        while(action != 'p' && action != 'e' && action != 'q'){
            System.out.println("Sorry there are only 2 choices. \nPlease choose wisely!");
        }
        if(action == 'p'){
            hunger = hunger - 2;
            energy = energy - 2;
            social = social - 1;
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);          
        }
        else if(action == 'e'){
            if(hunger <5){
                 hunger = hunger + 2;
            }   
            energy = energy - 1;   
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);            
        }
        else if(action == 'q'){
            System.out.println("THANKS FOR PLAYING!");
            break;
        }
        }
}
        public static void StatsandActionsDog(){
             Scanner scan5 = new Scanner (System.in);
        int hunger  = 10;
        int energy = 10;
        int social = 10;
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);
        
        while(true){
            System.out.println("What do you want to do with your pet");
        System.out.println("Choose an action you want! \n [p] Play \n [e] Eat \n [q] quit");
        char action = scan5.nextLine().charAt(0);

        while(action != 'p' && action != 'e' && action != 'q'){
            System.out.println("Sorry there are only 2 choices. \nPlease choose wisely!");
        }
        if(action == 'p'){
            hunger = hunger - 2;
            energy = energy - 2;
            social = social - 1;
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);          
        }
        else if(action == 'e'){
            if(hunger <5){
                 hunger = hunger + 2;
            }   
            energy = energy - 1;   
            System.out.println("Stats: \n"+hunger+"\n"+energy+"\n"+ social);            
        }
        else if(action == 'q'){
            System.out.println("THANKS FOR PLAYING!");
            break;
        }
        }

        }
    }
    

