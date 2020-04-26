package com.hank;


import com.hank.kotlin.Student;

public class Hello {
    public static void main(String[] args) {
        Student stu = new Student("Hank",50,60);
//        stu.
//        System.out.println("Hello world");
//        new Person().hello();
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Tom",66.5f,1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 'a');
        //基本資料型態
        /*int age = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        //參照資料型態
        Integer age2 = 19;
        Character c2 = 'A';
        String name = "Tom";*/
    }
}
