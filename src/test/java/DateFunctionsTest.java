import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Locale;

import org.junit.Test;

import com.offbytes.h2.oracle.DateFunctions;

public class DateFunctionsTest {
	
	@Test
	public void shouldToDate() throws Exception {
		Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
		calendar.setTime(
				DateFunctions.toDate("29-Oct-09", "DD-Mon-YY"));
		
		assertEquals(29, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(9, calendar.get(Calendar.MONTH));
		assertEquals(2009, calendar.get(Calendar.YEAR));
	}
	
	@Test
	public void shouldToDate2() throws Exception {
		Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
		calendar.setTime(
				DateFunctions.toDate("10/29/09", "MM/DD/YY"));
		
		assertEquals(29, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(9, calendar.get(Calendar.MONTH));
		assertEquals(2009, calendar.get(Calendar.YEAR));
	}
	
	@Test
	public void shouldToDate3() throws Exception {
		Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
		calendar.setTime(
				DateFunctions.toDate("120109", "MMDDYY"));
		
		assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(11, calendar.get(Calendar.MONTH));
		assertEquals(2009, calendar.get(Calendar.YEAR));
	}
	
	@Test
	public void shouldToDate4() throws Exception {
		Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
		calendar.setTime(
				DateFunctions.toDate("29-Oct-09 12:01:02", "DD-Mon-YY HH:MI:SS"));
		
		assertEquals(29, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(9, calendar.get(Calendar.MONTH));
		assertEquals(2009, calendar.get(Calendar.YEAR));
		assertEquals(12, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(1, calendar.get(Calendar.MINUTE));
		assertEquals(2, calendar.get(Calendar.SECOND));
	}
	
	@Test
	public void shouldToDate5() throws Exception {
		Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
		calendar.setTime(
				DateFunctions.toDate("29-October-09 12:01:02", "DD-Month-YY HH:MI:SS"));
		
		assertEquals(29, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(9, calendar.get(Calendar.MONTH));
		assertEquals(2009, calendar.get(Calendar.YEAR));
		assertEquals(12, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(1, calendar.get(Calendar.MINUTE));
		assertEquals(2, calendar.get(Calendar.SECOND));
	}
}