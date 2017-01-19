package fr.upem.jee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class History {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private final Integer id;
	
	@Column(name="user")
	private User user;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="type")
	private SearchType type;
	
	@Column(name="search")
	private String search;
	
	@Column(name="range")
	private Integer range;
	
	@Column(name="bookmarked")
	private Boolean bookmarked;

	public History(Integer id, User user, Date date, SearchType type, String search, Integer range,
			Boolean bookmarked) {
		super();
		this.id = id;
		this.user = user;
		this.date = date;
		this.type = type;
		this.search = search;
		this.range = range;
		this.bookmarked = bookmarked;
	}

	public Integer getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public Date getDate() {
		return date;
	}

	public SearchType getType() {
		return type;
	}

	public String getSearch() {
		return search;
	}

	public Integer getRange() {
		return range;
	}

	public Boolean getBookmarked() {
		return bookmarked;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setType(SearchType type) {
		this.type = type;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public void setBookmarked(Boolean bookmarked) {
		this.bookmarked = bookmarked;
	}

}
