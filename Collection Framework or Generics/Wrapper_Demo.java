public class Wrapper_Demo {

    public static void main(String[] args) {
        Integer i1=Integer.valueOf(20);
        Integer i2=Integer.valueOf("234");
        System.out.println(i1);
        System.out.println(i2);

        int obj1=Integer.parseInt("123456");
        System.out.println(obj1);

        boolean obj2=Boolean.parseBoolean("true");
        System.out.println(obj2);

        Double i=9.58;
        System.out.println(i.intValue()); //Return the integer value.

        Integer k=66;
        String k1=k.toString();
        System.out.println(k1);

        Integer a=100;
        Integer b=100;
        System.out.println(a.equals(b)); //Equals method Compares the content or value.

        Integer c=100;
        Integer d=100;
        System.out.println(c==d);
        /// the output will be true because integer ka range jo hota h wo -127 to 128
        ///tk hota h and also primitive class maintains cache but in the case below it
        ///return false kyu ki wo range ke bhar h value.

        Integer e=1000;
        Integer f=1000;
        System.out.println(e==f);
    }
}
