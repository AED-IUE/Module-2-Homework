

public class Exercise01_10 {
   /* This program displays the average speed of a runner in miles per hour
        given the problem:
   
    Problem 1.10
    "Assume that a runner runs 14 kilometers in 45 minutes and 30
        seconds. Write a program that displays the average speed in
        miles per hour. (Note 1 mile is equal to 1.6 kilometers.)"

     --Written by Adrian Daniel with autofill on VS Code--
   */
    public static void main(String[] args) {
        
        
        // 1 mile = 1.6 km   -- not the real conversion but it was given in the problem
        // 1 hour = 60 minutes 
        // 1 minute = 60 seconds
        
       double  km = 14;
       double  mi = km / 1.6;
       double secondsRan = 30;
       double minutesRan = 45;
       double totalMinutes = (secondsRan / 60) + minutesRan;
       double hoursRan = totalMinutes / 60;
       
       float milesPerHour = (float)(mi / hoursRan); // final answer with float for readability

       System.out.println("The runner's average speed in miles per hour is about: " + milesPerHour + " mi/h");
     
       
    }
}     