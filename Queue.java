import java.util.LinkedList;
import java.util.Queue;

public class Main
{
  public static void main (String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(10);//queue.add(10)
    queue.offer(20);
    queue.offer(30);
    System.out.println(queue.poll());//System.out.println(queue.remove());
  }
}