public class practic5Third {
    public static void main (String [] args) {
                int[][] arr = {{ 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }};

                summArray(arr);
                umnojenieArray(arr);
                razArray(arr);
            }
            public static int summArray(int[][] array) {
                int summ = 0;
                for(int i=0; i<array.length; i++){
                    for(int j=0; j<array.length; j++){
                        summ += array[i][j];
                    }
                }
                System.out.println("Общая сумма всех элементов массива равна: "+summ);
                return summ;
            }
            public static int umnojenieArray(int[][] array) {
                int umnoj = 1;
                for(int i=0; i<array.length; i++){
                    for(int j=0; j<array.length; j++){
                        umnoj *= array[i][j];
                    }
                }
                System.out.println("Умножение всех элементов массива равна: "+umnoj);
                return umnoj;
            }
            public static int razArray(int[][] array) {
                int raz = 0;
                for(int i=0; i<array.length; i++){
                    for(int j=0; j<array.length; j++){
                        raz -= array[i][j];
                    }
                }
                System.out.println("Разность всех элементов массива равна: "+raz);
                return raz;
            }
        }
