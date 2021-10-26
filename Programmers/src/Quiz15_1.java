//01234라는 스트링값을 int로 바꾸면 혹시 8진수인줄 아나?
public class Quiz15_1{

	public static void main(String[] args) {
		
		int a = 0123;
		String b = "0123";
		int c = Integer.parseInt(b);
		System.out.println(a);
		System.out.println(c);
	}

}
//아니!
//결과값
//83
//123
//String -> int 바꾸면 0은 자동으로 없어지나보다.
//그리고 8진수표현 println해서 출력하면 10진수로 그냥 나오네.

