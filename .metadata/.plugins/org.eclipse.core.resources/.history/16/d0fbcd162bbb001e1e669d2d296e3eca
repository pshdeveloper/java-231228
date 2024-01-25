package q_Chapter16.model;

import java.util.HashMap;
import java.util.Map;

// 음식점 메뉴 주문 시스템
// - 사용자가 메뉴를 선택, 수량을 입력 >> 총 가격을 계산
// - 종료 옵션을 선택할 때까지 반복하여 메뉴 선택을 받음

public class OrderModel1 {
	// 메뉴 이름-키, 가격-값으로 하는 HashMap 선언
	private Map<String, Integer> menuPrices;
	
	// 주문된 메뉴의 이름-키, 주문 수량-값으로 하는 HashMap 선언
	private Map<String, Integer> order;
	
	// 주문이 완료되었ㄴ느지를 나타내는 불리언 변수 선언
	private boolean isComplete;
	
	public OrderModel1() {
		menuPrices = new HashMap<>();
		order = new HashMap<String, Integer>();
		isComplete = false;
		
		// 메뉴와 가격을 초기화
		menuPrices.put("pizza", 15000);
		menuPrices.put("Pasta", 12000);
		menuPrices.put("Juice", 3000);
		
	}
	
	// 주문을 추가하는 메서드
	public void addOrder(String dish, int quantity) {
		if (menuPrices.containsKey(dish)) {
			// 주문 목록에 메뉴 추가 또는 이미 존재할 경우 수량을 업데이트
			// getOrDefault(KEy, defaultValue)
			// : 찾는 key 가 존재한다면 key 의 value 를 반환
			// : null 이면 default 값을 반환
			order.put(dish,order.getOrDefault(dish, null) + quantity);
		}
	}
	
	// 총 주문 가격을 계산하는 메서드
	public int calculateTotal() {
		int total = 0; // 총 가격 저장 변수
		
		// 주문된 모든 메뉴에 대해 반복
		for (String dish : order.keySet()) {
			total += order.get(dish) * menuPrices.get(dish);
		}
		
		return total; // 게산된 총 가격을 반환
	}
	
	// 주문 완료 상태를 설정하는 메서드
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	// 주문 완료 여부를 반환하는 메서드
	public boolean isComplete() {
		return isComplete;
	}
}
