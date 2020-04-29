package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        // TODO Auto-generated method stub
        return getName()
            + " (used) $ "
            + String.format("%.2f", getPrice())
            + " (Manufacture date: "
            + sdf.format(manufactureDate)
            + ")";
    }
    
    
}