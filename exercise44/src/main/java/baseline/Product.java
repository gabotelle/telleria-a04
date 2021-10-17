package baseline;

//Product
//        -Name
//        -Price
//        -quantity

public record  Product(String name, double price, int quantity){

        //    Print "Name: <name>
        //            Price: <price>
        //            Quantity: <quantity>
        public void printProduct() {
            System.out.printf("Name : %s%nPrice: %.2f%nQuantity: %d",
                    name,
                    price,
                    quantity);
        }
}
