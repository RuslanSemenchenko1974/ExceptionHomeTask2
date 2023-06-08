/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;
public class InputNamber {
    public static void main(String[] args) {
       System.out.println(InputN()); 
    }
    public static float InputN() {
        Boolean check = true;
        float str = 0;
        
        while(check){
    try{
        Scanner  scan = new Scanner(System.in);
        System.out.print("Введите  число:");
        str = scan.nextFloat();
        
            check = false; 
            return str;}
        
    catch (Exception ex){
        System.out.println("Ошибка ввода! Попробуйте еще раз");
        System.out.println(ex);
        }
        }
        return str;
    }
    
}
