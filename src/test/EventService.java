package test;

class EventService {

    public void registerParticipant(
            String firstName,
            String lastName,
            String street,
            String city,
            String zip,
            String email,
            String eventName,
            double price) {

        // Validierung
        if (firstName == null || lastName == null || email == null) {
            System.out.println("Invalid participant data");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid email");
            return;
        }

        // Adresse ausgeben
        System.out.println(firstName + " " + lastName);
        System.out.println(street);
        System.out.println(zip + " " + city);

        // Preis berechnen
        double tax = price * 0.2;
        double total = price + tax;

        if (price > 500) {
            total = total * 0.9; // 10% Rabatt
        }

        // Bestätigung ausgeben
        System.out.println("Event: " + eventName);
        System.out.println("Total price: " + total);
        System.out.println("Confirmation sent to " + email);
    }
    
   
}