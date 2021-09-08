package pers.qkgit.javaBase.array.sort;

import java.util.Date;

/**
 * @Auther Qi
 * @data 2021/9/8 14:47
 *  快速排序
 *   通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 *   则分别对这两部分继续进行排序，直到整个序列有序。
 */
public class QuickSort {
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            // 对data的第一个元素base 在data中进行定位
            int base = data[start];
            int low = start;        // 低位
            int high = end + 1;     // 高位
            while (true) {
                // 当低位出现比base大的数
                while (low < end && data[++low] - base <= 0);
                // 当高位出现比base小的数
                while (high > start && data[--high] - base >= 0);
                // 并且低位比高位小 进行交换 否则说明定位完成 位置为 (high+low)/2 或 high
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            // 现在high的值为定位完成后的位置
            // 将base(data[start])交换到data[high]
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用 左侧进行定位
            subSort(data, high + 1, end);  //递归调用 右侧进行定位
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }


    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}
