package task.methods;

public class Methods {

    public String stringToLowerCase(String str) {
        return str.toLowerCase();
    }

    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public String sumOfTwoStrings(String a, String b) {
        return a + b;
    }

    public String sumOfStringAndNumber(String str, int num) {
        int s = Integer.parseInt(str);
        s = s + num;
        String itog = Integer.toString(s);
        return itog;
    }

    public boolean compareStringNumberWithInt(String str, int num) {
        int n1 = Integer.parseInt(str);
        return n1 < num;
    }

    public boolean checkBooleans(boolean a, boolean b) {
        return a || b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public String checkArrayEvenOdd(int[] arr) {
        boolean even = false;
        boolean uneven = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = true;

            } else {
                uneven = true;

            }
            if (even == true && uneven == true) {
                return "Массив четных и нечетных чисел";
            }
        }
        if (uneven == true) {
            return "Массив нечетных чисел";
        } else if (even == true) {
            return "Массив четных чисел";
        }
        return "";
    }

    public int[] sumArrayElements(int[] arr) {//по сути сделал правильно, но ответ неверен
        int[] numb = new int[arr.length];
        numb[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            numb[i] = arr[i] + numb[i - 1];

        }
        return numb;
    }

    public int sumArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = arr[i] + result;

        }
        return result;
    }

    public int ageInMonths(int years) {
        return years * 12;
    }

    public int ageInMinutes(int years) {
        return years * 12 * 24 * 60;
    }

    public int ageInHours(int years) {
        return years * 12 * 24;
    }

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }

    public int getLastElement(int[] arr) {
        int i = arr.length - 1;
        return arr[i];
    }

    public int countLetterA(String str) {
        char letter = 'a';
        int summa = 0;
        String str1 = str.toLowerCase();
        for (int i = 0; str.length() > i; i++) {
            if (str1.charAt(i) == letter) {
                summa++;
            }
        }
        return summa;
    }

    private int wallet = 1000;

    public String withdraw(int amount) {
        if (amount > wallet) {
            return "Не хватает денег. В кошельке находится" + wallet;
        }
        wallet = wallet - amount;
        return "Остаток в кошельке: " + wallet;
    }

    public String deposit(int amount) {
        wallet = wallet + amount;
        return "Остаток в кошельке: " + wallet;
    }
}