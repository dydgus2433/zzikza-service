package com.zzikza.springboot.web.domain.studio;
import com.zzikza.springboot.web.domain.product.Product;

import java.util.List;
public class Studio {
    String studioName;
    int fee;
    //studios - studioSearchKeywords - searchKeywords
    List<SearchKeyword> searchKeywords;
    //studio - products
    List<Product> products;
    //studio - studioFiles
    List<StudioFile> studioFiles;
    //studio/admin - / studioBards/ - Boards
    List<Board> studioBoards;
    //studios - studioSearchCategories - searchCategories
    List<SearchCategory> searchCategories;

}
