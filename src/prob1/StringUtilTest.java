package prob1;

public class StringUtilTest {

	public static void main(String[] args) {
        String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
        System.out.println(strArr.length);
        String resultStr = StringUtil.concatenate( strArr );
        System.out.println( "결과 문자열 : " + resultStr ); 
	}

}
