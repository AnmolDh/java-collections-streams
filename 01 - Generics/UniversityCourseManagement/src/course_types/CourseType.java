package course_types;
import evaluation_types.EvaluationType;

public abstract class CourseType<T extends EvaluationType> {
    protected T evaluationType;

    public CourseType(T evaluationType) {
        this.evaluationType = evaluationType;
    }


}
