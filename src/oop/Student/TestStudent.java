package oop.Student;

public class TestStudent {
    public static String[] getPositiveStudentId(Student[] arr) {
        int i; int j=0;
        //arr with positive ids
        String[] posIds = new String[searchPosStudent(arr)];
        for(i=0; i<arr.length; i++) {
            if(arr[i].isImproved()) {
                posIds[j] = arr[i].getId();
                j++;
            }
        }
        return posIds;

    }
    //count positive student
    public static int searchPosStudent(Student[] arr) {
        int count = 0; int i;
        for(i=0; i<arr.length; i++) {
            count += arr[i].isImproved() ? 1: 0;
        }
        return count;
    }
    public static void printArr(String [] arr){
        int i;
        for(i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] s1a1 = {45,67,-1,86,88};
        int[] s1a2 = {95,69,76,-1,97};
        Student s1 = new Student("12345", s1a1, s1a2);

        int[] s2a1 = {45,67,-1,86,88};
        int[] s2a2 = {56,89,67,76,97};
        Student s2 = new Student("23455", s2a1, s2a2);

        int[] s3a1 = {45,67,-1,86,88};
        int[] s3a2 = {75,68,76,100, 97};
        Student s3 = new Student("34566", s3a1, s3a2);

        //arr of students
        Student [] arrStudent = {s1,s2,s3};
        printArr(getPositiveStudentId(arrStudent));


    }


}
