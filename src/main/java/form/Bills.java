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
public class Bills {
    int id;
    int MemId;
    int Quantities;
    String Adress;
   String ReceiveDate;
   double DisCount;
   int ProId;

    @Override
    public String toString() {
        return "Bills{" + "id=" + id + ", MemId=" + MemId + ", Quantities=" + Quantities + ", Adress=" + Adress + ", ReceiveDate=" + ReceiveDate + ", DisCount=" + DisCount + ", ProId=" + ProId + '}';
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemId() {
        return MemId;
    }

    public void setMemId(int MemId) {
        this.MemId = MemId;
    }

    public int getQuantities() {
        return Quantities;
    }

    public void setQuantities(int Quantities) {
        this.Quantities = Quantities;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getReceiveDate() {
        return ReceiveDate;
    }

    public void setReceiveDate(String ReceiveDate) {
        this.ReceiveDate = ReceiveDate;
    }

    public double getDisCount() {
        return DisCount;
    }

    public void setDisCount(double DisCount) {
        this.DisCount = DisCount;
    }

    public int getProId() {
        return ProId;
    }

    public void setProId(int ProId) {
        this.ProId = ProId;
    }
}
