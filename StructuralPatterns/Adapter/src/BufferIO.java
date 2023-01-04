public class BufferIO implements IO{
    @Override
    public void copy(String source, String destination) {
        System.out.println("copied to " + destination + " from " + source + " BufferIO");
    }

    @Override
    public void createFolder(String path) {
        System.out.println(path + " created folder(BufferIO)");
    }

    @Override
    public void createTextFile(String path) {
        System.out.println(path + " created text(BufferIO)");
    }
}
