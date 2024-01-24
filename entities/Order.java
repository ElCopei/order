import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    
    List <OrderItem> itens = new ArrayList<>();
    private Client client;

    //
    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    //

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itens;
    }
    //
    public void addItens(OrderItem item){
      itens.add(item);
    }
    public void removeItens(OrderItem item){
        itens.remove(item);
      }
    public Double total(){
        Double total = 0.0;
      for(OrderItem i: itens){
         total+= i.subTotal();
      }
      return total;
    }
    

}
