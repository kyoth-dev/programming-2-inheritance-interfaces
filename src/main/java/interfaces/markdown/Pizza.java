
package interfaces.markdown;

import java.util.List;

public class Pizza implements MarkdownExport {

    private String name;
    private double price;
    private List<String> toppings;

    public Pizza(String name, double price, List<String> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String exportMarkdown() {
        StringBuilder result = new StringBuilder();

        result.append("# ").append(name).append("\n\n");
        result.append("Toppings:\n");

        for (String topping : toppings) {
            result.append("- ").append(topping).append("\n");
        }

        result.append("\nPrice: ")
              .append(String.format(java.util.Locale.US, "%.2f", price));

        return result.toString();
    }
}
