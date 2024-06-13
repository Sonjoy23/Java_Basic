public class String_Method {
    public static void main(String[] args) {
        //length() method
        String str1="java programming";
        int n=str1.length();
        System.out.println(n);

        //charAt method
        String str2="hello";
        char cr=str2.charAt(1);
        System.out.println(cr);

        //equals method
        String x="Hello";
        String y="World";
        boolean equals=x.equals(y);
        System.out.println(equals);

        //compareTo method
        String com1="Hello";
        String com2="Hello";
        int com3=com1.compareTo(com2);
        System.out.println(com3);

        //toUpperCase method
        String lower="java programming";
        String upper=lower.toUpperCase();
        System.out.println(upper);

        //toLowerCase method
        String upper1="JAVA PROGRAMMING";
        String lower1=upper1.toLowerCase();
        System.out.println(lower1);

        //subString method
        String longStr="hello world";
        System.out.println(longStr.substring(6,11));

        //replace method
        String name="Sanjay";
        System.out.println(name.replace('a','o'));

        //trim method
        String trim="      java programing  ";
        System.out.println(trim.trim());
    }
}
