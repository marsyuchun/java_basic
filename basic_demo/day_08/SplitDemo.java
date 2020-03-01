package basic_demo.day_08;

public class SplitDemo {
    public static void main(String[] args) {
        String desc = "For each operand that names a file of a type other than directory, ls displays its name as well as any requested, associated information.  For each operand\n" +
                "that names a file of type directory, ls displays the names of files contained within that directory, as well as any requested, associated information.\n" +
                "\n" +
                "If no operands are given, the contents of the current directory are displayed.  If more than one operand is given, non-directory operands are displayed\n" +
                "first; directory and non-directory operands are sorted separately and in lexicographical order.";
        desc.replace("\\n","");
        System.out.println(desc);
        System.out.println("------------------------------------------------");
        String[] dec = desc.split(",");
        for (int i=0;i< dec.length;i++){
            System.out.println(dec[i]);
        }
    }
}
