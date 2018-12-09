package week15;

public class Main {

    public void chooseDay(Day day) {

        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("weekend");
                break;
            case MONDAY:
                System.out.println("first day of work day");
                break;
            default:
                System.out.println("normal working day");
        }
    }

    public static void main(String[] args) {
        Day sunday = Day.SUNDAY;

//        System.out.print(sunday);
        Main test = new Main();
        test.chooseDay(sunday);
    }
}
