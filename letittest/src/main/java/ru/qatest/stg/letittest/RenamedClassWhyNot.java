package ru.qatest.stg.letittest;

public class RenamedClassWhyNot<h> {
    public static void main(String[] args) {
        testFunc("FAKA");
        testFunc("FACA");
        testFunc("FAKKA");
        testFunc("FAKHA");
        testFunc("FAHKA");

        Kvadrat s= new Kvadrat(6);
        System.out.println("Площ квадр со стор " + s.l + " = " + s.plosh());


        Pryamoug d= new Pryamoug(4,8);
        System.out.println("Площ прямоуг со сторонами " + d.a + " и " + d.b + " = " + d.plosh());



        Point p = new Point(4.4,6.6);
        System.out.println ("Расстояния между точками p1 и p2 с координатами " + "x1 = " + p.p3 + ", x2 = " + p.p4 + ", y1 = " + p.p1%1 + ", y2 =" +p.p2%1 + " = " + p.distance());

        PointTwo p1=new PointTwo(4, 4);
        PointTwo p2= new PointTwo(6, 6);
        System.out.println(
                "Расстояния между точками p1 и p2 с координатами " + "x1 = " + p1.x + ", x2 = " + p2.x + ", y1 = " + p1.y + ", y2 =" + p2.y + " = " + p1.distanceTwo(p2));


        PointThree p3= new PointThree(4,4);
        PointThree p4= new PointThree(6,6);
        System.out.println(
                "Расстояния между точками p3 и p4 с координатами " + "x1 = " + p3.x + ", x2 = " + p4.x + ", y1 = " + p3.y + ", y2 =" + p4.y + " = " + p3.distanceThree(p4));



    }



    public static void testFunc(String text1) {

        System.out.println("MAZA " + text1 + " ?");
    }

}

