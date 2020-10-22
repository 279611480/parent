package test.demo.mytest;

import org.junit.Test;

/**
 * @ClassName Algorithm
 * @Description 常见算法案例
 * @Autor 落笔丶
 * @Date 2020/10/22 19:47
 * @Tel 279611480@qq.com
 */
public class Algorithm {

    @Test
    public void bubbleSortTest() {
        int arr[] = {66, 45, 77, 21, 1, 88, 99};

        System.out.println("arr.length：" + arr.length);//7

        bubbleSort(arr);

        for (int i : arr) {
            System.out.println("冒泡后的结果：" + i);
        }

    }

    private void bubbleSort(int[] arr) {

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tem = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tem;
                }
            }
        }

    }


//    public static void main(String[] args) {
//
//        int arr[] = {66, 45, 77, 21, 1, 88, 99};
//        System.out.println("arr.length：" + arr.length);//7
//        bubbleSort(arr);
//
//        for (int i : arr) {
//            System.out.println("冒泡后的结果：" + i);
//        }
//    }
//
//    /**
//     * @return
//     * @Author 落笔丶
//     * @Description 冒泡排序
//     * @Date 2020/10/22 19:53
//     * @Param  需要冒泡排序的数组OR其它自定义数据
//     **/
//    private static void bubbleSort(int[] arr) {
//
//        /**
//         @Param 需要冒泡排序的数组
//         数组索引从0开始
//         */
//        //数组没数据
//        if (null == arr || arr.length < 2) {
//            return;
//        }
//
//        //数组的元素是通过索引访问的。数组索引从 0 开始，所以索引值从 0 到arr.length-1。
//        //好比数组length是7，那么数组索引就是0~6，然后，冒泡就是，0,6 1,5 2,4 比较
//        for (int end = arr.length - 1; end > 0; end--) {
//
//            for (int i = 0; i < end; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    swap(arr, i, i + 1);
//                }
//            }
//        }
//
//    }
//
//    static void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];//临时值
//        arr[i] = arr[j];//前者比后者大
//        arr[j] = tmp;//后者比前者小，往前移动
//    }
}

