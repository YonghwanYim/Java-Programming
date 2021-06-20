/*
 * Project Title : Lab 9 - Circle Class
 * Author : Yonghwan Yim
 * Final Update : 2017.11.03
 */
package lab_9;

public class CircleInfo {
    
    public final double PI = 3.141592;
    private int radius;
    private double area;
    private double circum;
    
    public CircleInfo() 
    { 
        this.radius = 0; this.area = 0.0D; this.circum = 0.0D;       
    }
    public CircleInfo(int radius)
    {
        this();
        this.radius = radius;
    }
    
    public int getRadius() { return radius; }
    public double getArea() { return area; }
    public double getCircum() { return circum; }
    public void calculator()
    {
        this.area = (double)Math.pow(radius, 2) * PI;
        this.circum = (double)2 * radius * PI;
    }
    public void displayResult()
    {
        if(getRadius() <= 0)
            System.out.println("반지름의 정보가 입력되지 않았습니다.");
        else
        {
            System.out.println("반지름 : " + getRadius());
            System.out.println("원의 둘레 : " + getCircum());
            System.out.println("원의 면적 : " + getArea());
        }
    }
}