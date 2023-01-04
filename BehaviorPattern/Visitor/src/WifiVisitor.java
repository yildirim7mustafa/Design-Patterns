public class WifiVisitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof Ipad) {
            System.out.println("Ipad wifi açıldı");
        } else if (tablet instanceof GalaxyTab) {
            System.out.println("GalaxyTab wifi'ye sahip değil.");
        }else {
            System.out.println("Cihaz sistemde kayıtlı değil");
        }
    }
}
