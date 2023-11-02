import java.util.Scanner;

// Triangle деген класс тузунуз.
//
//Класстын 3 полеси болсун a, b, c.
//
//Класстын "area" деген методу болсун.
//
//"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//
//таянып консолго уч бурчтуктун аянтын чыгарсын.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner.nextInt();
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        System.out.println("Введите с:");
        int c = scanner.nextInt();
        Triangle triangle = new Triangle(a,b,c);
        triangle.area();

    }}