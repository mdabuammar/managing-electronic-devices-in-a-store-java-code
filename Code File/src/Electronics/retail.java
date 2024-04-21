
package Electronics;

public class retail {
    String device;
    int price;
    String date;
    int quantity;
    String brand;
    String model;
    String radioValue;
    retail(String device,int price,String date, int quantity, String brand,String model)
    {
        this.device=device;
        this.price=price;
        this.date=date;
        this.quantity = quantity;
        this.brand=brand;
        this.model=model;
        
    }
   void display() {
        System.out.println(device + " " + price + " " + date + " " + quantity+" "+brand+" "+ model);
    }
}
