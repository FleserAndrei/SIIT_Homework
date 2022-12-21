
public class Calculator {

    /*
    write a calculator that is capable of computing a metric distance value from an expression that contains different scales and systems.
output should be specified by the user
only addition and subtraction is allowed
implement the calculator and write UNIT TESTS that prove that the computations are correct.
supported formats: mm, cm, dm, m, km
output is in lowest unit, expression: 10 cm + 1 m - 10 mm = 1090 mm

     */

    int mm = 0;
    int cm = 0;
    int dm = 0;
    int m = 0;
    int km = 0;
    float result = 0;


    public void add(int value, String format) {
        if (format.equals("mm")) {
            this.mm += value;
        }
        if (format.equals("cm")) {
            this.cm += value;
        }
        if (format.equals("dm")) {
            this.dm += value;
        }
        if (format.equals("m")) {
            this.m += value;
        }
        if (format.equals("km")) {
            this.km += value;
        }
    }

    public void substract(int value, String format) {

        if (format.equals("mm")) {
            this.mm -= value;
        }
        if (format.equals("cm")) {
            this.cm -= value;
        }
        if (format.equals("dm")) {
            this.dm -= value;
        }
        if (format.equals("m")) {
            this.m -= value;
        }
        if (format.equals("km")) {
            this.km -= value;
        }
    }

    public String getResult() {
        if (mm != 0) {
            result = mm + (cm * 10) + (dm * 100) + (m * 1000) + (km * 10000);
            return Float.toString(result) + " " + "mm";
        }
        if (cm != 0) {
            result = (mm / 10) + cm + (dm * 10) + (m * 100) + (km * 1000);
            return Float.toString(result) + " " + "cm";
        }
        if (dm != 0) {
            result = (mm / 100) + (cm / 10) + dm + (m * 10) + (km * 100);
            return Float.toString(result) + " " + "dm";
        }

        if (m != 0) {
            result = (mm / 1000) + (cm / 100) + (dm / 10) + m + (km * 1000);
            return Float.toString(result) + " " + "m";
        }
        if (km != 0) {
            result = (mm / 1000000) + (cm / 100000) + (dm / 10000) + (m / 1000) + km;
            return Float.toString(result) + " " + "km";
        }
        return "";


    }

}


