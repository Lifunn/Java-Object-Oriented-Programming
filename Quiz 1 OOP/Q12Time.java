package Quiz;

public class Q12Time {

    public static int calculateAngle(int hours, int minutes) {
        hours = hours % 12;
        
        int minuteAngle = minutes * 6;
        
        double hourAngle = (hours * 30) + (minutes * 0.5);
        
        double angle = minuteAngle - hourAngle;
        
        if (angle < 0) {
            angle += 360;
        }
        
        return (int) Math.round(angle);
    }

    public static void main(String[] args) {
        System.out.println("Angle at 9:00: " + calculateAngle(9, 0));    
        System.out.println("Angle at 3:00: " + calculateAngle(3, 0));        
        System.out.println("Angle at 18:00: " + calculateAngle(18, 0));  
        System.out.println("Angle at 1:00: " + calculateAngle(1, 0));            
        System.out.println("Angle at 2:30: " + calculateAngle(2, 30));   
        System.out.println("Angle at 4:41: " + calculateAngle(4, 41));   
    }
}
