public class NoBufferIO implements IO{
    @Override
    public void copy(String source, String destination) {
        System.out.println("copied to " + destination + " from " + source + "NoBufferIO");
    }

    @Override
    public void createFolder(String path) {
        System.out.println(path + " created folder(NoBufferIO)");
    }

    @Override
    public void createTextFile(String path) {
        System.out.println(path + " created text(NoBufferIO)");
    }
}
