public class CWH_ch3_14_StringMethods {
  public static void main(String[] args) {
//        String name = "Harry";
      //Length Method
       int value = name.length(); //Length Method
       System.out.println(value);
//       //To Uppercase Method/Lowercase Method
       String newNAme = name.toUpperCase();
       System.out.println(newNAme);
      //Trim Method
       String nonTrimmedString = "      Ahmad      ";
       String trimmedString = nonTrimmedString.trim();
       System.out.println(nonTrimmedString);
       System.out.println(trimmedString);
      //Substring Method start
         String name = "Owais";
       System.out.println(name.substring(3));
       start and end
       System.out.println(name.substring(1,3));
      //Replace Method
       String name = "Harry";
       String changedName = name.replace('r','p');
       String changedName2 = name.replace("r","ier");
       System.out.println(name);
       System.out.println(changedName);
      //Starts With and Ends With Method
//        String name = "Owais";
       System.out.println(name.startsWith("Ow"));
        System.out.println(name.startsWith("ais"));
       System.out.println(name.endsWith("ais"));
      //Char At Method
        String name = "Owais";
     System.out.println(name.charAt(2));
      //Index Of Method
 //     String name = "Harry";
      System.out.println(name.charAt('a'));
      System.out.println(name.charAt('y'));
  }
}
