class Account
{
     int acc_no;
     String name;
     float amount;

    void insert(int an, String nm, float amt)
    {
         acc_no = an;
         name = nm;
         amount = amt;
    }
   void deposite(float amt)    
   {
        amount = amount + amt;
        System.out.println(amt+" amount deposited");
   }
   void withdraw(float amt)
   {
        if(amount < amt)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            amount = amount - amt;
            System.out.println(amt+" amount withdrawn");
        }
   }

   void checkBalance()
   {
          System.out.println("Balance is : "+amount);
   }

   void display()
   {
        System.out.println(acc_no+" "+name+" "+amount);
   }
}
class TestAccount
{
     public static void main(String[] args)
     {
          Account act1 = new Account();
           act1.insert(8986876,"Radhe sharma",50000);
           act1.checkBalance();
           act1.deposite(1000);
           act1.checkBalance();
           act1.withdraw(10000);
           act1.checkBalance();
     }



}