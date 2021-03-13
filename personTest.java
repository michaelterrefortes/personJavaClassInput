public class PersonTest
{
    public static void main(String args[])
    {
        Person p = new Person("Sally");
        Person p2 = new Person("Jane");
        Person p3 = new Person("Mike");
        p3.setAge(25);
        PersonTest.compare(p, p2);
        compare(p2,p3);
    }

    public static void compare(Person p1, Person p2)
    {
        System.out.println(p1 + " is " +
                (p1.equals(p2)? "": "not") +
			" the same age as " + p2);
    }
}