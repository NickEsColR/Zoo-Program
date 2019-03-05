package model;

public class Date
{
	
	//attributes
	
	private int day;
	private int month;
	private int year;
	
	//metodo
	
	public Date(int day, int month, int year){
	  this.day = day;
	  this.month = month;
	  this.year = year;
	}
	
	public int getDay(){
	  return day;
	}
	
	public void setDay(int d){
	  day = d;
	}
	
	public int getMonth(){
	  return month;
	}
	
	public void setMonth(int m){
	  month = m;
	}
	
	public int getYear(){
	  return year;
	}
	
	public void setYear(int y){
	  year = y;
	}
	public void plusYear(){
		year ++;
	}
}