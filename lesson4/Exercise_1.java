import java.util.Scanner;

class Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("底辺は(cm)？");
        double bottom = scan.nextInt();
        System.out.println("高さは(cm)？");
        double height = scan.nextInt();

        double area = (bottom * height) / 2;
        System.out.println("面積は" + area + "㎠");
    }
}
