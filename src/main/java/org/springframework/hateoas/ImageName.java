package org.springframework.hateoas;

/**
*
* @since Haussmann Phase 1
*
*/
public enum ImageName {

    OWN("own"),

    FALLBACK("fallback"),

    DEFAULT("default");

    private String name;

    private ImageName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ImageName valueByName(String name) {
        for (ImageName imageName : values()) {
            if (imageName.name.equals(name)) {
                return imageName;
            }
        }
        return null;
    }
}
