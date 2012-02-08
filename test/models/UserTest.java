package models;

import org.junit.Test;

import play.test.UnitTest;

public class UserTest extends UnitTest{

	@Test
	public void testCreation () {
		User usr = new User("McCoy", "moa@example.com", "geheim");
		usr.save();
		
		User usrDoesNotExist = User.find("byName", "Klaus").first();
		assertNull(usrDoesNotExist);
		
		User usrFromDb = User.find("byName", "McCoy").first();
		assertNotNull (usrFromDb);
		assertEquals (usrFromDb.email, "moa@example.com");
	}
}
