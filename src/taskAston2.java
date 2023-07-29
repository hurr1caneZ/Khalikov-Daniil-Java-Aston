import java.util.Scanner;

public class taskAston2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        if (name.equals("Вячеслав")){
            System.out.println("Привет " + name);
        }
        else{
            System.out.println("Нет такого имени");
        }
    }
}
