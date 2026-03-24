package test;

//❗ Event Daten gehören zusammen → eigene Klasse
class Event {

 private final String name;
 private final double price;

 public Event(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() { return name; }
 public double getPrice() { return price; }
}