package org.example;

public class Main {
    {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);


    }

    {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    {
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 9;
        System.out.println("friend = " + friend);
    }
    {   var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);
    }
    {  var first_boxer = 78.2;
       var second_boxer = 82.7;
       System.out.println("Сумма веса" + (first_boxer + second_boxer));
       System.out.println("Разница веса" + (second_boxer - first_boxer));
       System.out.println("Остаток от деления" + (second_boxer % first_boxer));
    }
    { var time = 640;
    var work_time = 8;
    var people = time / work_time;
    System.out.println("Работников в компании - " + people + "Человек");

    people += 94;
    var new_time = people * work_time;
    System.out.println("Если в компании работает" + people +
            "Человек, то всего"+ new_time +"часов работы может быть поделено между сотрудниками");
    }

}