import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "items")
public class items {
    private List<item> item;

    @XmlElement(name = "item")
    public List<item> getItem(){
        return item;
    }

    public void setItem(List<item> itemList){
        this.item = itemList;
    }
}