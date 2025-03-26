package test;

import task.methods.Methods;

public class MethodsTest {

  public static void main(String[] args) {
    Methods methods = new Methods();

    // Тест 1: testStringToLowerCase
    String expectedResult1 = "string";
    String actualResult1 = methods.stringToLowerCase("STRING");
    if (expectedResult1.equals(actualResult1)) {
      System.out.println("Тест 1 пройден успешно!");
    } else {
      System.out.println(
          "Тест 1 не пройден. Ожидался: " + expectedResult1 + ", получен: " + actualResult1);
    }

    // Тест 2: testSumOfTwoNumbers
    int a = 2;
    int b = 3;
    int expectedResult2 = 5;
    int actualResult2 = methods.sumOfTwoNumbers(a, b);
    if (expectedResult2 == actualResult2) {
      System.out.println("Тест 2 пройден успешно!");
    } else {
      System.out.println(
          "Тест 2 не пройден. Ожидался: " + expectedResult2 + ", получен: " + actualResult2);
    }

    // Тест 3: testSumOfTwoStrings
    String str1 = "Hello";
    String str2 = "World";
    String expectedResult3 = "HelloWorld";
    String actualResult3 = methods.sumOfTwoStrings(str1, str2);
    if (expectedResult3.equals(actualResult3)) {
      System.out.println("Тест 3 пройден успешно!");
    } else {
      System.out.println(
          "Тест 3 не пройден. Ожидался: " + expectedResult3 + ", получен: " + actualResult3);
    }

    // Тест 4: testSumOfStringAndNumber
    String str = "10";
    int num = 5;
    String expectedResult4 = "15";
    String actualResult4 = methods.sumOfStringAndNumber(str, num);
    if (expectedResult4.equals(actualResult4)) {
      System.out.println("Тест 4 пройден успешно!");
    } else {
      System.out.println(
          "Тест 4 не пройден. Ожидался: " + expectedResult4 + ", получен: " + actualResult4);
    }

    // Тест 5: testCompareStringNumberWithInt
    String strNum = "5";
    int numComp = 10;
    boolean expectedResult5 = true;
    boolean actualResult5 = methods.compareStringNumberWithInt(strNum, numComp);
    if (expectedResult5 == actualResult5) {
      System.out.println("Тест 5 пройден успешно!");
    } else {
      System.out.println(
          "Тест 5 не пройден. Ожидался: " + expectedResult5 + ", получен: " + actualResult5);
    }

    // Тест 6: testCheckBooleans
    boolean aBool = true;
    boolean bBool = false;
    boolean expectedResult6 = true;
    boolean actualResult6 = methods.checkBooleans(aBool, bBool);
    if (expectedResult6 == actualResult6) {
      System.out.println("Тест 6 пройден успешно!");
    } else {
      System.out.println(
          "Тест 6 не пройден. Ожидался: " + expectedResult6 + ", получен: " + actualResult6);
    }

    // Тест 7: testIsEven
    int numEven = 4;
    boolean expectedResult7 = true;
    boolean actualResult7 = methods.isEven(numEven);
    if (expectedResult7 == actualResult7) {
      System.out.println("Тест 7 пройден успешно!");
    } else {
      System.out.println(
          "Тест 7 не пройден. Ожидался: " + expectedResult7 + ", получен: " + actualResult7);
    }

    // Тест 8: testCheckArrayEvenOdd
    int[] arrEvenOdd = {2, 4, 6};
    String expectedResult8 = "Массив четных чисел";
    String actualResult8 = methods.checkArrayEvenOdd(arrEvenOdd);
    if (expectedResult8.equals(actualResult8)) {
      System.out.println("Тест 8 пройден успешно!");
    } else {
      System.out.println(
          "Тест 8 не пройден. Ожидался: " + expectedResult8 + ", получен: " + actualResult8);
    }

    // Тест 9: testSumArrayElements
    int[] arrSumElements = {1, 2, 3};
    int[] expectedResult9 = {1, 3, 6};
    int[] actualResult9 = methods.sumArrayElements(arrSumElements);
    if (java.util.Arrays.equals(expectedResult9, actualResult9)) {
      System.out.println("Тест 9 пройден успешно!");
    } else {
      System.out.println(
          "Тест 9 не пройден. Ожидался: " + java.util.Arrays.toString(expectedResult9)
              + ", получен: " + java.util.Arrays.toString(actualResult9));
    }

    // Тест 10: testSumArray
    int[] arrSum = {1, 2, 3};
    int expectedResult10 = 6;
    int actualResult10 = methods.sumArray(arrSum);
    if (expectedResult10 == actualResult10) {
      System.out.println("Тест 10 пройден успешно!");
    } else {
      System.out.println(
          "Тест 10 не пройден. Ожидался: " + expectedResult10 + ", получен: " + actualResult10);
    }

    // Тест 11: testAgeCalculations
    int years = 10;
    int expectedResult11 = 120;
    int actualResult11 = methods.ageInMonths(years);
    if (expectedResult11 == actualResult11) {
      System.out.println("Тест 11 пройден успешно!");
    } else {
      System.out.println(
          "Тест 11 не пройден. Ожидался: " + expectedResult11 + ", получен: " + actualResult11);
    }

    // Тест 12: testAreNamesEqual
    String name1 = "John";
    String name2 = "john";
    boolean expectedResult12 = true;
    boolean actualResult12 = methods.areNamesEqual(name1, name2);
    if (expectedResult12 == actualResult12) {
      System.out.println("Тест 12 пройден успешно!");
    } else {
      System.out.println(
          "Тест 12 не пройден. Ожидался: " + expectedResult12 + ", получен: " + actualResult12);
    }

    // Тест 13: testGetLastElement
    int[] arrLastElement = {1, 2, 3};
    int expectedResult13 = 3;
    int actualResult13 = methods.getLastElement(arrLastElement);
    if (expectedResult13 == actualResult13) {
      System.out.println("Тест 13 пройден успешно!");
    } else {
      System.out.println(
          "Тест 13 не пройден. Ожидался: " + expectedResult13 + ", получен: " + actualResult13);
    }

    // Тест 14: testCountLetterA
    String strCountA = "AaA";
    int expectedResult14 = 3;
    int actualResult14 = methods.countLetterA(strCountA);
    if (expectedResult14 == actualResult14) {
      System.out.println("Тест 14 пройден успешно!");
    } else {
      System.out.println(
          "Тест 14 не пройден. Ожидался: " + expectedResult14 + ", получен: " + actualResult14);
    }

    // Тест 15: testWallet
    int amount = 100;
    String expectedResult15 = "Остаток в кошельке: 900";
    String actualResult15 = methods.withdraw(amount);
    if (expectedResult15.equals(actualResult15)) {
      System.out.println("Тест 15 пройден успешно!");
    } else {
      System.out.println(
          "Тест 15 не пройден. Ожидался: " + expectedResult15 + ", получен: " + actualResult15);
    }
  }
}