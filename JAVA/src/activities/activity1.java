package activities;

public class activity1 {
    public static void main(String[]args){
    car lotus = new car();
    lotus.make = 2014;
    lotus.color = "Black";
    lotus.transmission = "Manual";

    lotus.displaycharecteristics();
    lotus.accelarate();
    lotus.brake();

    }

}
class car {
     String color;
     String transmission;
     int make;
     int tyres;
     int doors;
    //constructor
    car (){
        tyres = 4;
        doors = 4;
    }
     public void displaycharecteristics(){
         System.out.println("Color ="+" "+color);
         System.out.println("Make ="+" "+make);
         System.out.println("Transmission ="+" "+transmission);
         System.out.println("Number of doors ="+" "+doors);
         System.out.println("Number of tyres ="+" "+tyres);
     }
     public void accelarate (){
        System.out.println("Car moves forward when accelarated.");
     }

     public void brake (){
        System.out.println("Car slows downs when brakes are applied.");
     }
}