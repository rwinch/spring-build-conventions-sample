package sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MessageServicTest {

	@Test
	public void message() {
		assertThat(new MessageService().message()).isEqualTo("Hello World");
	}
}
