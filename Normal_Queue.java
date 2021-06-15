import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;
    int rear ;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
      rear = 0 ;
    }

    int size() {
     return size ;
    }

    void display() {
        if(size == 0){
            
        }else{
           int i = front ;
           while(i < rear)
           {
               System.out.print(data[i]+" ");
               i++;
           }
        }
             System.out.println();
    
    }

    void add(int val) {
     if(rear == data.length  )
     {
          System.out.println("Queue overflow");
         
     }else{
       
         data[rear] = val ;
         rear++;
          size++;
            
     }
    }

    int remove() {
      if(size == 0 || front >= rear)
      {
            System.out.println("Queue underflow");
            return-1;
      }
      size-- ;
      return data[front++];
    }

    int peek() {
      if(size == 0 || front >= rear)
      {
            System.out.println("Queue underflow");
            return-1;
      }
      return data[front];
    }
    }
 

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}
