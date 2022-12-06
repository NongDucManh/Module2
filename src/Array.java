
        public class Array {
//            public static void main(String[] args) {
//                int i = 5;
//                int j = 2;
//                int k = max(i, j);
//                System.out.println("The maximum of " + i + " and " + j + " is " + k);
//            }
//
//            public static int max(int num1, int num2) {
//                int result;
//                if (num1 > num2) {
//                    result = num1;
//                } else {
//                    result = num2;
//                }
//                return result;
//            }
public static void main(String[] args) {
    System.out.println("The grade is ");
    printGrade(70.5);

    System.out.println("The grade is ");
    printGrade(59.5);
}

            public static void printGrade(double score) {
                if (score >= 90.0) {
                    System.out.println('A');
                } else if (score >= 80.0) {
                    System.out.println('B');
                } else if (score >= 70.0) {
                    System.out.println('C');
                } else if (score >= 60.0) {
                    System.out.println('D');
                } else {
                    System.out.println('F');
                }
            }
        }
