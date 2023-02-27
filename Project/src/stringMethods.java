public class stringMethods {
    public static void main(String[] args){
        String name = "Nirav";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);


        String nonTrimmedString = "  NiravLathiya  ";
        System.out.println(nonTrimmedString);
        String trimmedString;
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("Nirav" , "NiravLathiya"));

    }
}
