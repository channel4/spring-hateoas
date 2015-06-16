package org.springframework.hateoas;

public enum MediaType {

    IMAGE_JPEG("image/jpeg"), IMAGE_PNG("image/png");

    private String contentType;

    private MediaType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public static MediaType valueByContentType(String contentType) {
        for (MediaType mediaType : values()) {
            if (mediaType.contentType.equals(contentType)) {
                return mediaType;
            }
        }
        return null;
    }
}
