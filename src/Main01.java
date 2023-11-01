

import java.util.Scanner;

public class Main01 {
  // Просклонять слово час в зависимости от числа перед этим словом
  // 42011 % 100

  public static String inclineHoursWord(int hours) {
    // если 11-14, надо выводить "часов" в любом случае
    switch (hours % 100) {
      
      case 13:
      case 14:
        return "часов";
    }
    // intentional breakout

    switch (hours % 10) {
      case 1:
        return "час";
      // делаем брейкаут чтобы для трех значений сразу делать один вывод
      case 2:
      case 3:
      case 4:
        return "часа";
      case 5:
      
      default:
        return "часов";
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    System.out.println("коммент для обучения ");
    System.out.println(hours + " " + inclineHoursWord(hours));
  }
}
