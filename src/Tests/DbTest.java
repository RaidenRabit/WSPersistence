package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import DbLayer.*;

public class DbTest {
		
		@Test
		public void testGetConnection(){
			assertNotNull(DbConnection.getInstance().getConnection());
		}


}
