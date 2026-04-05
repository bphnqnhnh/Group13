import java.util.Scanner;

public class TestItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -- THÊM ĐỒ ĐIỆN TỬ -- ");
        Item dt = ItemFactory.createItem("electronics", sc);

        System.out.println(" -- THÊM PHƯƠNG TIỆN -- ");
        Item xe = ItemFactory.createItem("vehicle", sc);

        System.out.println(" -- THÊM TRANH VẼ -- ");
        Item painting = ItemFactory.createItem("art", sc);

        System.out.println("Danh sách hàng đã lên sàn: ");
        if(dt!= null)
            dt.showDetails();
        if(xe!= null)
            xe.showDetails();
        if(painting!= null)
            painting.showDetails();

        sc.close();
    }
}
