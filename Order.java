public class Order { 

    private Customer customer; 

    private Date dateOfOrder; 

    private FurnitureItem[] items; 

    private double totalPrice; 

  

    public Order(Customer customer, Date dateOfOrder, FurnitureItem[] items) { 

        this.customer = customer; 

        this.dateOfOrder = dateOfOrder; 

        this.items = items; 

        calculateTotalPrice(); 

    } 

  

    private void calculateTotalPrice() { 

        totalPrice = 0; 

        for (FurnitureItem item : items) { 

            totalPrice += item.getPrice(); 

        } 

    } 

  

    @Override 

    public String toString() { 

        StringBuilder sb = new StringBuilder(); 

        sb.append("Order Details:\n"); 

        sb.append("Customer: ").append(customer.getName()).append("\n"); 

        sb.append("Date of Order: ").append(dateOfOrder).append("\n"); 

        sb.append("Items:\n"); 

        for (FurnitureItem item : items) { 

            sb.append("- ").append(item).append("\n"); 

        } 

        sb.append("Total Price: ").append(totalPrice); 

        return sb.toString(); 

    } 

} 
