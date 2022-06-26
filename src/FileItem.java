public class FileItem extends AbstractItem{

    public FileItem(String name) {
        super(name);
    }

    @Override
    public void print(String parePath) {
        System.out.println(parePath);
    }
}
