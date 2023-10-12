package ie.javier.planeTicketing.classes;

public class CreditCard {
    private String number;
    private Date expiryDate;
    private int securityCode;

    CreditCard (String number, Date expiry_date, int security_code) {
        if (String.valueOf(number).length() != 16 || String.valueOf(security_code).length() != 3) {
            throw new Error("ERROR: Invalid details supplied");
        }

        this.number = number;
        this.expiryDate = expiry_date;
        this.securityCode = security_code;
    }

    @Override
    public String toString() {
        return this.number + ", " + this.expiryDate + ", " + this.securityCode;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CreditCard)) {
            return false;
        }

        CreditCard obj = (CreditCard) object;
        return this.number == obj.number;
    }

    // GETTERS
    public String getCardNumber() {
        return this.number;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityCode() {
        return this.securityCode;
    }
}
