import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J5ListOfStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> coffeeLst = new ArrayList<>();
coffeeLst.add("espresso");
coffeeLst.add("latte");
coffeeLst.add("cappuccino");
System.out.println(coffeeLst);
Iterator<String> iter = coffeeLst.iterator();
while (iter.hasNext())
{
	String str = iter.next();
	System.out.println(str);
}
for(String str : coffeeLst) System.out.println(str.toUpperCase());
for(int i=0;i<coffeeLst.size();++i)  {
	System.out.println(coffeeLst.get(i).substring(0,3));
		

	}

}
}