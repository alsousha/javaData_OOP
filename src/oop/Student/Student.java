package oop.Student;

public class Student {
    private String id;
    private int[] arrGradesSemesterA;
    private int[] arrGradesSemesterB;

    //for toString - safe grades as string
    private String returnArrElems(int[] arr){
        int i;
        String res = "";
        for(i=0;i<arr.length; i++){
            res += arr[i] + " ";
        }
        return res;
    }
    private void copyArr(int[]arrGoal, int[] arrInto) {
        int i;

        for(i=0;i<arrGoal.length;i++){
            //ес не было предмета - оценка -1
            if(arrGoal[i]>=-1 && arrGoal[i]<=100)
                arrInto[i]=arrGoal[i];
        }
    }
    public Student(String id, int[] arrA, int[]arrB) {
        this.id = id;
        this.arrGradesSemesterA = new int[arrA.length];
        this.arrGradesSemesterB = new int[arrB.length];

        copyArr(arrA, this.arrGradesSemesterA);
        copyArr(arrB, this.arrGradesSemesterB);
    }
    public String getId() {
        return this.id;
    }
    public boolean isImproved() {
        int i;
        boolean flag = true;
        for(i=0; i< arrGradesSemesterA.length && flag; i++) {
            flag = (arrGradesSemesterA[i] <= arrGradesSemesterB[i] || arrGradesSemesterB[i] == -1) && flag;
        }
        return flag;

    }
    public String toString(){
        String res = this.id + ": |" + returnArrElems(this.arrGradesSemesterA) + "| |" +returnArrElems(this.arrGradesSemesterB) +"| ";
        return res;
    }
}
