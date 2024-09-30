package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate;
    protected SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public void printSpecificData() {
        System.out.println(this.getSpecificData());
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidade: ");
        builder.append(getFormattedDate(getExpirationDate()));
        return builder.toString();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date date) {
        return dateFormatter.format(date);
    }
}
