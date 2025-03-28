package test;

import task.oop.Child1;
import task.oop.Child2;
import task.oop.Parent;

public class OopTest {

  public static void main(String[] args) {
    // Тестирование методов родительского класса
    Parent parent = new Parent();

    // Test sumOfTwoNumbers
    int expectedSumParent = 5;
    int actualSumParent = parent.sumOfTwoNumbers(2, 3);
    if (expectedSumParent == actualSumParent) {
      System.out.println("Тест sumOfTwoNumbers родителя пройден успешно!");
    } else {
      System.out.println(
          "Тест sumOfTwoNumbers родителя не пройден. Ожидался: " + expectedSumParent + ", получен: "
              + actualSumParent);
    }

    // Test sumOfStringAndNumber
    int expectedSumStringAndNumberParent = 15;
    int actualSumStringAndNumberParent = parent.sumOfStringAndNumber("10", 5);
    if (expectedSumStringAndNumberParent == actualSumStringAndNumberParent) {
      System.out.println("Тест sumOfStringAndNumber родителя пройден успешно!");
    } else {
      System.out.println("Тест sumOfStringAndNumber родителя не пройден. Ожидался: "
          + expectedSumStringAndNumberParent + ", получен: " + actualSumStringAndNumberParent);
    }

    // Test returnString
    String expectedReturnStringParent = "Hello";
    String actualReturnStringParent = parent.returnString("Hello");
    if (expectedReturnStringParent.equals(actualReturnStringParent)) {
      System.out.println("Тест returnString родителя пройден успешно!");
    } else {
      System.out.println(
          "Тест returnString родителя не пройден. Ожидался: " + expectedReturnStringParent
              + ", получен: " + actualReturnStringParent);
    }

    // Test concatenateStrings
    String expectedConcatenateStringsParent = "HelloWorld";
    String actualConcatenateStringsParent = parent.concatenateStrings("Hello", "World");
    if (expectedConcatenateStringsParent.equals(actualConcatenateStringsParent)) {
      System.out.println("Тест concatenateStrings родителя пройден успешно!");
    } else {
      System.out.println("Тест concatenateStrings родителя не пройден. Ожидался: "
          + expectedConcatenateStringsParent + ", получен: " + actualConcatenateStringsParent);
    }

    // Тестирование методов Child1
    Child1 child1 = new Child1();

    // Test sumOfTwoNumbers
    int expectedSumChild1 = 6;
    int actualSumChild1 = child1.sumOfTwoNumbers(2, 3);
    if (expectedSumChild1 == actualSumChild1) {
      System.out.println("Тест sumOfTwoNumbers Child1 пройден успешно!");
    } else {
      System.out.println(
          "Тест sumOfTwoNumbers Child1 не пройден. Ожидался: " + expectedSumChild1 + ", получен: "
              + actualSumChild1);
    }

    // Test sumOfStringAndNumber
    int expectedSumStringAndNumberChild1 = 30;
    int actualSumStringAndNumberChild1 = child1.sumOfStringAndNumber("10", 5);
    if (expectedSumStringAndNumberChild1 == actualSumStringAndNumberChild1) {
      System.out.println("Тест sumOfStringAndNumber Child1 пройден успешно!");
    } else {
      System.out.println("Тест sumOfStringAndNumber Child1 не пройден. Ожидался: "
          + expectedSumStringAndNumberChild1 + ", получен: " + actualSumStringAndNumberChild1);
    }

    // Test returnString
    String expectedReturnStringChild1 = "H";
    String actualReturnStringChild1 = child1.returnString("Hello");
    if (expectedReturnStringChild1.equals(actualReturnStringChild1)) {
      System.out.println("Тест returnString Child1 пройден успешно!");
    } else {
      System.out.println(
          "Тест returnString Child1 не пройден. Ожидался: " + expectedReturnStringChild1
              + ", получен: " + actualReturnStringChild1);
    }

    // Test concatenateStrings
    String expectedConcatenateStringsChild1 = "Hello";
    String actualConcatenateStringsChild1 = child1.concatenateStrings("Hello", "World");
    if (expectedConcatenateStringsChild1.equals(actualConcatenateStringsChild1)) {
      System.out.println("Тест concatenateStrings Child1 пройден успешно!");
    } else {
      System.out.println(
          "Тест concatenateStrings Child1 не пройден. Ожидался: " + expectedConcatenateStringsChild1
              + ", получен: " + actualConcatenateStringsChild1);
    }

    // Тестирование методов Child2
    Child2 child2 = new Child2();

    // Test sumOfTwoNumbers
    int expectedSumChild2 = 6;
    int actualSumChild2 = child2.sumOfTwoNumbers(1, 2, 3);
    if (expectedSumChild2 == actualSumChild2) {
      System.out.println("Тест sumOfTwoNumbers Child2 пройден успешно!");
    } else {
      System.out.println(
          "Тест sumOfTwoNumbers Child2 не пройден. Ожидался: " + expectedSumChild2 + ", получен: "
              + actualSumChild2);
    }

    // Test sumOfStringAndNumber
    int expectedSumStringAndNumberChild2 = 6;
    int actualSumStringAndNumberChild2 = child2.sumOfStringAndNumber("1", "2", "3");
    if (expectedSumStringAndNumberChild2 == actualSumStringAndNumberChild2) {
      System.out.println("Тест sumOfStringAndNumber Child2 пройден успешно!");
    } else {
      System.out.println("Тест sumOfStringAndNumber Child2 не пройден. Ожидался: "
          + expectedSumStringAndNumberChild2 + ", получен: " + actualSumStringAndNumberChild2);
    }

    // Test returnString
    String expectedReturnStringChild2 = "HelloWorld";
    String actualReturnStringChild2 = child2.returnString("Hello", "World");
    if (expectedReturnStringChild2.equals(actualReturnStringChild2)) {
      System.out.println("Тест returnString Child2 пройден успешно!");
    } else {
      System.out.println(
          "Тест returnString Child2 не пройден. Ожидался: " + expectedReturnStringChild2
              + ", получен: " + actualReturnStringChild2);
    }

    // Test concatenateStrings
    String expectedConcatenateStringsChild2 = "HelloWorldJava";
    String actualConcatenateStringsChild2 = child2.concatenateStrings("Hello", "World", "Java");
    if (expectedConcatenateStringsChild2.equals(actualConcatenateStringsChild2)) {
      System.out.println("Тест concatenateStrings Child2 пройден успешно!");
    } else {
      System.out.println(
          "Тест concatenateStrings Child2 не пройден. Ожидался: " + expectedConcatenateStringsChild2
              + ", получен: " + actualConcatenateStringsChild2);
    }
  }
}