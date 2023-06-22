import java.util.Scanner;

public class Assignment08 {
    static String removeLeftRightOfStar(String str)
{
    if(str.contains("*"))
    {
    int index=str.indexOf("*");
    return str.substring(0,index-1).concat(str.substring(index+2,str.length()));
    }
    
      else return str;
   

}
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        System.out.println(removeLeftRightOfStar(str));
}
}
