package kensyu;

public class HandyPhone extends Phone {
	String mailAddress;

	void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へ電話しました");
	}

}
