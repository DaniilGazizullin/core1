package task.oop;

public class Child1 extends Parent {
    @Override
    public int sumOfTwoNumbers(int a, int b) {
        return a * b;
    }

    @Override
    public int sumOfStringAndNumber(String str, int num) {
        int num1 = Integer.parseInt(str);
        return (num1 + num) * 2;
    }

    @Override
    public String returnString(String str) {
        return Character.toString(str.charAt(0));
    }

    @Override
    public void printParent() {
        System.out.println("I am Child1");
    }

    @Override
    public String concatenateStrings(String str1, String str2) {
        String str = str1 + str2;
        int lenght = str.length();
        char[] array = new char[lenght / 2];
        for (int i = 0; i < lenght / 2; i++) {
            array[i] = str.charAt(i);
        }
        String string1 = new String(array);
        return string1;
    }
}
//sum(int a, int b) : переопределите метод так, чтобы он перемножал числа, а не складывал.
//sumFromString(String str, int num) : переопределите метод так, чтобы получившееся число после суммирования умножалось на 2.
//returnString(String str) : переопределите метод так, чтобы он возвращал только первую букву из строки.
//printParent() : переопределите метод так, чтобы он выводил на экран "I am Child1".
//concatenateStrings(String str1, String str2) : переопределите метод так, чтобы после слияния двух строк он обрезал строку и возвращал только ее половину.