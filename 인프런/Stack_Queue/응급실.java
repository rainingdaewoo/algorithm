package 인프런.Stack_Queue;

import java.util.*;
class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class 응급실 {

    public static int solution(int N, int M, int[] arr) {
        //
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Person temp = queue.poll();
            for(Person x : queue){
                if(x.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                answer++;
                if(temp.id == M)  return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, arr));
    }
}

