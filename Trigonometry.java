public class Trigonometry {

    public static void main(String args[])
    {

        double degrees = 90.0;

        // convert degrees to radians
        double radians = Math.toRadians(degrees);


        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        System.out.println(Math.toRadians(degrees));
        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("cos(" + degrees + ") = " + cosValue);
        System.out.println("tan(" + degrees + ") = " + tanValue);
    }
}





