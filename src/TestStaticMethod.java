public class TestStaticMethod {
    public static void main(String args[]) {
        StudentStatic.change(); //calling change method

        //creating objects
        StudentStatic s1 = new StudentStatic(111, "Hoang");
        StudentStatic s2 = new StudentStatic(222, "Khanh");
        StudentStatic s3 = new StudentStatic(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
