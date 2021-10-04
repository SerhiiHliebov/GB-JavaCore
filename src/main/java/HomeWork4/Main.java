package HomeWork4;

public class Main {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Ivan", "223344");
        book.add("Ivan", "435476");
        book.add("Ivan", "765343");
        book.add("Boris", "234754");
        book.add("Boris", "457908");
        book.add("Ira", "789056");
        book.add("Inna", "657573");
        book.add("Martin", "345788");
        book.add("Bill", "679645");
        book.add("Marina", "436900");

        System.out.println("Ivan: " + book.get("Ivan"));
        System.out.println("Martin: " + book.get("Martin"));
        System.out.println("John: " + book.get("John"));
    }
}
