/*
 * Project Title : Lab 9 - Rectangle Class
 * Author : Yonghwan Yim
 * Final Update : 2017.11.03
 */
package lab_9;
    
public class Rectangle {
    
    private int width;
    private int height;
    private int area;
    private int girth;
    
    public Rectangle() { this.area = 0; this.girth = 0; this.width = 0; this.height = 0;}
    public Rectangle(int width, int height)
    {
        this();
        this.width = width;
        this.height = height;
    }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getArea() { return area; }
    public int getGirth() { return girth; }
    public void calculator()
    {
        this.area = width * height;
        this.girth = width * 2 + height * 2;
    }
    public void displayResult()
    {
        if((getWidth() > 0) && (getHeight() > 0))
        {
            System.out.println("너비 : " + getWidth());
            System.out.println("높이 : " + getHeight());
            System.out.println("직사각형의 둘레 : " + getGirth());
            System.out.println("직사각형의 면적 : " + getArea());  
        }
        else System.out.println("너비 혹은 높이 정보가 입력되지 않았습니다.");
    }
}
