import java.util.Stack;
class Stack1 {
int stck[];
int top;
Stack1(int s) {
stck = new int[s];
top = -1;
}
void push(int item) {
if (top > stck.length - 1) {

System.out.println("Stack is full");
} else {
stck[++top] = item;
}
}
int pop() {
if (top < 0) {
System.out.println("Stack is empty!");
return -1; // Or choose an appropriate return value
} else {
return stck[top--];
}
}
int peek() {
if (top < 0) {
System.out.println("Stack is empty!");
return -1; // Or choose an appropriate return value
} else {
return stck[top];
}
}
}
public class Practical3 {
public static void main(String[] args) {
Stack1 s1 = new Stack1(4);
for (int i = 1; i <= 4; i++)
s1.push(i * 5);
System.out.println("Stack Contents:");
for (int i = 0; i < 4; i++)
System.out.println(s1.pop());
System.out.println("Top element: "+s1.peek());
}
}
   

















