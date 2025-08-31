

public class Exercise01_09 {
   /* This program displays the area and perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
    area = width * height
    perimeter = 2 * (width + height)
    --Written by Adrian Daniel with autofill on VS Code--
   */
    public static void main(String[] args) {
        
        //used float instead of double to avoid rounding errors IS was getting
        float height = 7.9f;
        float width = 4.5f;
        float area = width * height;
        float perimeter = 2 * (width + height);
        
        System.out.println("Given a rectangle with a width of 4.5 and a height of 7.9:");
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

        
       
    }
}     