import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //program der bruger de forskellige datatyper
        //byte 1 byte Stores whole numbers from -128 to 127
        byte xbyte = 68;
        //short 2 bytes Stores whole numbers from -32,768 to 32,767
        short xshort = 12000;
        //int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int xint = 1000000000;
        //long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long xlong = 100000000000000000L;
        //float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits (se bogen fordi tallene kan være meget større)
        float xfloat = 2.77777f;
        //double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits (samme som float)
        double xdouble = 2.777777777777;
        //boolean 1 bit Stores true or false values
        boolean xboolean = true;
        //char 2 bytes Stores a single character/letter or ASCII values
        char xchar = 'x';
        //En anden vigtig datatype er String, som er ikke en primitiv datatype, men som er en klasse. En String består af en masse chars.
        String xstring = "H3j 4ll3 s4mm3n";

        int xc;
        System.out.println("-------------------------------------");
        System.out.println(xstring);
        System.out.println("-------------------------------------");
        System.out.println("Byten 68 lægges oven i shorten 12000.");
        System.out.println("resultat: " + (xbyte+xshort));
        System.out.println("-------------------------------------");
        if (xboolean == true){
                System.out.println("The boolean was true!");
            } else {
            System.out.println("The boolean was not true");
        }
        System.out.println("-------------------------------------");
        System.out.println("Lommeregner til addition!");
        byte a;
        byte b;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Tast første tal:");
        a = scan1.nextByte();
        System.out.println("Tast andet tal:");
        b = scan1.nextByte();
        System.out.println("resultat = " + (a+b));
        System.out.println("---------= end of program =-----------");
    }
}