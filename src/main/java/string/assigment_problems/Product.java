public class Product {

    static void parseInventoryRecord(String csvLine) {
        String[] details = csvLine.split(",");

        if (details.length != 3) {
            System.out.println("Invalid Record");
        } else {
            String productName = details[0];
            String sku = details[1];
            String quantity = details[2];

            System.out.println("Product: " + productName +
                    " | SKU: " + sku +
                    " | Qty: " + quantity);
        }
    }

    public static void main(String[] args) {
        String csvLine = "Laptop,LP101,25";
        parseInventoryRecord(csvLine);
    }
}