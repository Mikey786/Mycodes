public class Codes {
	public static void main(String[] args) {
		String str = "Java Programming",str2="java Programming";
		System.out.println(str.length());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * char ch = sc.nextLine().charAt(0);
		 * System.out.println(ch);
		 */
		System.out.println(str.charAt(6));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("Kro",5));
		System.out.println(str.endsWith("ming"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(3, 9));
		System.out.println(str.concat(str2));
		System.out.println(str.replace('a','y'));
		System.out.println(str.contains("ava"));
		System.out.println(str.replaceFirst("av","Nitro"));
		System.out.println(str.replaceAll("[am]","Nitro"));
		String [] arr = "Hi I'm learning Java Programmin".split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String str4 = "Nitro   ".trim(),str5= " Hai".strip();
		System.out.println(str4.concat(str5));
		System.out.println(str.toString());
		String str6 = String.valueOf(78.36f);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
	}
}