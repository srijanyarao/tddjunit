package com.epam.junitdemo;

public class RemoveA {
	public String deleteA(String string) {

		// TODO Auto-generated method stub

		

		char A[] = string.toCharArray();

		

		int stringLength =A.length;

		switch(stringLength)

		{

		case 0: 

			break;

		case 1:

			if(A[0] == 'A')

				A[0] = ' ';

			break;

		default:

			if(A[0] == 'A')

				A[0] = ' ';

			if(A[0] != 'A' && A[1] == 'A')

			{

				A[1] = A[0];

				A[0] = ' ';

			}

			break;

	

		}

		return new String(A).trim();

	}



}
