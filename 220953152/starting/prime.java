
class prime {
    public static void main(String[] args){
         
        int flag=0;
          System.out.println( "prime num");
         for(int numm=3; numm<=100; numm++){
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