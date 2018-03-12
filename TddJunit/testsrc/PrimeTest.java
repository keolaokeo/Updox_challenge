import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.updox.prime.Prime;

class PrimeTest {

	private Prime testPrime;
	
	@BeforeEach
	void setUp() throws Exception {
		testPrime = new Prime();
	}

	@Test
	void testGenerate() {
		List<Integer> test1 = Arrays.asList(3,5,7);
	     assertThat(test1, is(testPrime.generate(3,7)));
	     assertThat(test1.size(), is(3));

	     List<Integer> test2 = Arrays.asList(7901,7907,7919);
	     assertThat(test2, is(testPrime.generate(7900,7920)));
	     assertThat(test2.size(), is(3));
	}

	@Test
	void testIsPrime() {
		assertEquals(false,testPrime.isPrime(1));
		assertEquals(true,testPrime.isPrime(5));
		assertEquals(true,testPrime.isPrime(19));
		assertEquals(false,testPrime.isPrime(20));
	}

}
