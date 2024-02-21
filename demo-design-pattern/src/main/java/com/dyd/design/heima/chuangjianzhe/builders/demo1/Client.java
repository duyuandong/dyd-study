package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/18 17:44
 * @description：
 *
 *  抽象建造者类(Builder): 这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体的对象部件的创建·
 *  具体建造者类(ConcxeteBuilder):实现 Builder 接口，完成复杂产品的各个部件的具体创建方法，在构造过程完成后，提供产品的实例。
 *  产品类 (Product] : 要创建的复杂对象。
 *  指挥者类(Directox):调用是体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 *
 *  优点:
 *      建造者横式的封装性很好，使用建浩者模式可以有效的封装变化，在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻组封装在指挥者类中对整体而言可以取得比较好的稳定性。
 *      在建浩者校式中，客户端不必知道产品内部组成的的细节，将产品本身与产品的创建过程解糊，使得相同的创建过程可以创理不同的产品对象。
 *      可以更加精细地控制产品的创建过程 ，将复杂产品的创理步察分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。
 *      建造者槽式很客易进行扩展。如果有新的赛求，通过实现一个新的德洁者半就可以完成，甚本上不用恪改之前已经测试通过的代码因此也就不会对原有功能引入风险。符合开闭原则，
 *  缺点:
 *      造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范国受到一定的限制。
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //Director director = new Director(new MobikeBuilder());
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
