package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrder(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createOrder (String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder (ProductOrder[] order) {
        for (ProductOrder orders : order) {
            System.out.println("상품명: " + orders.productName + ", 가격: " + orders.price + ", 수량: " + orders.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total = total + order.price * order.quantity;
        }
        return total;
    }
}
