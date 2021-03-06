package day19_Map.demo2;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score - o.score;
	}
}
