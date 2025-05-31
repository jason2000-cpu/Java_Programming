
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
 * - Slower than StringBuilder because of syncrhonization
 *
 */
// public class Strings {
//     public static void main(String a[]) {
//         StringBuffer sb = new StringBuffer("Jackson");
//         System.out.println(sb.capacity());
//         sb.append(" Mwangi");
//         sb.delete(0, 2);
//         System.out.println(sb);
//     }
// }
/**
 * String Builder
 * - they are mutable strings
 * - faster than StringBuffer
 */
public class Strings {

    public static void main(String a[]) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println("STRING::" + sb);
        System.out.println("STRING TWO::" + sb2);

        System.out.println("STRING ONE CAPACITY:::" + sb.capacity());
        System.out.println("STRING TWO CAPACITY::" + sb2.capacity());
    }
}
