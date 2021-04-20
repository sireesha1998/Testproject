package day6;


import java.io.Serializable;

public class Batsman implements Serializable{
	int id;
	String name;
	int innings;
	int totalruns;
	public Batsman(int id, String name, int innings, int totalruns) {
		super();
		this.id=id;
		this.name=name;
		this.innings=innings;
		this.totalruns=totalruns;
	}
	public int getid() {
		return id;
	}
	public void setBookNo(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getinnings() {
		return innings;
	}
	public void setinnings(int innings) {
		this.innings = innings;
	}
	public int gettotalruns() {
		return totalruns;
	}
	public void settotalruns(int totalruns) {
		this.totalruns = totalruns;
	}
	@Override
	public String toString() {
		return "Batsman [id=" + id + ", name=" + name + ", innings=" + innings + ", totalruns=" + totalruns + "]";
	}
	

}