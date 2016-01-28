/**
 * Created by Dmitrey on 18.01.2016.
 */
public class Product {

    private Integer articul;
    private String name;
    private String catname;
    private String photo;
    private String price;
    private Integer col;

    Product(Integer articul, String name, String catname, String photo, String price, Integer col)
    {
        this.articul = articul;
        this.name = name;
        this.catname = catname;
        this.photo = photo;
        this.price = price;
        this.col = col;
    }

    public Integer getArticul() {
        return articul;
    }

    public void setArticul(Integer articul) {
        this.articul = articul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
}
