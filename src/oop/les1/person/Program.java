
package oop.les1.person;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
public class Program {
    //sort array by Weight
    public static void sortWeight(Person[] tmpPerson) {
        Person tmp;

        for (int i = 0; i < tmpPerson.length; i++)
            for (int j = 0; j < tmpPerson.length - 1; j++)
                if (tmpPerson[j].getWeight() > tmpPerson[j + 1].getWeight()) {
                    tmp = tmpPerson[j];
                    tmpPerson[j] = tmpPerson[j + 1];
                    tmpPerson[j + 1] = tmp;
                }
    }

    //sort array by Height
    public static void sortHeight(Person[] tmpPerson) {
        Person tmp;

        for (int i = 0; i < tmpPerson.length; i++)
            for (int j = 0; j < tmpPerson.length - 1; j++)
                if (tmpPerson[j].getHeight() > tmpPerson[j + 1].getHeight()) {
                    tmp = tmpPerson[j];
                    tmpPerson[j] = tmpPerson[j + 1];
                    tmpPerson[j + 1] = tmp;
                }
    }

    //print array
    public static void printArr(Person arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].show());
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person("Kate", 160, 65);
        Person p2 = new Person("Dan", 170, 78);
        Person p3 = new Person("Tom", 178, 54);
        Person p4 = new Person("Ben", 159, 93);
        Person p5 = new Person("Ran", 183, 94);

        Person arrPerson[] = {p1, p2, p3, p4, p5};
        System.out.println("Unsorted array");
        printArr(arrPerson);
        sortWeight(arrPerson);
        System.out.println("-------------");
        System.out.println("Array sorted by weight");
        printArr(arrPerson);
        System.out.println("-------------");
        System.out.println("Array sorted by height");
        sortHeight(arrPerson);
        printArr(arrPerson);


    }
}