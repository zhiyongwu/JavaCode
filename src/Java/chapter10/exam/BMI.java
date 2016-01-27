package Java.chapter10.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class BMI {
    private String name;
    private int age;
    private double height;
    private double weight;
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public BMI(String name, double height, double weight) {
        this(name,20,height,weight);
    }

    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND / (Math.pow(height * METERS_PER_INCH ,2));
        return Math.round(bmi*100) / 100.0;
    }

    public String getStatus(){
        double bmi = this.getBMI();
        if(bmi < 16) return "Seriously under weight";
        else if(bmi < 18) return "underweight";
        else if(bmi < 24) return "normal weight";
        else if(bmi < 29) return "overweight";
        else if(bmi < 35) return "seriously overweight";
        else return "gravely overweight";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
