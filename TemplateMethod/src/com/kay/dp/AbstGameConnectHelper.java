package com.kay.dp;

public abstract class AbstGameConnectHelper {

	// �ܺο� ����Ǹ� �ȵ� �׸��� ���� Ŭ������ �������ؾ��ϹǷ� protected
	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// ���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {

		// ���� ���� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);

		// ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ�
		String id = "aaa";
		String password = "bbb";

		// ���� ����
		if (!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}

		//
		String userName = "userName";
		int i = authorization(userName);

		switch (i) {

		case 0: // ���� �Ŵ���

			break;
		case 1: // ���� ȸ��

			break;
		case 2: // ���� ȸ��
			
			break;
		case 3: // ���� ����
			throw new Error("�˴ٿ�");
			
//			break;
		default: // ��Ÿ ��Ȳ
			
			break;
		}

		return connection(decodedInfo);
	}
}
