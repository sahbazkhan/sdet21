package com.program;

public class Test4 {

	public static void main(String[] args) {
	int numb=4321,rem,rev=0;
	while(numb!=0)
	{
		rem=numb%10;
		rev=rev*10+rem;
		numb=numb/10;
	}
       System.out.println(rev);
	}

}
