package day_two.Model.filter;

import day_two.Model.Media;
import day_two.Model.enums.Category;

import java.util.ArrayList;

public class CategoryFilter implements MediaFilter {
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CategoryFilter(Category category) {
        this.category = category;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> videos) {
        ArrayList<Media> temp = new ArrayList<>();
        for (Media m : videos)
            if (m.getCategories().contains(category))
                temp.add(m);
        return temp;
    }
}
