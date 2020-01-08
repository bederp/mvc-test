import java.util.List;

public class OrdersService {

    private OrdersRepository ordersRepository;


    public long sumForClient(String clientName) {
        List<Order> allOrderForClient = ordersRepository.getAllOrderForClient(clientName);

        long sum = 0;
        for (Order order : allOrderForClient) {
            sum += order.getPrice();
        }
        return sum;
    }
}
