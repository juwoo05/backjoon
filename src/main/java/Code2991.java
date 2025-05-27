import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code2991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        map.put("post", 0);
        map.put("milk", 0);
        map.put("newspaper", 0);

        int dog1Attack = sc.nextInt();
        int dog1Calm = sc.nextInt();
        int dog2Attack = sc.nextInt();
        int dog2Calm = sc.nextInt();

        int post = sc.nextInt();
        int milk = sc.nextInt();
        int newspaper = sc.nextInt();

        if (isAttack(post, dog1Attack, dog1Calm)) {
            map.put("post", map.get("post") + 1);
        }

        if (isAttack(post, dog2Attack, dog2Calm)) {
            map.put("post", map.get("post") + 1);
        }

        if (isAttack(milk, dog1Attack, dog1Calm)) {
            map.put("milk", map.get("milk") + 1);
        }

        if (isAttack(milk, dog2Attack, dog2Calm)) {
            map.put("milk", map.get("milk") + 1);
        }

        if (isAttack(newspaper, dog1Attack, dog1Calm)) {
            map.put("newspaper", map.get("newspaper") + 1);
        }

        if (isAttack(newspaper, dog2Attack, dog2Calm)) {
            map.put("newspaper", map.get("newspaper") + 1);
        }

        System.out.println(map.get("post"));
        System.out.println(map.get("milk"));
        System.out.println(map.get("newspaper"));

    }
    static boolean isAttack(int time, int attack, int calm){
        int cycle = attack + calm;
        int mod = time % cycle;

        if (mod == 0) {
            return false;
        } else if (mod <= attack) {
            return true;
        }

        return false;
    }
}
