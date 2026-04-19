package Enums;

enum Day{
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY
}

class Days {
  public static void main(String[] args) {
    Day today = Day.MONDAY;
    System.out.println("Today is: " + today );
  }
}
