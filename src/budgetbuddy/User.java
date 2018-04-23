/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetbuddy;

/**
 *
 * @author morganmacdonald
 */
class User {
    private int TransactionId, Amount, Date, UserId;
    private String OneTimeName, Category;
    
    public User(int TransactionId, int Amount, String OneTimeName, int UserId, String Category, int Date){
        this.TransactionId = TransactionId;
        this.Amount = Amount;
        this.OneTimeName = OneTimeName;
        this.UserId = UserId;
        this.Category = Category;
        this.Date = Date;
    }
    
    public int getTransactionId(){
        return TransactionId;
    }
    
    public int getAmount(){
        return Amount;
    }
    
    public String getOneTimeName(){
        return OneTimeName;
    }
    
    public int getUserId(){
        return UserId;
    }
    
    public String getCategory(){
        return Category;
    }
    
    public int getDate(){
        return Date;
    }
    
    
}
