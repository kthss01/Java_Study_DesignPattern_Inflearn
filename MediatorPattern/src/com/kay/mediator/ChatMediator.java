package com.kay.mediator;

import com.kay.mediator.contract.Colleague;
import com.kay.mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		
		for (Colleague colleague : colleagues) {
			// 중재 가능성 있는 정보가 있으면 여기서 걸러내는거
			// 귓말 같은 거
			// 아래는 자신 포함 모든 사람에게 보내는거
			colleague.handle(data);
		}
	}

}
