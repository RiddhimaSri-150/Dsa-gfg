public class Calc{
public static void main(String[] args) {
       Scanner i = new Scanner(System.in);
       int num1 = i.nextInt();
       int num2 = i.nextInt();
       char op = i.next().trim().charAt(0);
       int res = 0;
       if (op == '+'){
           res = num1+ num2;
       }
        else if (op == '-'){
            res = num1+ num2;
        }
        else if (op == '*'){
            res = num1+ num2;
        }
        else if (op == '/'){
            if(num2 != 0)
              res = num1+ num2;
        }
        else
            System.out.println("Invalid operator");
        System.out.println(res);
    }
}    