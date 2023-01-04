public class BatchAdapter implements IO{

    private BatchIO batchIO;

    public BatchAdapter(BatchIO batchIO) {
        this.batchIO = batchIO;
    }

    @Override
    public void copy(String source, String destination) {
        batchIO.kopyala(source,destination);
    }

    @Override
    public void createFolder(String path) {
        batchIO.klasorOlusturma(path);
    }

    @Override
    public void createTextFile(String path) {
        batchIO.dosyaOlusturma(path);
    }
}
