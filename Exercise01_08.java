

public class Exercise01_08 {
   /* This program displays the area and perimeter of a circle with a radius of 5.5 using the following formula:
    area = radius * radius * π
    perimeter = 2 * radius * π
    --Written by Adrian Daniel with autofill on VS Code--
   */
    public static void main(String[] args) {
        
        double radius = 5.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        
        System.out.println("The area of a circle with radius 5.5 is about: " + area);
        System.out.println("The perimeter of a circle with radius 5.5 is about: " + perimeter);

        
       
    }
}     