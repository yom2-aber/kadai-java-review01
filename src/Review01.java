
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = tax(num1);
        System.out.println(num1 + "円の商品の税込価格は" + (num1 + num2) +"円（消費税は" + num2 +"円）です。");
    }

    public static int tax(int num1) {
        int taxRate = 10;
        int result = num1 / taxRate;
        return result;
    }
}
