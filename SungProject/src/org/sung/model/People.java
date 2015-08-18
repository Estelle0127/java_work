package org.sung.model;
//한 사람의 성적 저장
public class People {
	private static int cnt=0;
	private int idx; //고유번호
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade;
	private int rank;
	public People(){
		this.idx = cnt++;
	}
	public People(int idx, String name, int kor, int eng, int mat) {

		this();		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		setData();
	}
	public void setData(){
		this.total = kor+eng+mat;
		this.avg = (double)total/3.0;
		this.grade = setGrade();
	}
	
	
	public char setGrade(){
		switch((int)avg/10){
		case 10:
		case 9 : return 'A'; 
		case 8 : return 'B';
		case 7 : return 'C';
		case 6 : return 'D';
		}
		return 'F';
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getIdx() {
		return idx;
	}
	
	@Override
	public String toString() {
		return "People [idx=" + idx + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", total="
				+ total + ", avg=" + avg + ", grade=" + grade + ", rank=" + rank + "]";
	}
}
