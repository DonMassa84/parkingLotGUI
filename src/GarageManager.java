class GarageManager {
    public static void main(String[] args) {
        Garage garage = new Garage(3, 5); // 3 Etagen, 5 Parkplätze pro Etage

        // Fahrzeuge erstellen
        Car car1 = new Car("ABC123");
        Motorcycle motorcycle1 = new Motorcycle("XYZ789");

        // Fahrzeuge parken
        System.out.println(garage.parkVehicle(car1)); // Sollte true ausgeben, da Platz vorhanden ist
        System.out.println(garage.parkVehicle(motorcycle1)); // Sollte true ausgeben, da Platz vorhanden ist

        // Position eines Fahrzeugs abfragen
        int[] car1Position = garage.getVehiclePosition(car1.getLicensePlate());
        System.out.println("Car1 ist auf Etage " + car1Position[0] + " und Parkplatz " + car1Position[1]);

        // Anzahl der freien Parkplätze abfragen
        System.out.println("Anzahl der freien Parkplätze: " + garage.getNumberOfFreeSpaces());

        // Fahrzeug entfernen
        System.out.println(garage.removeVehicle(car1.getLicensePlate())); // Sollte true ausgeben, da das Fahrzeug vorhanden ist

        // Anzahl der freien Parkplätze erneut abfragen
        System.out.println("Anzahl der freien Parkplätze: " + garage.getNumberOfFreeSpaces());
    }
}