package name.jnsmith.patterns.creational.factory;

import static name.jnsmith.patterns.creational.factory.WebsiteType.*;

public class FactoryDemo {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(BLOG);

        if (website != null) {
            System.out.println(website.getPages());
        }

        website = WebsiteFactory.getWebsite(SHOP);

        System.out.println(website != null ? website.getPages() : null);

    }
}
