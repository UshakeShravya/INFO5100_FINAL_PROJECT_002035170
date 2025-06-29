/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.CartItem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Business.WorkRequest.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class FoodOrderRequest extends WorkRequest {
    
    
    private List<CartItem> cartItems = new ArrayList<>();
    private Date processedDate;

    // ✅ Default constructor that calls superclass constructor with dummy values
    public FoodOrderRequest() {
        super("Food Order", null, null); // You can override sender & receiver later
        this.setRequestDate(new Date());
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    
     public double getTotalPrice() {
        double sum = 0;
        for (CartItem item : cartItems) {
            sum += item.getPrice();
        }
        return sum;
    }
     


public Date getProcessedDate() {
    return processedDate;
}

public void setProcessedDate(Date processedDate) {
    this.processedDate = processedDate;
}


     
    @Override
    public String toString() {
        return "Food Order - " + getStatus();
    }
    
}

