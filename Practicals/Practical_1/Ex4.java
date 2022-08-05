package Practicals.Practical_1;

public class Ex4 {
    public static void main(String[] args){

        int dayNum = 4;
        String Day;

        System.out.println("Value of the Day: " + dayNum);

        switch(dayNum){
            case 1:
                Day = "Monday";
                break;
            case 2:
                Day = "Tuesday";
                break;
            case 3:
                Day = "Wednesday";
                break;
            case 4:
                Day = "Thursday";
                break;
            case 5:
                Day = "Friday";
                break;
            case 6:
                Day = "Saturday";
                break;
            case 7:
                Day = "Sunday";
                break;
            default:
                Day = "Invalid Date";
                break;
        }

        System.out.println("Day of the week: " + Day);
        System.out.println("Good Bye!");
    }
}
