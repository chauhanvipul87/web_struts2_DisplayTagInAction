package com.javatechknowledge;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class DisplayTagAction extends ActionSupport {
	
	private List<ListObject> lst;

	public String execute() {
		System.out.println("in executation...");
		lst = new ArrayList<ListObject>();
		for(int i=0;i<10;i++){
			lst.add(new ListObject());
		}
		System.out.println("lst "+lst);
		return "success";
	}

	public List<ListObject> getLst() {
		return lst;
	}

	public void setLst(List<ListObject> lst) {
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "DisplayTagAction [lst=" + lst + "]";
	}

	
}