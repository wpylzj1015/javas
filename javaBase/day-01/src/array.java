public class array {
    public static void main(String[] args) {
//        初始化静态数组
        int[] array = new int[]{1, 3, 4};
        System.out.println(array);

//        初始化动态数组
        int[] array2 = new int[30];
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        int[] zhandou = new int[]{33, 5, 22, 44, 55};
        for (int i = 0; i < zhandou.length; i++) {
            if (zhandou[0] > zhandou[i]) zhandou[0] = zhandou[i];
        }
        System.out.println("最小战力是:" + zhandou[0]);
    }

}
