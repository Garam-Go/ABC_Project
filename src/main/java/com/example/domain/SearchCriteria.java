package com.example.domain;

public class SearchCriteria extends Criteria{	//Criteria를 상속한다(Criteria안에 함수 모두 사용가능)
	private String searchType;	//key
	private String keyword;		//word
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
}
