import java.util.*;

class Main{
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            set.add(sc.nextLine());
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        StringBuilder sb = new StringBuilder();
        for(String str: list){
            sb.append(str+"\n");
        }
        System.out.println(sb.toString());
    }
}