public class Test01SortNum {
    public static void main(String[] args) {
        //���岢��ʼ��һ��int����
        int[] array = new int[args.length];

        //forѭ�����ν�args���ַ���ֵת��Ϊint����
        for(int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        print(array);
        selectsort(array);
        print(array);
    }

    //����һ�������������е�Ԫ�ش�ӡ����
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //����һ������,ʹ��ѡ������, �������С�����������
    //��һ��, �Ƚ���һ�����ͺ���������бȽ�,�����һ�����Ⱥ��������,�򽻻�
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