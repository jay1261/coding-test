import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");

            int count = 0;
            list.add(Integer.parseInt(splited[1]));

            for(int j = 2; j <= 20; j++){
                int index = -1;

                for(int k = 0; k < list.size(); k++){
                    if(list.get(k) > Integer.parseInt(splited[j])){
                        index = k;
                        break;
                    }
                }

                if(index == -1){
                    list.add(Integer.parseInt(splited[j]));
                } else {
                    count += list.size() - index;
                    list.add(index, Integer.parseInt(splited[j]));
                }
            }
            list.clear();
             System.out.println((i+1) + " " + count);
        }
        
        
    }
}