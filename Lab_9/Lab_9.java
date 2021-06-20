/*
 * Project Title : Lab 9
 * Author : Yonghwan Yim
 * Final Update : 2017.11.03
 */
package lab_9;
import java.util.*;

public class Lab_9 {
    public static void main(String[] args) {
        int nMenu = 0;
        int nRadius = 0;
        int nWidth = 0;
        int nHeight = 0;
        boolean bFlag = true;
        Scanner scan = new Scanner(System.in);
        
        while(bFlag)
        {
            try
            {
                System.out.println("사용할 메뉴를 선택해주세요.");
                System.out.print("[0. 종료] [1. 원] [2. 정사각형] [3. 직사각형] [4. 정삼각형] : ");
                nMenu = scan.nextInt();
                
                if(nMenu == 0)
                {
                    System.out.println("프로그램을 종료합니다."); break;
                }
                else if (nMenu == 1)
                {
                    System.out.print("원의 반지름을 입력해주세요 : ");
                    nRadius = scan.nextInt();
                    CircleInfo ci = new CircleInfo(nRadius);
                    ci.calculator();
                    ci.displayResult(); 
                }
                else if (nMenu == 2)
                {
                    System.out.print("정사각형의 너비를 입력해주세요 : ");
                    nWidth = scan.nextInt();
                    SquareInfo si = new SquareInfo(nWidth);
                    si.calculator();
                    si.displayResult();
                }
                else if (nMenu == 3)
                {
                    System.out.print("직사각형의 너비를 입력해주세요 : ");
                    nWidth = scan.nextInt();
                    System.out.print("직사각형의 높이를 입력해주세요 : ");
                    nHeight = scan.nextInt();
                    Rectangle rec = new Rectangle(nWidth, nHeight);
                    rec.calculator();
                    rec.displayResult();
                }
                else if (nMenu == 4)
                {
                    System.out.print("정삼각형 및변의 길이를 입력해주세요 : ");
                    nWidth = scan.nextInt();
                    System.out.print("정삼각형의 높이를 입력해주세요 : ");
                    nHeight = scan.nextInt();
                    Triangle tri = new Triangle(nWidth, nHeight);
                    tri.calculator();
                    tri.displayResult();
                }
                else System.out.println("올바른 메뉴를 선택해주세요.");
            } catch(Exception e) {}
        }
        
    }
}
