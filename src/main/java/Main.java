import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    final static String mainURL = "http://www.rustools.ru";

    public static void main(String[] args) throws IOException {

        ArrayList<Category> cats = new ArrayList<Category>();

        //=============================sup_cat-block=================================================
        Document doc = Jsoup.connect(mainURL).get();
        String lvl = "td.level0";
        Elements prds = doc.select(lvl);

        for(Element tmpRooTcat : prds)
            cats.add(new Category(tmpRooTcat.child(0).text(), tmpRooTcat.child(0).attr("abs:href"), lvl));

        //=============================sub_cat-block=================================================
        for(Category tmpSuPcat : cats)
        {

            //doc = Jsoup.connect(mainURL.concat(tmpSuPcat.getURL())).get();
            doc = Jsoup.connect(tmpSuPcat.getURL()).get();
            lvl = "td.level1";
            prds = doc.select(lvl);

            for(Element tmpSuBcat : prds)
                tmpSuPcat.addChild(new Category(tmpSuBcat.child(0).text(), tmpSuBcat.child(0).attr("abs:href"), lvl));

        }
//cats.forEach();
        System.out.println("subsub stage fetchin...");
        //=============================sup_cat-block=================================================
        for(Category tmpcat : cats)
        {
            for(Category tmpScat : tmpcat.getChilds())
            {
//                doc = Jsoup.connect(mainURL.concat(tmpScat.getURL())).get();
                doc = Jsoup.connect(tmpScat.getURL()).get();
                lvl = "td.level2";
                prds = doc.select(lvl);

                for (Element tmpSuBBcat : prds)
                    tmpScat.addChild(new Category(tmpSuBBcat.child(0).text(), tmpSuBBcat.child(0).attr("abs:href"), lvl));
            }

        }


        //=============================adding_new_prods==============================================
        for(Category rootCat : cats)
        {
            for(Category lv1cat : rootCat.getChilds())
            {
                for(Category lv2cat : lv1cat.getChilds())
                {
                    //doc = Jsoup.connect(mainURL.concat(lv2cat.getURL())).get();
                    doc = Jsoup.connect(lv2cat.getURL()).get();
                    lvl = "tr.light";
                }
            }
        }





        //=============================test_area=====================================================






        System.out.println("=======sometextforbreakpoint==========");

    }
}
