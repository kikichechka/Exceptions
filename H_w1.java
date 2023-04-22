import java.util.Arrays;

public class H_w1 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 16, 31, 69, 57};
        Integer[] arr2 = {34, 22, 4, 41, 12};
        System.out.println(Arrays.toString(fun1(arr1, arr2)));
        System.out.println(Arrays.toString(fun2(arr1, arr2)));
    }

    public static Integer[] fun1(Integer[] list1, Integer[] list2) {
        checkLength(list1, list2);
        Integer[] newList = new Integer[list1.length];
        for (int i = 0; i < list1.length; i++) {
            newList[i] = list1[i] - list2[i];
        }
        return newList;
    }

    public static Integer[] fun2(Integer[] list1, Integer[] list2) {
        checkLength(list1, list2);
        Integer[] newList = new Integer[list1.length];
        for (int i = 0; i < list1.length; i++) {
            checkNull(list2[i]);
            newList[i] = list1[i] / list2[i];
        }
        return newList;
    }


    public static void checkLength(Integer[] list1, Integer[] list2) {
        if (list1.length != list2.length) throw new RuntimeException("Ошибка! Длины массивов не совпадают.");
        if (list1.length < 1) throw new RuntimeException("Ошибка! Переданы пустые массивы.");
    }

    public static void checkNull(Integer num) {
        if (num == 0) throw new RuntimeException("Ошибка! Делить на ноль нельзя.");
    }
}
