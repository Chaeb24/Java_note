public class study_1 {
        public static void main(String[] args) {
            float[] array = {1.1f, 2.3f, 4.7f, 7.5f};
            double[] arr = new double[4];

            for(int i=0; i<4;i++)
            {
                System.out.println(array[i]);
                arr[i] = array[i];
                System.out.println(arr[i]);
            }


        }
    }
