package web._01;

// BigDecimal用のインポート
import java.math.BigDecimal;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 変数１，２の初期値
		System.out.println("変数１（初期値）");
		int num1 = 12;
		System.out.println(num1);
		System.out.println("変数２（初期値）");
		int num2 = 4;
		System.out.println(num2);
		
		System.out.print("変数１を入力してください。：");
		@SuppressWarnings("resource")
		String input_text1 = new java.util.Scanner(System.in).nextLine();
		
		System.out.print("変数２を入力してください。：");
		@SuppressWarnings("resource")
		String input_text2 = new java.util.Scanner(System.in).nextLine();
		try {
			num1 = Integer.parseInt(input_text1);
			num2 = Integer.parseInt(input_text2);
		}
		catch(Exception ex) {
			System.out.println("エラーメッセージ：数値を入力してください。");
			throw ex;
		}
		finally {
			System.out.println("変数１（入力後）");
			System.out.println(num1);
			System.out.println("変数２（入力後）");
			System.out.println(num2);
		}
		
		// ArithmeticOperationクラスのインスタンスを生成
		ArithmeticOperation ad = new ArithmeticOperation ();
		// 足し算
		ad.Add(num1, num2);
		// 引き算
		ad.Sub(num1, num2);
		// 掛け算
		ad.Mul(num1, num2);
		// 割り算
		ad.Dev(num1, num2);
	}
	
	public void Add(int x, int y) {
		System.out.println("足し算の結果");
		System.out.println(x + y);
	}
	
	public void Sub(int x, int y) {
		System.out.println("引き算の結果");
		System.out.println(x - y);
	}
	
	public void Mul(int x, int y) {
		System.out.println("掛け算の結果");
		System.out.println(x * y);
	}
	
	public void Dev(int x, int y) {
		System.out.println("割り算の結果");
		double d = x / y;
		// BigDecimal変換
		BigDecimal result = BigDecimal.valueOf(d);
		System.out.println(result);
	}

}
