import java.util.Scanner;
public class Janken{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String [] str = new String[3] ;    
        str [0] = "gu";
        str [1] = "tyoki";
        str [2] = "pa";
        int a = 3;
        int b = 3;
	
        System.out.println("player 1");
        do{
            System.out.println("0 = gu , 1 = tyoki , 2 = pa");	
            a  = sc.nextInt();		
        }while(a < 0 || a > 2 );       		   
        System.out.println("player1 "+str[a]);
         		 	 
        System.out.println("player 2");
        do{
            System.out.println("0 = gu , 1 = tyoki , 2 = pa"); 
            b  = sc.nextInt();		
	}while(b < 0 || b >2 );		   
        System.out.println("player2 "+str[b]);           
				   
        if(a==0){
            if(b==0){
                System.out.println("draw");
            }else if(b==1){
                System.out.println("player1 wins");		  
            }else if(b==2){
                System.out.println("player2 wins");
            }
	}	  
        if(a==1){
            if(b==1){
                System.out.println("draw");
            }else if(b==2){
                System.out.println("player1 wins");
	    }else if(b==0){
                System.out.println("player2 wins");
            }
	}
        if(a==2){
            if(b==2){
                System.out.println("draw");
            }else if(b==0){
                System.out.println("player1 wins");
            }else if(b==1){
                System.out.println("player2 wins");
            }
        } 
    }
}
