package ru.skyeng;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        for (;i >0;i--){
            if (i==1){
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }
int firstFriday = 2;
        for (;firstFriday <=31;firstFriday +=7){
            System.out.println(" Сегодня пятница " + firstFriday + " число." + " Необходимо подготовить отчет.");
        }
int currenYear = 2022;
        int beginning = currenYear - 200;
        int ending = currenYear + 100;
        for (int j = beginning; j < ending; j++){
            if (j % 79 == 0){
                System.out.println(j);
            }
        }

    }
}





