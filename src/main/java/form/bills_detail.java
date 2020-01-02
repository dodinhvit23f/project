/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author HaiDao
 */
public class bills_detail {
    int id;
   
    String Product_name;
    double Quantities;
    double PriceOut;
    double Total;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

   

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String Product_name) {
        this.Product_name = Product_name;
    }

    public double getQuantities() {
        return Quantities;
    }

    public void setQuantities(double Quantities) {
        this.Quantities = Quantities;
    }

    public double getPriceOut() {
        return PriceOut;
    }

    public void setPriceOut(double PriceOut) {
        this.PriceOut = PriceOut;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   
}
