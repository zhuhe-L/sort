package sort;

public class Insertion extends Sort {
    // 分类 ------------- 内部比较排序
    // 数据结构 ---------- 数组
    // 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
    // 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
    // 平均时间复杂度 ---- O(n^2)
    // 所需辅助空间 ------ O(1)
    // 稳定性 ------------ 稳定
    @Override
    public void sort(int arrays[]) {
        int length = arrays.length;
        int i, j;
        for (i = 1; i < length; i++) {
            int temp = arrays[i];
            for (j = i - 1; j >= 0 && temp < arrays[j]; j--) {
                //arrays[i]代表要插入的数字，aArrays[j]代表需要比较大小的数字，j递减
                //当arrays[i]大于arrays[j]时（arrays[i]插入的位置，也就是说插在j的后一位）
                // 或者arrays[i]为当前数组的最小值时（此时的j为-1,也就是说arrays[i]要插在第一位）返回j
            }
            //将arrays[i]保存住，因为要j以后的数组向后移一位
            for (int k = i; k > j + 1; k--) {
                //将i到j范围的数组向后移一位
                arrays[k] = arrays[k - 1];
            }
            //intArrays[i]插在j的后一位
            arrays[j + 1] = temp;
        }
    }
}

