package Misc;
import java.util.*;


public class TopologicalSort {
	public List<Order> createOrders(List<OrderDependecy> orders){
		Map<Order,List<Order>> map = findDependecy(orders);
		Queue<Order> queue = new LinkedList<>();
		Set<Order> visitedSet = new HashSet<>();
		for(Order order : map.keySet()){
			if(!visitedSet.contains(order)){
				createOrderUtil(order,visitedSet, queue,map);
			}
		}
		return getFinalOrder(queue);
	}
	

	private void createOrderUtil(Order order, Set<Order> visitedSet, Queue<Order> queue,Map<Order,List<Order>> map ) {
		visitedSet.add(order);
		List<Order> dependencies = map.get(order);
		for(int i=0;i<dependencies.size();i++){
			if(!visitedSet.contains(dependencies.get(i)))
				createOrderUtil(dependencies.get(i), visitedSet, queue, map);
		}
		queue.offer(order);
	}
	private Map<Order, List<Order>> findDependecy(List<OrderDependecy> orders) {
		 Map<Order, List<Order>>  map = new HashMap<>();
		 for(int i=0;i<orders.size();i++){
			 if(!map.containsKey(orders.get(i).order)){
				 List<Order> dependencies = new ArrayList<Order>();
				 if(orders.get(i).dependency!=null)
				 dependencies.add(orders.get(i).dependency);
				 map.put(orders.get(i).order, dependencies);
			 }else{
				 List<Order> dependencies =map.get(orders.get(i).order);
				 dependencies.add(orders.get(i).dependency);
				 map.put(orders.get(i).order, dependencies);
			 }
		 }
		 return map;
	}
	private List<Order> getFinalOrder(Queue<Order> queue) {
		List<Order> finalOrder= new ArrayList<>();
		while(!queue.isEmpty()){
			Order o =queue.poll();
			finalOrder.add(o);
		}
		return finalOrder;
	}
	public static void main(String[] args) {
		
		Order a = new Order("Java");
		Order b = new Order("ADS");
		Order c = new Order("Logic");
		Order d = new Order("Algo");
		OrderDependecy ord2 = new OrderDependecy();
		OrderDependecy ord1 = new OrderDependecy();
		OrderDependecy ord3 = new OrderDependecy();
		OrderDependecy ord4 = new OrderDependecy();
		ord1.order=a;
		ord2.order=b;
		ord3.order=c;
		ord4.order=d;
		ord1.dependency=c;
		ord2.dependency=d;
		ord4.dependency=a;
		List<OrderDependecy> orders = new ArrayList<>();
		orders.add(ord1);
		orders.add(ord2);
		orders.add(ord3);
		orders.add(ord4);
		List<Order> result = new TopologicalSort().createOrders(orders);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i).orderName);
		}
	}

}

class Order{
public String orderName;
public Order(String a){
	orderName=a;
}
}
class OrderDependecy{
	public Order order;
	public Order dependency;
}