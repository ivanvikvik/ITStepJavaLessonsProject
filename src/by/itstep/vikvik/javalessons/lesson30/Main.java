//package by.itstep.vikvik.javalessons.lesson30;
//
//import java.util.Scanner;
//
//class Student {
//    int mark;
//
//    int getMark(){
//        return mark;
//    }
//
//    void setMark(int mark) throws Exception {
//
//            if (mark >= 0 && mark <= 10) {
//                this.mark = mark;
//            } else {
//                throw new Exception();
//            }
//
//    }
//}
//
//public class Main extends Object {
//
//
//
////    public static void main(String[] args)  {
////try {
////    Student student = new Student();
////    student.setMark(-10);
////}catch (Exception e) {
////    MessageBox.Show("Age was wrong...");
////}
////
////        Scanner scanner = new Scanner(System.in);
////        int[] array = {3, 6, 8, 5, 3};
////
////        while (true) {
////            System.out.print("\nInput: ");
////            int index = scanner.nextInt();
////
////            if (index >= 0 && index < array.length) {
////                System.out.println("your item: " + array[index]);
////                break;
////            } else {
////               return -1;
////            }
////        }
////
////        try {
////
////        }catch(Exception e) {
////            Exception exception = e.getCause();
////            exception = exception.getCause();
////        }
//
////        while (true) {
////            try {
////                System.out.print("\nInput: ");
////                int index = scanner.nextInt();
////                System.out.println("your item: " + array[index]);
////                break;
////            } catch (ArrayIndexOutOfBoundsException e) {
////                System.out.println("Error. Try again...");
////            } catch (RuntimeException e) {
////                System.out.println("WOW. RuntimeException. Try again...");
////            }
////        }
//    }
//}
