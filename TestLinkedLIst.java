package LinkedList;

public class TestLinkedLIst {

    public static void main(String[] args) {
        LinkedList1<String> list  = new LinkedList1<>();

        list.add("Here I am");
        list.add("You and I");
        list.add("'til the end!");

        System.out.println(list.get(2).toString());
    }
}
