package exercises;

class ClassA {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    void ClassA() {
        System.out.println("Oh... those default constructors");
    }

    public int getX() {
        return x;
    }
}

class ClassB extends ClassA {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}

public class Test {
    public static String intToWords(int number) {
        String st = "";
        int s,d,e;
        s = number / 100; //сотни
        d = number / 10 % 10; //десятки
        e = number % 10; //единицы

        switch (s) {
            case 1:
                st += "cто";
                break;
            case 2:
                st += "двести";
                break;
            case 3:
                st += "триста";
                break;
            case 4:
                st += "четыреста";
                break;
            case 5:
                st += "пятьсот";
                break;
            case 6:
                st += "шестьсот";
                break;
            case 7:
                st += "семьсот";
                break;
            case 8:
                st += "восемьсот";
                break;
            case 9:
                st += "девятьсот";
                break;
        }
        if (number % 100 >= 10 && number % 100 < 20) {
            switch (number % 100) {
                case 10:
                    st += " десять";
                    break;
                case 11:
                    st += " одиннадцать";
                    break;
                case 12:
                    st += " двенадцать";
                    break;
                case 13:
                    st += " тринадцать";
                    break;
                case 14:
                    st += " четырнадцать";
                    break;
                case 15:
                    st += " пятнадцать";
                    break;
                case 16:
                    st += " шестнадцать";
                    break;
                case 17:
                    st += " семнадцать";
                    break;
                case 18:
                    st += " восемнадцать";
                    break;
                case 19:
                    st += " девятнадцать";
                    break;
            }
        } else {
            switch (d) {
                case 0:
                    st += "";
                    break;
                case 2:
                    st += " двадцать";
                    break;
                case 3:
                    st += " тридцать";
                    break;
                case 4:
                    st += " сорок";
                    break;
                case 5:
                    st += " пятьдесят";
                    break;
                case 6:
                    st += " шестьдесят";
                    break;
                case 7:
                    st += " семьдесят";
                    break;
                case 8:
                    st += " восемьдесят";
                    break;
                case 9:
                    st += " девяносто";
                    break;
            }
            switch (e) {
                case 1:
                    st += " один";
                    break;
                case 2:
                    st += " два";
                    break;
                case 3:
                    st += " три";
                    break;
                case 4:
                    st += " четыре";
                    break;
                case 5:
                    st += " пять";
                    break;
                case 6:
                    st += " шесть";
                    break;
                case 7:
                    st += " семь";
                    break;
                case 8:
                    st += " восемь";
                    break;
                case 9:
                    st += " девять";
                    break;
            }
        }
        st = st.trim();
        st = st.substring(0, 1).toUpperCase() + st.substring(1);
        return st;
    }

    public static void main(String[] args) {
        System.out.println(intToWords(112));
    }
}
