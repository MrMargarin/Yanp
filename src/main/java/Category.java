import java.util.HashSet;

/**
 * Created by Dmitrey on 23.01.2016.
 */
public class Category {

    private String name;
    private String URL;
    private Category parent;
    private HashSet<Category> childs;
    private String level;
    private Products products;

    Category()
    {
        setName("carname");
        setURL("");
        setLevel("");
        setParent(null);
        setChilds(new HashSet());
    }

    Category(String name, String URL, String level)
    {
        this.setName(name);
        this.setURL(URL);
        this.setLevel(level);
        setParent(null);
        setChilds(new HashSet());
        setProducts(new Products(getName()));
    }



    Category(String name, String URL, Category parent, String level)
    {
        this.setName(name);
        this.setURL(URL);
        this.setLevel(level);
        this.setParent(null);
        setChilds(new HashSet());
    }

    public void addChild(Category ch)
    {
        ch.setParent(this);
        getChilds().add(ch);
    }

    public boolean removeCh(Category ch)
    {
        return getChilds().remove(ch);
    }


    public HashSet<Category> getChilds() {
        return childs;
    }

    public void setChilds(HashSet childs) {
        this.childs = childs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String fullcatname()
    {
        String res = (getParent()!=null ? getParent().fullcatname() : "") + "/" + getName();
        return res;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
