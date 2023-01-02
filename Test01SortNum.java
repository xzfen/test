public class Test01SortNum {
    public static void main(String[] args) {
        //定义并初始化一个int数组
        int[] array = new int[args.length];

        //for循环依次将args的字符串值转化为int数组
        for(int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        print(array);
        selectsort(array);
        print(array);
    }

    //定义一个函数将数组中的元素打印出来
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //定义一个函数,使用选择排序法, 将数组从小到大进行排序
    //第一次, 先将第一个数和后面的数进行比较,如果第一个数比后面的数大,则交换
    public static void selectsort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}