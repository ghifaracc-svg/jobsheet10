public class StudentAssignmentStack {
    Student[] stack;
    int top, size;

    StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Student std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Student pop() {
        if (!isEmpty()) {
            Student std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student getFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // METHOD BARU
    int count() {
        return top + 1;
    }

    void print() {
        System.out.println("Assignment list:");
        System.out.println("NIM\tName\tClass Name");

        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }

        System.out.println("");
    }
}