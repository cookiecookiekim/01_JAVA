package com.ohgiraffers.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

        public static void main(String[] args) {

        BookDTO bookDto = new BookDTO();

        List list = new ArrayList<>();

        list.add(0, new BookDTO(1, "가나다", "김규남", 34000));
        list.add(1, new BookDTO(3, "라마바", "이규남", 24000));
        list.add(2, new BookDTO(4, "사아자", "박규남", 37000));
        list.add(3, new BookDTO(5, "차카하", "오규남", 15000));

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " = " + list.get(i));
        }

            Scanner scr = new Scanner(System.in);
            System.out.print("책 번호는? : ");
            int number = scr.nextInt();

            scr.nextLine(); // 원활한 줄바꿈
            System.out.print("책 이름은? : ");
            String name = scr.nextLine();

            System.out.print("책 저자는? : ");
            String master = scr.nextLine();

            System.out.print("책 가격은? : ");
            int price = scr.nextInt();

            list.add(1, new BookDTO(number, name, master, price)); // BookDTO를 호출과 동시에 입력 값을 보내줘야...

            for (Object a : list) {
                System.out.println(a);
            }
    }
}
