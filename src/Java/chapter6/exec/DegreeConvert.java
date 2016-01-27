package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DegreeConvert {
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9) *(fahrenheit - 32);
    }


    public static void main(String[] args) {
        System.out.println("Cel           fah             fah        cel");
        System.out.println("------------------------------------------------------");
        for (double i = 40,j = 120.0; i >= 31.0 && j >= 30; i--,j-=10) {
            System.out.printf("%-4.1f      %-5.1f               ",i,celsiusToFahrenheit(i));
            System.out.printf("%-5.1f       %-5.2f\n",j,fahrenheitToCelsius(j));
        }
    }
}
