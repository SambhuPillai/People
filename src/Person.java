import java.util.ArrayList;

public class Person {
		public static void main(String args[]) {
			Person2 p1 = new Person2("Sam", 23, "Prime Minister");
			Person2 p2 = new Person2("Ross", 21, "Teacher");
			Person2 p3 = new Person2("Barry", 20, "Gamer");
			ArrayList<Person2> arr = new ArrayList<>();
			arr.add(p1);
			arr.add(p2);
			arr.add(p3);
			for(Person2 person: arr) {
				System.out.println(person);
			}
			//for(Person2 person:arr ) {
			
			for(int i=0;i<arr.size();i++) {
				Person2 person;
				person = arr.get(i);
				if(person.name=="Barry") {
					System.out.println(person);
				}
				if(person.age==21) {
					System.out.println(person);
				}
			}
		}

}
