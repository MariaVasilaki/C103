import java.util.Scanner;

public class WindowMaster {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give height");
        String height = sc.nextLine();
        System.out.println("Please give width");
        String width = sc.nextLine();
        float h = Float.parseFloat(height);
        float w = Float.parseFloat(width);
        float perimeter = 2*h + 2*w;
        float area = h * w;
        float cost = (float) (area * 3.50 + perimeter * 2.25);
        System.out.println("Given the window height " + h + " and width "+ w +", the area and perimeter of the window are " + area + perimeter + " respectively, and the total cost is: " + cost);

    }



}
