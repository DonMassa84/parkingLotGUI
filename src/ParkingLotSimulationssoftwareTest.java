
public class ParkingLotSimulationssoftwareTest {
	@Test 
	public void testKonfiguration() { 
		ParkhausSimulationssoftware parkhaus = new ParkhausSimulationssoftware(); 
		parkhaus.setAnzahlParkplaetze(100); 
		parkhaus.setParkdauer(60); 
		parkhaus.setGebuehr(1.5); 
		
		assertEquals(100, parkhaus.getAnzahlParkplaetze());

		assertEquals(60, parkhaus.getParkdauer()); 
		assertEquals(1.5, parkhaus.getGebuehr(), 0.01); }
	@Test 
	public void testSimulation() { 
		ParkhausSimulationssoftware parkhaus = new ParkhausSimulationssoftware(); 
		parkhaus.setAnzahlParkplaetze(100); 
		parkhaus.setParkdauer(60); 
		parkhaus.setGebuehr(1.5); 
		parkhaus.startSimulation(); 
		assertTrue(parkhaus.isSimulationGestartet()); 
		parkhaus.stopSimulation(); 
		assertFalse(parkhaus.isSimulationGestartet()); 
	}
}
