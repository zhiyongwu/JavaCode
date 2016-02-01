package Tij.c8;

/**
 * Created by Administrator on 2016/1/26.
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] u = {new Useful(),new MoreUseful()};
        ((MoreUseful)u[1]).j();
        ((MoreUseful)u[0]).k();
    }
}
class Useful{
    void g(){}
    void h(){}
}
class MoreUseful extends Useful{
    @Override
    void g() {}

    @Override
    void h() {}

    void j() {}

    void k() {}
}
