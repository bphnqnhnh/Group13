import java.util.Scanner;

public class ItemFactory {
    public static Item createItem(String type, Scanner sc){
        System.out.print("Nhập id món hàng: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên hàng: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá khởi điểm: ");
        double startingPrice = Double.parseDouble(sc.nextLine());

        if(type.equalsIgnoreCase("Electronics")){
            System.out.print("Hãng sản xuất: ");
            String brand = sc.nextLine();

            System.out.print("Số tháng bảo hành: ");
            int warrantyMonths = Integer.parseInt(sc.nextLine());

            return new Electronics(id, name, startingPrice, brand, warrantyMonths);
        } else if (type.equalsIgnoreCase("Vehicle")) {
            System.out.print("Hãng xe: ");
            String brand = sc.nextLine();

            System.out.print("Năm sản xuất: ");
            int yearOfManufacture = Integer.parseInt(sc.nextLine());

            System.out.print("Số km đã đi: ");
            double mileage = Double.parseDouble(sc.nextLine());

            return new Vehicle(id, name, startingPrice, brand, yearOfManufacture, mileage);
        }

        else if(type.equalsIgnoreCase("Art")){
            System.out.print("Tác giả: ");
            String artistName = sc.nextLine();

            System.out.print("Năm sáng tác: ");
            int creationYear = Integer.parseInt(sc.nextLine());

            return new Art(id, name, startingPrice, artistName, creationYear);
        }

        return null;
    }
}
