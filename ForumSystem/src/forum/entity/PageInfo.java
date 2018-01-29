package forum.entity;

import java.util.List;

public class PageInfo<T> {
	private Integer currentPage;//当前页号
	private Integer pageSize;//每页显示的条数
	private Integer totalPage;//总页数
	private Integer total;//符合条件的总记录数
	private T condition;//查询条件
	private List<T> rows;//查询到的当前页的集合
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPage() {
		this.totalPage=this.total%this.pageSize==0?this.total/this.pageSize:this.total/this.pageSize+1;
		return totalPage;
	}
	
	public T getCondition() {
		return condition;
	}
	public void setCondition(T condition) {
		this.condition = condition;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	

}
