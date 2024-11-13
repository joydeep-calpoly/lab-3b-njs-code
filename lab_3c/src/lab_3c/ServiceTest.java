package lab_3c;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;

class ServiceTest {

	@Test
	public void test() {
		Database dbMock = Mockito.mock(Database.class);
		when(dbMock.getUniqueId()).thenReturn(42);
		Service service = new Service(dbMock);
		assertEquals(service.getDatabaseID(), "Using database with id: 42");
	}
}
