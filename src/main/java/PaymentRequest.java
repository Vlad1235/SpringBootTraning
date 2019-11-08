/**
 * Теперь мы собираемся создать контроллер платежей вместе с POJO-классами для запросов и ответов
 * Напишем класс запроса платежа
 */
public class PaymentRequest {
    private int userId;
    private String itemId;
    private double discount;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
