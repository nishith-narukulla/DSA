public class Strings {
    public static void main(String args[]) {
        String str1 = "Nishith";
        String str2 = "Nishith";
        String str3 = new String("Nishith");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str1.charAt(0));
        System.out.println(str1.indexOf('i'));
        System.out.println(str1.startsWith("Ni"));
        System.out.println(str1.endsWith("th"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(1, str1.length()));
        System.out.println(str1.replace('i', 'a'));
        System.out.println(str1.contains("Nish"));
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        System.out.println(str1.hashCode());
        System.out.println(str1.concat(" Narukulla"));
        System.out.println(str1.matches(".*it*."));
    }
}
