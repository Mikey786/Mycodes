import java.util.Scanner;
class Box{
  double len;
  double bre ;
  double hei;
  Scanner scanner = new Scanner(System.in);

  public void Volume(){
    System.out.print("Enter the length :");
    len = scanner.nextDouble();
    System.out.print("Enter the breadth :");
    bre = scanner.nextDouble();
    System.out.print("Enter the height :");
    hei = scanner.nextDouble();
  }

  public void displayDetails(){
    System.out.println("Length :" + len);
    System.out.println("breadth : "+ bre);
    System.out.println("height : " + hei);
    System.out.println(len*bre*hei);
  }
}
public class Main {
    public static void main(String[] args) {
      Box obj = new Box();
      obj.Volume();
      obj.displayDetails();
      }
        }
