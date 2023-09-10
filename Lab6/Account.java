import java.util.Scanner; 
public class account1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int choice,k=0,j=0,sav_or_cur,no_check;
        savings_acc[] savings_arr=new savings_acc[10];
        curr_acc[] curr_arr=new curr_acc[10];
        do{
            System.out.println("__Menu__");
            System.out.println("1.create account");
            System.out.println("2.Deposit");
            System.out.println("3.Display Balance");
            System.out.println("4.Withdraw");
            System.out.println("5.Add interest to savings account");
            System.out.println("6.Minimum balance check for current account");
            System.out.println("7.Exit");
            System.out.println("----------------");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Savings or current?(1/2)");
                    sav_or_cur=sc.nextInt();
                    System.out.println("enter account no:");
                    int num=sc.nextInt();
                    System.out.println("enter name");
                    sc.nextLine();
                    name=sc.nextLine();
                    if(sav_or_cur==1){
                        savings_acc s1=new savings_acc(name,num);
                        savings_arr[k]=s1;
                        k++;}
                    else if(sav_or_cur==2){
                        curr_acc c1=new curr_acc(name,num);
                        curr_arr[j]=c1;
                        j++;}
                    else 
                        System.out.println("invalid");
                    break;
                case 2:
                    System.out.println("enter amount");
                    int amount_dep=sc.nextInt();
                    System.out.println("Savings or current?(1/2)");
                    sav_or_cur=sc.nextInt();
                    System.out.println("enter acc no");
                    no_check=sc.nextInt();
                    if(sav_or_cur==1){
                        for(int i=0;i<10;i++){
                            if(savings_arr[i].acc_no==no_check){
                                savings_arr[i].deposit(amount_dep);
                                break;
                            }
                        }
                    }
                    else if(sav_or_cur==2){
                        for(int i=0;i<10;i++){
                            if(curr_arr[i].acc_no==no_check){
                                curr_arr[i].deposit(amount_dep);
                                break;
                            }
                        }
                    }
                    else
                        System.out.println("invalid");
                    break;
                    
                    case 3:
                        System.out.println("Savings or current?(1/2)");
                        sav_or_cur=sc.nextInt();
                        System.out.println("enter acc no");
                        no_check=sc.nextInt();
                        if(sav_or_cur==1){
                        for(int i=0;i<10;i++){
                            if(savings_arr[i].acc_no==no_check){
                                savings_arr[i].balance_disp();
                                break;
                            }
                        }
                        }
                        else if(sav_or_cur==2){
                            for(int i=0;i<10;i++){
                                if(curr_arr[i].acc_no==no_check){
                                    curr_arr[i].balance_disp();
                                    break;
                                }
                            }
                        }
                        else
                            System.out.println("invalid");
                        break;
                    
                    case 4:
                        System.out.println("Savings or current?(1/2)");
                        sav_or_cur=sc.nextInt();
                        System.out.println("enter acc no");
                        no_check=sc.nextInt();
                        System.out.println("enter withdraw amt");
                        int withdrew=sc.nextInt();
                        if(sav_or_cur==1){
                        for(int i=0;i<10;i++){
                            if(savings_arr[i].acc_no==no_check){
                                savings_arr[i].withdraw(withdrew);
                                break;
                                
                            }
                        }
                        }
                        else if(sav_or_cur==2){
                            for(int i=0;i<10;i++){
                                if(curr_arr[i].acc_no==no_check){
                                    curr_arr[i].withdraw(withdrew);
                                    break;
                                }
                            }
                        }
                        else
                            System.out.println("invalid");
                        break;
                    case 5:
                        System.out.println("enter acc no");
                        no_check=sc.nextInt();
                        System.out.println("enter interest rate");
                        double r8=sc.nextDouble();
                        for(int i=0;i<10;i++){
                            if(savings_arr[i].acc_no==no_check){
                                savings_arr[i].interest(r8);
                                break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("enter acc no");
                        no_check=sc.nextInt();
                        System.out.println("enter minimum amount");
                        int min_check=sc.nextInt();
                        System.out.println("enter tax rate");
                        double taxr8=sc.nextDouble();
                        for(int i=0;i<10;i++){
                            if(curr_arr[i].acc_no==no_check){
                                curr_arr[i].min_bal(min_check,taxr8);
                                break;
                            }
                        }
                        break;
                    case 7:
                        System.out.println("exiting.....");
                        break;
                    default:
                        System.out.println("invalid");
                        break;           
            }
        }while(choice!=7);
        sc.close();
    }
}
class account{
    String acc_name;
    double acc_no;
    String Type_acc;
    double balance=0;
}
class curr_acc extends account{
    
    curr_acc(String acc_name,double acc_no){
        this.acc_name=acc_name;
        this.acc_no=acc_no;
        this.Type_acc="current account";
    }
    void balance_disp(){
        System.out.println("Balance="+balance);
    }
    
    void deposit(int depo){
        balance+=depo;
        balance_disp();
    }
    void withdraw(int withd){
        balance-=withd;
        balance_disp();
    }
    void min_bal(int minim,double tax){
        balance_disp();
        if(balance<minim){
            balance-=(balance*(tax/100));
            System.out.println("balance below minimum requrement.Service tax applied");
            balance_disp();
        }
        else{
            System.out.println("balance above minimum requirement");
            balance_disp();
        }
    }
}
class savings_acc extends account{
    savings_acc(String acc_name,double acc_no){
        this.acc_name=acc_name;
        this.acc_no=acc_no;
        this.Type_acc="savings account";
    }
    
    void balance_disp(){
        System.out.println("Balance="+balance);
    }
    void deposit(int depo){
        balance+=depo;
        balance_disp();
    }
    void withdraw(int withd){
        balance-=withd;
        balance_disp();
    }
    void interest(double rate){
        balance=balance+(balance*(rate/100));
        System.out.println("interest deposited");
        balance_disp();
    }
}
