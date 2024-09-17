// default package
// Generated Jul 11, 2013 4:54:55 PM by Hibernate Tools 4.0.0

/**
 * Projects generated by hbm2java
 */
public class Projects implements java.io.Serializable {

	private Integer projectId;
	private Student student;
	private String title;
	private String semester;

	public Projects() {
	}

	public Projects(Student student, String title, String semester) {
		this.student = student;
		this.title = title;
		this.semester = semester;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

}