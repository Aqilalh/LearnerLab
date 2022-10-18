public class Student extends Person implements Learner{
    private double totalStudyTime;
    public Student(){}
    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = numberOfHours + totalStudyTime;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}

