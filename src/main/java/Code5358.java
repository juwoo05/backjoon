import java.util.Scanner;
import java.util.StringJoiner;

public class Code5358 {
    public static void main(String[] args) {

        String name;
        Scanner s = new Scanner(System.in);

        StringJoiner sj = new StringJoiner("\n");

        while (s.hasNext()) {
            String newName = "";
            name = s.nextLine();

            for (char c : name.toCharArray()){
                if (c == 'i'){
                    newName += "e";
                } else if (c == 'e'){
                    newName += "i";
                } else if (c == 'O'){
                    newName += "E";
                } else if (c == 'E'){
                    newName += "I";
                } else {
                    newName += c;
                }
            }

            sj.add(newName);
        }



        System.out.println(sj);
    }
}
