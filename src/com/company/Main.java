package com.company;

public class Main {

    public static void main(String[] args) {
        ///////////Task 1///////////////
        //  int a = 1;
        //  for (int i = 0; i < 10; i++) {
        //      System.out.println(a);
        //      a = a + a;
        //  }
        ///////////Task 2///////////////
        //     for(int i = 0; i < 500; i++) {
        //      if((i % 2 == 0) && (i % 7 == 0) && (i % 3 != 0)){
        //          System.out.println(i);
        //      }
        //  }
        ///////////Task 3///////////////
        //  int counter = 0;
        //  int i = 0;
        //  do{
        //      i++;
        //      if((i > 9) && (i<100) && (i % 11 == 0)) {
        //          System.out.println(i);
        //          counter++;
        //      }
        //      if((i > 99) && (i < 1000) && (i % 47 == 0)) {
        //         System.out.println(i);
        //          counter++;
        //      }
        //  }while(counter != 25);
        ///////////Task 4///////////////
        int j = 0, check = 0, counter = 0;
        do {
            check = 0;
            j++;
            if ((j != 0) && (j != 1)) {
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println(j);
                    counter++;
                }
            }
        } while (counter != 25);
    }
}
