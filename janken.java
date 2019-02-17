
import java.util.Scanner;
public class janken{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
		System.out.println("gu ha 1, tyoki ha 2 pa ha3");
		int a=sc.nextInt();
		System.out.println("gu ha 1, tyoki ha 2 pa ha3");
		int b=sc.nextInt();
        System.out.println("gu ha 1, tyoki ha 2 pa ha3");
	    if(a==1){
            if(b==2){
             System.out.println("a wins");
            }else if(b==3){
             System.out.println("b wins");
           }else if(a==2){
            if(b==3){
             System.out.println("a wins");
            }else if(b==1){
             System.out.println("b wins");
           }else if(a==3){
            if(b==1){
             System.out.println("a wins");
           }else if(b==2){
             System.out.println("b wins");
           }else{ 
             System.out.println("draw");
             }
             }
            }
            }          
         }
}