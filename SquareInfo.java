/*
 * Project Title : Lab 9 - Square Class
 * Author : Yonghwan Yim
 * Final Update : 2017.11.03
 */
package lab_9;

public class SquareInfo {
    
    private int width;
    private int area;
    private int girth;
    
    public SquareInfo() { this.area = 0; this.girth = 0; this.width = 0;}
    public SquareInfo(int width)
    {
        this();
        this.width = width;
    }
    public int getWidth() { return width; }
    public int getArea() { return area; }
    public int getGirth() { return girth; }
    public void calculator()
    {
        this.area = width * width;
        this.girth = width * 4;
    }
    public void displayResult()
    {
        if(getWidth() <= 0)
            System.out.println("너비의 정보가 입력되지 않았습니다.");
        else
        {
            System.out.println("너비 : " + getWidth());
            System.out.println("정사각형의 둘레 : " + getGirth());
            System.out.println("정사각형의 면적 : " + getArea());
        }
    }
}
