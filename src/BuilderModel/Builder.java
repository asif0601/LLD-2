package BuilderModel;

import BuilderModel.Helper.Helper;
import BuilderModel.Student.StudentDetails;

public class Builder {
    public static void main(String[] args) {
        // builder using helper
        // we are creating new object
        // after that we will use it
        Helper helper = new Helper("Asif", 25, "Rza");



        // we are creating static class object but that will discard
        // we are only creating studentDetails object only
        // more readable object if number of params are more then it useFul
        StudentDetails student = new StudentDetails.Builder()
                                                .setFirstName("Asif")
                                                .setAge(20)
                                                .build();
    }
}
