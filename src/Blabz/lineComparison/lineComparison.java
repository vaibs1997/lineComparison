package Blabz.lineComparison;

public class lineComparison
{
    public static void main(String args[]){
        int x1=10;
        int x2=20;
        int y1=12;
        int y2=27;
        int a1=20, a2=35, b1=22, b2=27;

        int result, result2;
        result= (int) (Math.sqrt((x2-x1)^2+(y2-y1)^2));
        result2= (int) (Math.sqrt((a2-a1)^2+(b2-b1)^2));

        System.out.println("length of line 1"+result);
        System.out.println("length of line 2"+result2);
        if(result==result2)
            System.out.println("both lines are equal");
        else
            System.out.println("both lines are not equal");

    }

}
