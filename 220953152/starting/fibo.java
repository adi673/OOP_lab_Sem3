
class fibo {
    public static void main(String[] args){
         int num=6;
         int a=0;
         int b=1;
         int c=0;
         
         
         for(int i=0; i<num; i++){
             System.out.println( a );
             c=a+b;
             a=b;
             b=c;
             
         }
         
         
     }
 }