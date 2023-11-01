

import java.util.Scanner;

public class Main01 {
  // Просклонять слово час в зависимости от числа перед этим словом
  // 42011 % 100

  public static String inclineHoursWord(int hours) {

    switch (hours % 100) {
      case 11:
      case 12:
      case 13:
      case 14:
        return "часов";
    }
    // intentional breakout

    switch (hours % 10) {
      case 1:
        return "час";

      case 2:
      case 3:
      case 4:
        return "часа";
      case 5:
      case 6:
      case 7:
      case 8:

      default:
        return "часов";
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    System.out.println("коммент для обучения в гитхабе ");
    System.out.println(hours + " " + inclineHoursWord(hours));
  }
}