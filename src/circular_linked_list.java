import java.util.Scanner;

public class circular_linked_list {
class node{
    int data=0;
    node next=null;

    public void setNext(node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
node start;
public boolean is_empty()
{
     return start==null;
}
public void display() {
    if (is_empty()) {
        System.out.println("list is empty");

        return;
    }

else{
     node temp;
     temp=start;
     while(temp.getNext()!=start) {
         System.out.println(temp.getData());

         temp = temp.getNext();
     }
}
}
public void insert_end(int data)
{ node n=new node();
n.setData(data);
if(is_empty())
{
    start=n;
    n.setNext(start);

}
else{
    node temp=start;
    while (temp.getNext()!=start)
    { temp=temp.getNext();
    }
    temp.setNext(n);
    n.setNext(start);
}}
public void insert_first(int data)
    {
         node n= new node();
         n.setData(data);
         if(is_empty())
         {
              start=n;
              n.setNext(n);

    }
    else
         {
              node temp=start;
              while(temp.getNext()!=start) {
                  temp = temp.getNext();
              }
               temp.setNext(n);
              n.setNext(start);
              start=n;
         }
 }
 public void delete_first()
 { node temp=start;
      if(is_empty())
      {
          System.out.println("list is empty");
      }
      else
      {
           while(temp.getNext()!=start)
           {
                temp=temp.getNext();
           }
           start=start.getNext();
           temp.setNext(start);
      }
 }
    public static void main(String[] args) {
        circular_linked_list obj = new circular_linked_list();
        int n = 1;
        while (n != 0) {
            System.out.println("select any option");
            Scanner sc = new Scanner(System.in);
            System.out.println("to enter at first  press 1");
            System.out.println("to enter at last press 2");
            System.out.println("to delete at first press 3");
            System.out.println("to display all elements press 4");
            System.out.println("to exit press 0");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    n = 0;
                    break;
                case 1:
                    System.out.println("enter data");
                    int temp = sc.nextInt();
                    obj.insert_first(temp);
                    break;
                case 2:
                    System.out.println("enter data");
                    temp = sc.nextInt();
                    obj.insert_first(temp);
                    break;
                case 3:
                    obj.delete_first();
                    break;
                case 4:
                    obj.display();
                    break;

            }
        }
    }}