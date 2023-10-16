package ie.javier.planeTicketing.classes;

import java.io.Serializable;

public class Date implements Serializable {
    private int day;
    private int month;
    private int year;

    public Date() {
        // 0 in unix timestamp
        this.day = this.month = 1;
        this.year = 1970;
    }

    public Date(int d, int m, int y) {
        // Make sure the day is between 1 and 31. The month is between 1 and 12 and the year isn't negative
        // IMPROVEMENTS: Implement a method to check whether the month has 31 days and see if its valid
        if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1900) {
            throw new IllegalArgumentException("Error: INCORRECT DATE");
        }

        this.day = d;
        this.month = m;
        this.year = y;
    }

    // Getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // Setters
    public void setDay(int d) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Error: INCORRECT DAY SUPPLIED");
        }

        this.day = d;
    }

    public void setMonth(int m) {
        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Error: INCORRECT MONTH SUPPLIED");
        }

        this.month = m;
    }

    public void setYear(int y) {

        if (y < 1) {
            throw new IllegalArgumentException("Error: INCORRECT DAY SUPPLIED");
        }

        this.year = y;
    }

    // Overrides
    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }

    @Override
    public boolean equals(Object object) {
        if ( !(object instanceof Date) ) {
            return false;
        }

        Date obj = (Date) object;
        return (this.day == obj.day &&
                this.month == obj.month &&
                this.year == obj.year);
    }
}
