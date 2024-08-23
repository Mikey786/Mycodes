public class Buffer{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(3);
		System.out.println(sb.capacity());// To know the capacity of the String//
		sb.append("java Programming");//append is used to change the value in the string
		System.out.println(sb.capacity());
		sb.insert(4, "-");// Here is the index where we wanted to insert and the - is that we wanted to insert into the string//
		System.out.println(sb.toString());
		sb.replace(6,17,"Learning");// it replaces the characters that are present from the index 6 to 17//
		System.out.println(sb.toString());
		sb.delete(6, 13);// it deletes the characters that are present from the index 6 to 13//
		System.out.println(sb.toString());
		sb.reverse();//it reverses the string//
		System.out.println(sb.toString());
		// the string builder is as same as the string buffer but it is non-synchronised method//
		
		
		
	}
}
