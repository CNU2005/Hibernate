package cnu.order;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int orderid;
    private String customername;
    private String fooditem;
    private int quantity;
    private double totalamt;
    private String orderdate;
    private String orderstatus;

    public Order() {
    }

    public Order(int orderid, String customername, String fooditem,
                 int quantity, double totalamt,
                 String orderdate, String orderstatus) {

        this.orderid = orderid;
        this.customername = customername;
        this.fooditem = fooditem;
        this.quantity = quantity;
        this.totalamt = totalamt;
        this.orderdate = orderdate;
        this.orderstatus = orderstatus;
    }

    public int getId() {
        return orderid;
    }

    public void setId(int orderid) {
        this.orderid = orderid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getFooditem() {
        return fooditem;
    }

    public void setFooditem(String fooditem) {
        this.fooditem = fooditem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(double totalamt) {
        this.totalamt = totalamt;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Override
    public String toString() {
        return "Order [orderid=" + orderid
                + ", customername=" + customername
                + ", fooditem=" + fooditem
                + ", quantity=" + quantity
                + ", totalamt=" + totalamt
                + ", orderdate=" + orderdate
                + ", orderstatus=" + orderstatus
                + "]";
    }
}