import java.io.File;
import java.util.List;

public class DirectoryItem extends AbstractItem{

    private List<AbstractItem> chil;

    public DirectoryItem(String name, List<AbstractItem> chil) {
        super(name);
        this.chil = chil;
    }

    @Override
    public void print(String parePath) {
        for(AbstractItem ch : chil) {
            ch.print(parePath + File.separator + name);
            ch.print(ch.name);
        }
    }
}
