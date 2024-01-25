package parentPackage;

import q_Chapter16.controller.OrderController;
import q_Chapter16.model.OrderModel1;
import q_Chapter16.view.OrderView;

public class Main {

	public static void main(String[] args) {
		OrderModel1 model = new OrderModel1();
		OrderView view = new OrderView();
		OrderController controllet = new OrderController();
	}

}
