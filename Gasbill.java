import java.util.Scanner;

class Gasbill {

    int consumerId;
    String consumerName;
    int previousReading;
    int currentReading;
    String consumerType;
    int units;
    double bill;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        consumerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        currentReading = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Type (Domestic/Commercial): ");
        consumerType = sc.nextLine();

        units = currentReading - previousReading;
    }

    void calculateBill() {

        if (consumerType.equalsIgnoreCase("Domestic")) {

            if (units <= 50) {
                bill = units * 5;
            } 
            else if (units <= 100) {
                bill = (50 * 5) + ((units - 50) * 7);
            } 
            else {
                bill = (50 * 5) + (50 * 7) + ((units - 100) * 10);
            }

        } 
        else if (consumerType.equalsIgnoreCase("Commercial")) {

            if (units <= 50) {
                bill = units * 8;
            } 
            else if (units <= 100) {
                bill = (50 * 8) + ((units - 50) * 12);
            } 
            else {
                bill = (50 * 8) + (50 * 12) + ((units - 100) * 15);
            }

        } 
        else {
            System.out.println("Invalid Consumer Type");
        }
    }

    void display() {

        System.out.println("\n----- Gas Bill -----");
        System.out.println("Consumer ID : " + consumerId);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Consumer Type : " + consumerType);
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : Rs." + bill);
    }

    public static void main(String[] args) {

        Gasbill obj = new Gasbill();

        obj.getData();
        obj.calculateBill();
        obj.display();
    }
}