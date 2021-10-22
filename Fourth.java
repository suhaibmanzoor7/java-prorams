import java.util.Scanner;

interface Cal{
    int add(int p, int q);
    int mul(int p,int q);
    int sub(int p,int q);
    int div(int p,int q);
}
class Major implements Cal{

       int z;

    public int add(int p,int q){
        z=p+q;
        return z;
    }
    public int mul(int p,int q){
         z=p*q;
        return z;
}
    public int sub(int p,int q) {
        z=p-q;
        return z;
    }
    public int div(int p,int q) {
        z=p/q;
        return z;
    }
}
public class Fourth {
    public static void main(String[] args) {
        Cal test = new Major();
        System.out.println("enter two numbers");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();

        System.out.println("enter operator");
        char chk = obj.next().charAt(0);
        switch (chk) {
            case '+': {
                System.out.println(test.add(a,b));
                break;
            }
            case '-': {
                System.out.println(test.sub(a,b));
                break;
            }
            case '*': {
                System.out.println(test.mul(a,b));
                break;
            }
            case '/': {
                System.out.println(test.div(a,b));
                break;
            }
            default:{
                System.out.println("choose valid operator");
            }
        }
    }
}




