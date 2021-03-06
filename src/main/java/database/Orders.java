package database;
// Generated Feb 5, 2018 1:12:41 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer id;
     private Users users;
     private Date purchaceDate;
     private double totalPrice;
     private Set ordersHasProductses = new HashSet(0);

    public Orders() {
    }

	
    public Orders(Users users, Date purchaceDate, double totalPrice) {
        this.users = users;
        this.purchaceDate = purchaceDate;
        this.totalPrice = totalPrice;
    }
    public Orders(Users users, Date purchaceDate, double totalPrice, Set ordersHasProductses) {
       this.users = users;
       this.purchaceDate = purchaceDate;
       this.totalPrice = totalPrice;
       this.ordersHasProductses = ordersHasProductses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getPurchaceDate() {
        return this.purchaceDate;
    }
    
    public void setPurchaceDate(Date purchaceDate) {
        this.purchaceDate = purchaceDate;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Set getOrdersHasProductses() {
        return this.ordersHasProductses;
    }
    
    public void setOrdersHasProductses(Set ordersHasProductses) {
        this.ordersHasProductses = ordersHasProductses;
    }




}


