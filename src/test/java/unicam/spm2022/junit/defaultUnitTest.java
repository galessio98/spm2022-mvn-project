package unicam.spm2022.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class defaultUnitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	@Disabled
	void test1() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void test2() {
		fail("Not yet implemented");
	}

}
