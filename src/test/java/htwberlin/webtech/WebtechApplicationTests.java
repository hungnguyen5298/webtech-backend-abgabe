package htwberlin.webtech;

import htwberlin.webtech.web.WebtechApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = WebtechApplication.class)
class WebtechApplicationTests {

	@Test
	void testAddition() {
		int a = 2;
		int b = 3;
		int result = a + b;
		assertEquals(5, result, "Addition result is incorrect");
	}

}
