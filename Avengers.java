


public class Avengers {
	public static void main(String[] args) {
        String str = "Avengers";
        String str2 = "Assemble";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.endsWith("gers"));
        System.out.println(str.charAt(6));
        System.out.println(str.concat(str2));
        System.out.println(str.replace('A', 'y'));
        System.out.println(str.replaceAll("e", "tony"));
        System.out.println(str.replaceFirst("Av", "peter"));
        System.out.println(str.substring(5));
        String [] arr = "On your left Cap".split("");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        String str3 = String.valueOf(78.56f);
        


	}

}