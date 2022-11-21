import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));




//  Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//  Iterate through the array and print out the name of each person in the array.
        Person[] Person = new Person[3];
        Person[0] = new Person("Rajib");
        Person[1] = new Person("Ethan");
        Person[2] = new Person("Andres");
        Person Isaiah = new Person("Isaiah");
        for (int i = 0; i < Person.length; i++) {
            System.out.println(Person[i].getName());
        }
//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single
//        person object to add to the passed array. It should return an array whose length is 1 greater than the
//        passed array, with the passed person object at the end of the array.

                for (Person p: addPerson(Person, Isaiah)){
                    System.out.print(p.getName() + " ");

        }
//                     Arrays.toString(addPerson(Person, Isaiah)));
    }
    public static Person[] addPerson(Person[] x, Person name){
        Person[] copyArray = Arrays.copyOf(x, x.length + 1);
        copyArray[copyArray.length-1] = name;
        return copyArray;
    };
}
