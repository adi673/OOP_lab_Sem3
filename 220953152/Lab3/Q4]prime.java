

import java.util.Scanner;
class num {
    public static void main(String[] args){
        
        
        Scanner scanner = new Scanner(System.in);
        int flag=0;

        int n, m;
        System.out.println( "Enter lower Limit");
        n = scanner.nextInt();
        System.out.println( "Enter upper Limit");
        m = scanner.nextInt();
        System.out.println( "prime num");
        for(int numm=n; numm<=m; numm++){
            flag=0;
            for(int j=2; j<=numm/2; j++){
                if(numm%j==0){
                    flag=1; 
                    break;
                }
            }
            if(flag==0){
                System.out.println( numm );
                flag=0;
            }
             
        }
    
    }
    
   
}
