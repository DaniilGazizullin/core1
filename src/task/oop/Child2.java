package task.oop;

public class Child2 {

  public int sumOfTwoNumbers(int a, int b, int c) {
    return a+b+c;
  }

  public int sumOfStringAndNumber(String str1, String str2, String str3) {
    int num1=Integer.parseInt(str1);
    int num2=Integer.parseInt(str2);
    int num3=Integer.parseInt(str3);
    return num1+num2+num3;
  }

  public String returnString(String str1, String str2) {
    return str1+str2;
  }

  public void printParent(String str) {
    System.out.println("I am Child2"+str);
  }

  public String concatenateStrings(String str1, String str2, String str3) {
    return str1+str2+str3;
  }
}

//sum(int a, int b, int c) : перегрузите метод так, чтобы он принимал 3 числа и возвращал их сумму.
//sumFromString(String str1, String str2, String str3) : перегрузите метод так, чтобы он принимал 3 строки, внутри которых лежат числа, и возвращал их сумму.
//concatenateStrings(String str1, String str2) : перегрузите метод так, чтобы он принимал две строки и возвращал их конкатенацию.
//printChild2(String str) : перегрузите метод так, чтобы он принимал аргумент строку и выводил на экран "I am Child2" + переданную строку.
//concatenateStrings(String str1, String str2, String str3) : перегрузите метод так, чтобы он принимал 3 строки и возвращал их конкатенацию.