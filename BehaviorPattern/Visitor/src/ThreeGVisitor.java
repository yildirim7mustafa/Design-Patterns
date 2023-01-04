import javax.swing.*;

public class ThreeGVisitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof GalaxyTab){
            System.out.println("3G açıldı");
        } else if (tablet instanceof Ipad) {
            System.out.println("Ipad 3G ye sahip değil.");
        }else {
            System.out.println("Cihaz sistemde kayıtlı değil.");
        }
    }
}
