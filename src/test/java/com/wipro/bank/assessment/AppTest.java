package com.wipro.bank.assessment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wipro.bank.entity.Account;

public class AppTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetAccountDetailsByID1() {
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		assertNull(new App().getAccountDetailsByID(567));
	}
	
	/*@Test
	public void testGetAccountDetailsByID2() {
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		Account acc=new App().getAccountDetailsByID(2);
		assertNotNull(acc);
		assertEquals("patel",acc.getUserName());
	}
	*/
	@Test
	public void getAccountDetailsByBalance1(){
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		assertNull("When No account found:",new App().getAccountDetailsByBalance(909.01));
	}
	
	@Test
	public void getAccountDetailsByBalance2(){
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		List<Account> actualAccounts=new App().getAccountDetailsByBalance(0.0);
		assertNotNull(actualAccounts);
		assertEquals(App.accounts.size(),actualAccounts.size());
	}
	
	@Test
	public void getAccountDetailsByBalance3(){
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		double amount=201.01;
		
		List<Account> checkActualAccounts=new ArrayList<Account>();		
		for(Account account:App.accounts){			
			if(account.getBalance()>=amount){				
				checkActualAccounts.add(account);
			}
		}
		if(checkActualAccounts.size()==0){
			checkActualAccounts=null;
		}
		
		List<Account> actualAccounts=new App().getAccountDetailsByBalance(amount);
		assertNotNull(actualAccounts);
		assertEquals(checkActualAccounts.size(),actualAccounts.size());
	}

}