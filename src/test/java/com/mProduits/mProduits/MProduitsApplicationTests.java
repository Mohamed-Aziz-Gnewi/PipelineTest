package com.mProduits.mProduits;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MProduitsApplicationTests {
	calculator testSubj = new calculator();

	@Test
	void contextLoads() {
	}
	@Test
	void itShouldBeNumbers()
	{
		int one=10;
		int two=11;
		int expected=21;

		int result= testSubj.add(one,two);
		assertThat(result).isEqualTo(expected);
	}

	class calculator{
		int add(int a,int b){return a+b;}
	}

}
