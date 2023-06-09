package com.shopme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.shopme.common.Constants;


@Entity
@Table(name = "banners")
public class Banner extends IdBasedEntity{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;


    @Column(nullable = false, length = 256)
    private String banner;

    @Column(nullable = false, length = 512)
    private String title;

    @Column(length = 512, nullable = false)
    private String description;

    @Column(nullable = false, length = 8)
    private String price;
    

    @Column(length = 512, nullable = false)
    private String link;
    
    private boolean enabled;

    public Banner() {
    }

    public Banner(Integer id) {
        this.id = id;
    }

    public String getBanner() {
        return banner;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    public Banner(String banner, String title, String description, String price, String link, boolean enabled) {
	super();
	this.banner = banner;
	this.title = title;
	this.description = description;
	this.price = price;
	this.link = link;
	this.enabled = enabled;
}

    
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Transient
    public String getBannerPath(){
        if (id == null || banner == null) return "/images/default_banner.png";
        return Constants.S3_BASE_URI + "/banners/" + this.id + "/" + this.banner;
    }

	@Override
	public String toString() {
		return "Banner [banner=" + banner + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", link=" + link + ", enabled=" + enabled + "]";
	}

   
}