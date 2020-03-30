package com.epam.junitdemo;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;



public class Remove2A {
	/*

	 * REMOVE A CHARACTERS IN A STRING

	 *

	 * 1.ABCD=>BCD

	 * 2.AACD=>CD

	 * 3.BBAA=>BBAA

	 * 4.AABAA=>BAA

	 * 5.empty string

	 * 6.BACA=>BCA

	 * 7.A=>""

	 * 8.AA=>""

	 * 9.AAA=>A

	 * 10.AAB=>B

	 */

	RemoveA d ;

	

	@BeforeEach

	void createObject() {

		d = new RemoveA();

	}

	

	

	

	@Test

	void test1() {

		assertEquals("BCD", d.deleteA("ABCD"));

		}

	

	@Test

	void test2() {

		

		assertEquals("CD", d.deleteA("AACD"));

				

	}

	

	@Test

	void test3() {

		assertEquals("BBAA", d.deleteA("BBAA"));

	}

	

	@Test

	void test4() {

		

		assertEquals("BAA", d.deleteA("AABAA"));

		

	}

	@Test

	void testempty5() {

		

		assertEquals("", d.deleteA(""));	

	}

	

	@Test

	void test6() {

		assertEquals("BCD", d.deleteA("BACD"));

		}



	

	@Test

	void test7() {

		assertEquals("", d.deleteA("A"));

		}

	

	

	

	@Test

	void test8() {

		assertEquals("", d.deleteA("AA"));

		}

	

	@Test

	void test9() {

		assertEquals("A", d.deleteA("AAA"));

		}

	

	

	@Test

	void test10() {

		assertEquals("B", d.deleteA("AAB"));

		}



}




