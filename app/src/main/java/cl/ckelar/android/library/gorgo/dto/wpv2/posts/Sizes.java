
package cl.ckelar.android.library.gorgo.dto.wpv2.posts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("medium_large")
    @Expose
    private MediumLarge mediumLarge;
    @SerializedName("widget")
    @Expose
    private Widget widget;
    @SerializedName("square")
    @Expose
    private Square square;
    @SerializedName("featured")
    @Expose
    private Featured featured;
    @SerializedName("featured_large")
    @Expose
    private FeaturedLarge featuredLarge;
    @SerializedName("portfolio")
    @Expose
    private Portfolio portfolio;
    @SerializedName("portfolio_small")
    @Expose
    private PortfolioSmall portfolioSmall;
    @SerializedName("gallery")
    @Expose
    private Gallery gallery;
    @SerializedName("magazine")
    @Expose
    private Magazine magazine;
    @SerializedName("masonry")
    @Expose
    private Masonry masonry;
    @SerializedName("entry_with_sidebar")
    @Expose
    private EntryWithSidebar entryWithSidebar;
    @SerializedName("entry_without_sidebar")
    @Expose
    private EntryWithoutSidebar entryWithoutSidebar;
    @SerializedName("shop_thumbnail")
    @Expose
    private ShopThumbnail shopThumbnail;
    @SerializedName("shop_catalog")
    @Expose
    private ShopCatalog shopCatalog;
    @SerializedName("shop_single")
    @Expose
    private ShopSingle shopSingle;
    @SerializedName("full")
    @Expose
    private Full full;

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public MediumLarge getMediumLarge() {
        return mediumLarge;
    }

    public void setMediumLarge(MediumLarge mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Featured getFeatured() {
        return featured;
    }

    public void setFeatured(Featured featured) {
        this.featured = featured;
    }

    public FeaturedLarge getFeaturedLarge() {
        return featuredLarge;
    }

    public void setFeaturedLarge(FeaturedLarge featuredLarge) {
        this.featuredLarge = featuredLarge;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public PortfolioSmall getPortfolioSmall() {
        return portfolioSmall;
    }

    public void setPortfolioSmall(PortfolioSmall portfolioSmall) {
        this.portfolioSmall = portfolioSmall;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Masonry getMasonry() {
        return masonry;
    }

    public void setMasonry(Masonry masonry) {
        this.masonry = masonry;
    }

    public EntryWithSidebar getEntryWithSidebar() {
        return entryWithSidebar;
    }

    public void setEntryWithSidebar(EntryWithSidebar entryWithSidebar) {
        this.entryWithSidebar = entryWithSidebar;
    }

    public EntryWithoutSidebar getEntryWithoutSidebar() {
        return entryWithoutSidebar;
    }

    public void setEntryWithoutSidebar(EntryWithoutSidebar entryWithoutSidebar) {
        this.entryWithoutSidebar = entryWithoutSidebar;
    }

    public ShopThumbnail getShopThumbnail() {
        return shopThumbnail;
    }

    public void setShopThumbnail(ShopThumbnail shopThumbnail) {
        this.shopThumbnail = shopThumbnail;
    }

    public ShopCatalog getShopCatalog() {
        return shopCatalog;
    }

    public void setShopCatalog(ShopCatalog shopCatalog) {
        this.shopCatalog = shopCatalog;
    }

    public ShopSingle getShopSingle() {
        return shopSingle;
    }

    public void setShopSingle(ShopSingle shopSingle) {
        this.shopSingle = shopSingle;
    }

    public Full getFull() {
        return full;
    }

    public void setFull(Full full) {
        this.full = full;
    }

}
