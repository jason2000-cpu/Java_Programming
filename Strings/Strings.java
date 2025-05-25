
// public class Strings {
//     public static void main(String a[]) {
//         String str = new String();
//         str = "Hello, World!";
//         str.replace("o", "m");
//         System.out.println(str);
//         String strArr[] = str.split("");
//         System.out.println("FIRST ELEMENT::" + strArr[0]);
//         for (String i : strArr) {
//             System.out.print(i + "  ");
//         }
//     }
// }
/**
 * String Buffer
 * - they are mutable strings (strings that can be changed)
 */
public class Strings {

    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Jackson");
        System.out.println(sb.capacity());
        sb.append(" Mwangi");

        System.out.println(sb);
    }
}
