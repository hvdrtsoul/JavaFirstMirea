package ru.mirea.task9;

public class Main {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        Student[] list1 = {new Student("A", "B", 12), new Student("M", "E", 13) };
        Student[] list2 = {new Student("K", "Q", 61), new Student("G", "Q", 35) };

        Student[] combinedList = new Student[list1.length + list2.length];
        combinedList[0] = list1[0];
        combinedList[1] = list1[1];
        combinedList[2] = list2[0];
        combinedList[3] = list1[1];

        mergeSort(combinedList, combinedList.length);

        for (Student student :
                combinedList) {
            System.out.println(student);
        }
    }
}
