import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в каталог ноутбуков!");
        System.out.println("Выберите действие: \n 1 - Печать всех товаров \n 2 - Поиск по каталогу \n 0 - Выход");

        Scanner iScanner = new Scanner(System.in);
        int userInput = iScanner.nextInt();
        
        HashSet <laptop> laptopSet = new HashSet<laptop>();

        laptop laptop1 = new laptop(1, "Lenovo","Legion", 32, 2000, "Windows", 120000);

        laptop laptop2 = new laptop(2, "Aser","Aspire", 4, 1000, "Windows", 40000);
                    
        laptop laptop3 = new laptop(3, "HP","Pavilion", 8, 512, "Windows", 50000);    

        laptop laptop4 = new laptop(4, "Asus","Vivobook", 16, 512, "Windows", 70000);

        laptop laptop5 = new laptop(5, "MSI","Puls", 8, 512, "Windows", 90000);

        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        System.out.println(userInput);

        switch (userInput) {
            case 1:
                for (laptop laptop : laptopSet) {
                    System.out.println(laptop.printLaptop());
            }
                break;
            case 2:
            System.out.println("Введите производителя ноутбука для поиска (Lenovo, Aser, HP, Asus, MSI): ");
            String manufacturerInput = iScanner.next();
            List <laptop> queryLaptop = laptop3.findLaptop(laptopSet, manufacturerInput);
            for (laptop laptop : queryLaptop){
                System.out.println(laptop.printLaptop());
            }
                break;
            case 0:
                return;

            default:
                System.out.println("Неправильный ввод");
                return;
            }
        } 
    }



