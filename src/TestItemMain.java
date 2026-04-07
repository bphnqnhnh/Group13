import java.util.Scanner;

public class TestItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -- THÊM ĐỒ ĐIỆN TỬ -- ");
        System.out.print("Nhập id món hàng: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên hàng: ");
        String name = sc.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String brand = sc.nextLine();

        System.out.print("Nhập số tháng bảo hành: ");
        int warrantyMonths = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giá khởi điểm: ");
        double startingPrice = Double.parseDouble(sc.nextLine());

        Item dt = ItemFactory.createElectronics(id, name, brand, warrantyMonths, startingPrice);
        System.out.println("\nDanh sách hàng đã lên sàn: ");
        if(dt != null)
            dt.showDetails();

        sc.close();
    }
}
