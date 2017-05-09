package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

/**
 * Hello world!
 *
 */
public class App 
{        
        public static List<Account> accounts=new ArrayList<Account>(); 

        public void Add(Account a)
        {
               accounts.add(a);
        }
        public Account getAccountDetailsByID(int id){ 

               int i;
            Account result=null;
            for(i=0;i<accounts.size();i++)
            {
               if(accounts.get(i).getAccountID()==id) result = accounts.get(i);
            }
               return result;

        } 


        public List<Account> getAccountDetailsByBalance(double amount) 
        { 
               int i;
               List<Account> result=new ArrayList<Account>();
            for(i=0;i<accounts.size();i++)
            {
               if(accounts.get(i).getBalance()>=amount) result.add(accounts.get(i));
            }
            if(result.size()==0)
            {
               return null;
            }
            else
            {
                      return result;
            }
        }
            public static void main( String[] args )
            {
            	Account Acc1=new Account(1, "Santosh", 4.4);
            }
        
    
        

}
