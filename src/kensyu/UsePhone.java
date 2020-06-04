package kensyu;

public class UsePhone {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HandyPhone2 h = new HandyPhone2();
		h.no = "090-8888-6666";
		h.mailAddress = "abc@aaa.com";
		System.out.println("HandyPhoneを使う");
		h.tel("080-444-5555");
		h.mail("myfriend@zzz.yyy.com");
		h.info();

	}

}
