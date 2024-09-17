package ss_9;

public class DateUtilsTest {
    @Test
    public void testNextDayForRegularDate() {
        assertEquals("2024-09-18", DateUtils.getNextDay("2024-09-17"));
    }

    private void assertEquals(String date, String nextDay) {
    }

    @Test
    public void testNextDayForEndOfMonth() {
        assertEquals("2024-10-01", DateUtils.getNextDay("2024-09-30"));
    }

    @Test
    public void testNextDayForLeapYearFebruary() {
        assertEquals("2024-03-01", DateUtils.getNextDay("2024-02-29"));
    }

    @Test
    public void testNextDayForEndOfYear() {
        assertEquals("2025-01-01", DateUtils.getNextDay("2024-12-31"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDate() {
        DateUtils.getNextDay("2024-02-30");
    }

}
