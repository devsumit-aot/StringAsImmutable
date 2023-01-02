public class Main {
    public static void main(String[] args) {

        String str="Sumit";
        StringBuilder obj=new StringBuilder("Monika");
        /*
        The reason String is immutable as same String object is shared by multiple ref object. So
        It will affect the other object.

        It also because of security as information like database username , pass etc are saved as
        String object.
         */
        str.concat(" kumar"); // As String is Immutable, It won't be able to modify str.
        System.out.println(str); // append doesn't support in String
        String new_str=str.concat(" kumar"); // Here, str is not getting modified, the new String new_str will have new value
        System.out.println(new_str);

        obj.append(" Singh"); // here content of obj will get modifed as It is StringBuilder.
        System.out.println(obj);

        System.out.println("Hello world!");
    }
}