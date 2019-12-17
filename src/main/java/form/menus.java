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
public class menus {
    int id;
    String Name;
    double PriceIn;
    double PriceOut;
    int Quantities;
    String ImportDate;
    String ExpDate;
    String Url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPriceIn() {
        return PriceIn;
    }

    public void setPriceIn(double PriceIn) {
        this.PriceIn = PriceIn;
    }

    public double getPriceOut() {
        return PriceOut;
    }

    public void setPriceOut(double PriceOut) {
        this.PriceOut = PriceOut;
    }

    public int getQuantities() {
        return Quantities;
    }

    public void setQuantities(int Quantities) {
        this.Quantities = Quantities;
    }

    public String getImportDate() {
        return ImportDate;
    }

    public void setImportDate(String ImportDate) {
        this.ImportDate = ImportDate;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
}
