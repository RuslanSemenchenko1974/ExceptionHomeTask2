/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(InputN());
    }
    public static String InputN() {
        Boolean check = true;
        String str = "";
        
        while(check){
    try{
        Scanner  scan = new Scanner(System.in);
        System.out.print("Введите строку:");
        str = scan.nextLine();
        if (str.isEmpty()) {
            System.out.println("Empty string");
            throw new RuntimeException();
        } 
            return str;}
        
    catch (Exception ex){
        System.out.println("Ошибка ввода! Попробуйте еще раз");
        System.out.println(ex);
        }
        }
        return str;
    } 
}
